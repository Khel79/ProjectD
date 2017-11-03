package app.view;

import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

@SuppressWarnings("FieldCanBeLocal")
public class View extends BorderPane {

    private HBox topBox;
    private HBox bottomBox;
    private VBox leftBox;
    private VBox rightBox;

    private TopMenu topMenu;
    private CenterMap centerMap;

    private int gridSize;
    private int mapWidth;
    private int mapHeight;

    public View(int gridSize, int mapWidth, int mapHeight) {
        this.gridSize = gridSize;
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;

        topBox = new HBox();
        bottomBox = new HBox();
        leftBox = new VBox();
        rightBox = new VBox();

        topMenu = new TopMenu();
        // topMenu.setMinWidth(Double.MAX_VALUE); // make the unfolded menu disappear unless you hold the mouse down

        centerMap = new CenterMap(gridSize, mapWidth, mapHeight);

        this.setTop(topBox);
        this.setBottom(bottomBox);
        this.setLeft(leftBox);
        this.setRight(rightBox);
        setCenter(centerMap);

        topBox.getChildren().add(topMenu);

        leftBox.getChildren().addAll(new Rectangle(50, 100, Color.GREY));
        rightBox.getChildren().addAll(new Rectangle(50, 100, Color.GREY));
        bottomBox.getChildren().addAll(new Rectangle(100, 50, Color.GREY));

        topBox.setAlignment(Pos.TOP_LEFT);
        leftBox.setAlignment(Pos.TOP_LEFT);
        bottomBox.setAlignment(Pos.CENTER);
        rightBox.setAlignment(Pos.TOP_RIGHT);

    }

    TopMenu getTopMenu() {
        return topMenu;
    }

    CenterMap getCenterMap() {
        return centerMap;
    }
}
