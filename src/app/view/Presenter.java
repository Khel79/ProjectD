package app.view;

import javafx.stage.Stage;
import app.model.Model;

public class Presenter {
    private View view;
    private Model model;
    private Stage primaryStage;

    public Presenter(View view, Model model, Stage primaryStage) {
        this.view = view;
        this.model = model;
        this.primaryStage = primaryStage;

        initialiseEventHandling();
    }

    private void initialiseEventHandling() {
        view.getTopMenu().getGameMenuItemExitGame().setOnAction(e -> exitGameAction());
    }

    private void exitGameAction() {
        primaryStage.close();
    }
}
