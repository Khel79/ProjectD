package app;

import app.view.Presenter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import app.model.Model;
import app.view.View;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        int gridSize = 32;
        View view = new View(gridSize);
        Model model = new Model();
        Presenter presenter = new Presenter(view, model, primaryStage);

        primaryStage.setTitle("Test");
        primaryStage.setScene(new Scene(view, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
