package app.view;

import app.model.enums.Difficulty;
import app.model.enums.TerrainImage;
import javafx.event.Event;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import app.model.Model;

@SuppressWarnings("FieldCanBeLocal")
public class Presenter {
    private View view;
    private Model model;
    private Stage primaryStage;

    public Presenter(View view, Model model, Stage primaryStage) {
        this.view = view;
        this.model = model;
        this.primaryStage = primaryStage;

        initialiseGameBoardEventHandling();
        initialiseTopMenuEventHandling();
    }

    public void init() {
        // bind the preferred size of the scroll area to the size of the scene.
        view.getScrollPane().prefWidthProperty().bind(primaryStage.getScene().widthProperty());
        view.getScrollPane().prefHeightProperty().bind(primaryStage.getScene().widthProperty());
    }

    private void initialiseTopMenuEventHandling() {
        view.getTopMenu().getGameMenuItemNewGame().setOnAction(e -> newGameAction());
        view.getTopMenu().getGameMenuItemLoadGame().setOnAction(e -> loadGameAction());
        view.getTopMenu().getGameMenuItemSaveGame().setOnAction(e -> saveGameAction());
        view.getTopMenu().getGameMenuItemQuitGame().setOnAction(e -> quitGameAction());
        view.getTopMenu().getGameMenuItemExitGame().setOnAction(e -> exitGameAction());

        view.getTopMenu().getOptionsCheckMenuItemMusic().setOnAction(e -> toggleMusicAction());
        view.getTopMenu().getOptionsCheckMenuItemSound().setOnAction(e -> toggleSoundAction());

        view.getTopMenu().getOptionsMenuItemShowRules().setOnAction(e -> showRulesAction());
        view.getTopMenu().getOptionsMenuItemShowTips().setOnAction(e -> showTipsAction());

        view.getTopMenu().getOptionsRadioMenuItemDifficultyEasy().setOnAction(e -> changeDifficultyAction(Difficulty.EASY));
        view.getTopMenu().getOptionsRadioMenuItemDifficultyNormal().setOnAction(e -> changeDifficultyAction(Difficulty.NORMAL));
        view.getTopMenu().getOptionsRadioMenuItemDifficultyHard().setOnAction(e -> changeDifficultyAction(Difficulty.HARD));
    }

    private void initialiseGameBoardEventHandling() {
        int h = view.getCenterMap().getLayerPane()[0].length;
        int w = view.getCenterMap().getLayerPane().length;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                view.getCenterMap().getLayerPane()[i][j].setOnMouseClicked(this::tileClickedAction);
            }
        }
    }

    private void tileClickedAction(MouseEvent e) {
        // Idea is to use L-click for selection
        if (e.getButton() == MouseButton.PRIMARY) {
            leftClickOnTileAction(e);

        }
        // Idea is to use R-click for movement
        if (e.getButton() == MouseButton.SECONDARY) {
            rightClickOnTileAction(e);        }
    }

    private void leftClickOnTileAction(Event e) {
        System.out.println("GRID: You left-clicked. Source: " + e.getSource().toString() + " and Target: " + e.getTarget().toString());
        ((StackPane) e.getSource()).getChildren().get(0).setVisible(false);
    }

    private void rightClickOnTileAction(Event e) {
        System.out.println("GRID: You right-clicked. Source: " + e.getSource().toString() + " and Target: " + e.getTarget().toString());
        ((StackPane) e.getSource()).getChildren().get(0).setVisible(true); // add(0, view.getCenterMap().setTerrainLayer(TerrainImage.STONE));
    }


    /**
     * TODO:
     */
    private void newGameAction(){

    }

    /**
     * TODO:
     */
    private void loadGameAction() {

    }

    /**
     * TODO:
     */
    private void saveGameAction() {

    }

    /**
     * TODO:
     */
    private void quitGameAction() {

    }

    private void exitGameAction() {
        primaryStage.close();
    }

    /**
     * TODO:
     */
    private void showRulesAction(){

    }

    /**
     * TODO:
     */
    private void showTipsAction(){

    }

    /**
     * TODO:
     */
    private void toggleMusicAction(){

    }

    /**
     * TODO:
     */
    private void toggleSoundAction(){

    }

    /**
     * TODO:
     */
    private void changeDifficultyAction(Difficulty difficulty){
        /**
        switch (difficulty) {
            case Difficulty.EASY: ; break;
            case "NORMAL": ; break;
            case "HARD": ; break;
        } */
    }
}
