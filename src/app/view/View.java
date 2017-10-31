package app.view;

import app.model.enums.*;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class View extends BorderPane {

    private GridPane gridPane;
    private HBox topBox;
    private HBox bottomBox;
    private VBox leftBox;
    private VBox rightBox;

    private TopMenu topMenu;

    private int gridSize;

    public View(int gridSize) {
        this.gridSize = gridSize;

        gridPane = new GridPane();
        topBox = new HBox();
        bottomBox = new HBox();
        leftBox = new VBox();
        rightBox = new VBox();

        topMenu = new TopMenu();
        // topMenu.setMinWidth(Double.MAX_VALUE);

        this.setTop(topBox);
        this.setBottom(bottomBox);
        this.setLeft(leftBox);
        this.setRight(rightBox);
        this.setCenter(gridPane);

        topBox.getChildren().add(topMenu);

        leftBox.getChildren().addAll(new Rectangle(50, 100, Color.GREY));
        rightBox.getChildren().addAll(new Rectangle(50, 100, Color.GREY));
        bottomBox.getChildren().addAll(new Rectangle(100, 50, Color.GREY));

        topBox.setAlignment(Pos.TOP_LEFT);
        leftBox.setAlignment(Pos.TOP_LEFT);
        bottomBox.setAlignment(Pos.CENTER);
        rightBox.setAlignment(Pos.TOP_RIGHT);

        gridPane.setGridLinesVisible(true);
        gridPane.setHgap(0);
        gridPane.setVgap(0);
        gridPane.setAlignment(Pos.CENTER);

        int max = 4;
        for (int row = 0; row < max; row++) {
            for (int column = 0; column < max; column++) {

                StackPane layerPane = new StackPane();

                layerPane.getChildren().add(setFloorLayer(FloorImage.STONE));
                layerPane.getChildren().add(setTokenLayer(TokenImage.NONE));
                layerPane.getChildren().add(setUnitLayer(UnitImage.HERO_MELEE));
                layerPane.getChildren().add(setSelectionLayer(SelectionImage.NONE));
                layerPane.getChildren().add(setLineOfSightLayer(LineOfSightImage.NONE));

                gridPane.add(layerPane, column, row);
                gridPane.add(setLabelLayer("Text"), column, row);
            }
        }
    }

    public TopMenu getTopMenu() {
        return topMenu;
    }

    public ImageView setFloorLayer(FloorImage floorImage){
        ImageView imageView = new ImageView(floorImage.getUrl());
        imageView.setFitHeight(gridSize);
        imageView.setFitWidth(gridSize);
        return imageView;
    }

    public ImageView setTokenLayer(TokenImage tokenImage){
        ImageView imageView = new ImageView(tokenImage.getUrl());
        imageView.setFitHeight(gridSize);
        imageView.setFitWidth(gridSize);
        return imageView;
    }

    public ImageView setUnitLayer(UnitImage unitImage){
        ImageView imageView = new ImageView(unitImage.getUrl());
        imageView.setFitHeight(gridSize);
        imageView.setFitWidth(gridSize);
        return imageView;
    }

    public ImageView setSelectionLayer(SelectionImage unitImage){
        ImageView imageView = new ImageView(unitImage.getUrl());
        imageView.setFitHeight(gridSize);
        imageView.setFitWidth(gridSize);
        return imageView;
    }

    public ImageView setLineOfSightLayer(LineOfSightImage unitImage){
        ImageView imageView = new ImageView(unitImage.getUrl());
        imageView.setFitHeight(gridSize);
        imageView.setFitWidth(gridSize);
        return imageView;
    }

    public Label setLabelLayer(String labelText) {
        Label label = new Label(labelText);
        label.setMaxWidth(Double.MAX_VALUE);
        label.setAlignment(Pos.CENTER);
        return label;
    }
}
