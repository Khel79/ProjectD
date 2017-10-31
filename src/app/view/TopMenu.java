package app.view;

import javafx.scene.control.*;

@SuppressWarnings("FieldCanBeLocal")
public final class TopMenu extends MenuBar {

    private Menu gameMenu;
    private Menu optionsMenu;
    private Menu optionsMenuDifficulty;

    private MenuItem gameMenuItemNewGame;
    private MenuItem gameMenuItemLoadGame;
    private MenuItem gameMenuItemSaveGame;
    private MenuItem gameMenuItemQuitGame;
    private MenuItem gameMenuItemExitGame;

    private MenuItem optionsMenuItemShowRules;
    private MenuItem optionsMenuItemShowTips;

    private CheckMenuItem optionsCheckMenuItemMusic;
    private CheckMenuItem optionsCheckMenuItemSound;

    private RadioMenuItem optionsRadioMenuItemDifficultyEasy;
    private RadioMenuItem optionsRadioMenuItemDifficultyNormal;
    private RadioMenuItem optionsRadioMenuItemDifficultyHard;

    private ToggleGroup toggleGroupDifficulty;


    TopMenu() {
        gameMenu = new Menu("_Game");
        optionsMenu = new Menu("_Options");
        optionsMenuDifficulty = new Menu("_Difficulty");

        gameMenuItemNewGame = new MenuItem("_New game");
        gameMenuItemLoadGame = new MenuItem("_Load game");
        gameMenuItemSaveGame = new MenuItem("_Save game");
        gameMenuItemQuitGame = new MenuItem("_Quit game");
        gameMenuItemQuitGame = new MenuItem("_Quit game");
        gameMenuItemExitGame = new MenuItem("_Exit game");

        optionsMenuItemShowRules = new MenuItem("Show _rules");
        optionsMenuItemShowTips = new MenuItem("Show _tips");

        optionsCheckMenuItemMusic = new CheckMenuItem("_Music");
        optionsCheckMenuItemSound = new CheckMenuItem("_Sound");

        optionsRadioMenuItemDifficultyEasy = new RadioMenuItem("_Easy");
        optionsRadioMenuItemDifficultyNormal = new RadioMenuItem("_Normal");
        optionsRadioMenuItemDifficultyHard = new RadioMenuItem("_Hard");

        toggleGroupDifficulty = new ToggleGroup();
        optionsRadioMenuItemDifficultyEasy.setToggleGroup(toggleGroupDifficulty);
        optionsRadioMenuItemDifficultyNormal.setToggleGroup(toggleGroupDifficulty);
        optionsRadioMenuItemDifficultyHard.setToggleGroup(toggleGroupDifficulty);

        optionsMenuDifficulty.getItems().addAll(optionsRadioMenuItemDifficultyEasy, optionsRadioMenuItemDifficultyNormal, optionsRadioMenuItemDifficultyHard);
        gameMenu.getItems().addAll(gameMenuItemNewGame, gameMenuItemLoadGame, gameMenuItemSaveGame, gameMenuItemQuitGame, new SeparatorMenuItem(), gameMenuItemExitGame);
        optionsMenu.getItems().addAll(optionsCheckMenuItemMusic, optionsCheckMenuItemSound, new SeparatorMenuItem(), optionsMenuDifficulty, new SeparatorMenuItem(), optionsMenuItemShowRules, optionsMenuItemShowTips);

        this.getMenus().addAll(gameMenu, optionsMenu);
    }

    public MenuItem getGameMenuItemNewGame() {
        return gameMenuItemNewGame;
    }

    public MenuItem getGameMenuItemLoadGame() {
        return gameMenuItemLoadGame;
    }

    public MenuItem getGameMenuItemSaveGame() {
        return gameMenuItemSaveGame;
    }

    public MenuItem getGameMenuItemQuitGame() {
        return gameMenuItemQuitGame;
    }

    public MenuItem getGameMenuItemExitGame() {
        return gameMenuItemExitGame;
    }

    public MenuItem getOptionsMenuItemShowRules() {
        return optionsMenuItemShowRules;
    }

    public MenuItem getOptionsMenuItemShowTips() {
        return optionsMenuItemShowTips;
    }

    public CheckMenuItem getOptionsCheckMenuItemMusic() {
        return optionsCheckMenuItemMusic;
    }

    public CheckMenuItem getOptionsCheckMenuItemSound() {
        return optionsCheckMenuItemSound;
    }

    public RadioMenuItem getOptionsRadioMenuItemDifficultyEasy() {
        return optionsRadioMenuItemDifficultyEasy;
    }

    public RadioMenuItem getOptionsRadioMenuItemDifficultyNormal() {
        return optionsRadioMenuItemDifficultyNormal;
    }

    public RadioMenuItem getOptionsRadioMenuItemDifficultyHard() {
        return optionsRadioMenuItemDifficultyHard;
    }
}
