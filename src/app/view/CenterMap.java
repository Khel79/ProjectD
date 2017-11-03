package app.view;

import app.model.enums.*;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

@SuppressWarnings("FieldCanBeLocal")
final class CenterMap extends GridPane {

    private int gridSize;

    private StackPane[][] layerPane;

    CenterMap(int gridSize, int mapWidth, int mapHeight) {
        this.gridSize = gridSize;

        layerPane = new StackPane[mapWidth][mapHeight];

        setGridLinesVisible(true);
        setHgap(0);
        setVgap(0);
        setAlignment(Pos.CENTER);

        // Builds the map with 5 layers for each tile, based on the chosen dimensions at the start of the game
        for (int row = 0; row < mapWidth; row++) {
            for (int column = 0; column < mapHeight; column++) {
                layerPane[row][column] = new StackPane();
                layerPane[row][column].getChildren().add(setTerrainLayer(TerrainImage.STONE));
                layerPane[row][column].getChildren().add(setTokenLayer(TokenImage.NONE));
                layerPane[row][column].getChildren().add(setUnitLayer(UnitImage.HERO_MELEE));
                layerPane[row][column].getChildren().add(setSelectionLayer(SelectionImage.NONE));
                layerPane[row][column].getChildren().add(setLineOfSightLayer(LineOfSightImage.NONE));
                add(layerPane[row][column], column, row);
            }
        }
    }

    /**
     * Used by the presenter to get the complete map with all its layers and their settings
     *
     * @return StackPane[][]
     */
    StackPane[][] getLayerPane() {
        return layerPane;
    }

    /**
     * Used by the presenter to be able to change the Terrain layer
     *
     * @param terrainImage - Enum that contains all info regarding terrain
     * @return ImageView
     */
    ImageView setTerrainLayer(TerrainImage terrainImage){
        ImageView imageView = new ImageView(terrainImage.getUrl());
        imageView.setFitHeight(gridSize);
        imageView.setFitWidth(gridSize);
        return imageView;
    }

    /**
     * Used by the presenter to be able to change the Token layer
     *
     * @param tokenImage  - Enum that contains all info regarding any token(s) present
     * @return ImageView
     */
    ImageView setTokenLayer(TokenImage tokenImage){
        ImageView imageView = new ImageView(tokenImage.getUrl());
        imageView.setFitHeight(gridSize);
        imageView.setFitWidth(gridSize);
        return imageView;
    }

    /**
     * Used by the presenter to be able to change the Token layer
     *
     * @param unitImage  - Enum that contains all info regarding the unit present
     * @return ImageView
     */
    ImageView setUnitLayer(UnitImage unitImage){
        ImageView imageView = new ImageView(unitImage.getUrl());
        imageView.setFitHeight(gridSize);
        imageView.setFitWidth(gridSize);
        return imageView;
    }

    /**
     * Used by the presenter to be able to change the Selection layer
     *
     * @param selectionImage - Enum that contains all info when the related tile is selected
     * @return ImageView
     */
    ImageView setSelectionLayer(SelectionImage selectionImage){
        ImageView imageView = new ImageView(selectionImage.getUrl());
        imageView.setFitHeight(gridSize);
        imageView.setFitWidth(gridSize);
        return imageView;
    }

    /**
     * Used by the presenter to be able to change the LineOfSight layer
     *
     * @param lineOfSightImage - Enum that contains all info for when line of sight needs to be determined
     * @return ImageView
     */
    ImageView setLineOfSightLayer(LineOfSightImage lineOfSightImage){
        ImageView imageView = new ImageView(lineOfSightImage.getUrl());
        imageView.setFitHeight(gridSize);
        imageView.setFitWidth(gridSize);
        return imageView;
    }

    /**
     * Used by the presenter to be able to change any text displayed on a tile
     *
     * @param labelText - Value of the text to be displayed
     * @return Label
     */
    Label setLabelLayer(String labelText) {
        Label label = new Label(labelText);
        label.setMaxWidth(Double.MAX_VALUE);
        label.setAlignment(Pos.CENTER);
        return label;
    }
}
