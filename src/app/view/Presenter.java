package app.view;

import app.model.enums.TerrainImage;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
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
        int h = view.getLayerPane()[0].length;
        int w = view.getLayerPane().length;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                view.getLayerPane()[i][j].setOnMouseClicked(this::tileClickedAction);
            }
        }
    }

    private void tileClickedAction(MouseEvent e) {
        if (e.getButton() == MouseButton.PRIMARY) {
            // perform left-click action
            System.out.println("GRID: You left-clicked. Source: " + e.getSource().toString() + " and Target: " + e.getTarget().toString());
            ((StackPane) e.getSource()).getChildren().remove(0);
        }
        if (e.getButton() == MouseButton.SECONDARY) {
            // perform right-click action
            System.out.println("GRID: You right-clicked. Source: " + e.getSource().toString() + " and Target: " + e.getTarget().toString());
            ((StackPane) e.getSource()).getChildren().add(0, view.setTerrainLayer(TerrainImage.STONE));
        }
    }

    private void exitGameAction() {
        primaryStage.close();
    }
}
