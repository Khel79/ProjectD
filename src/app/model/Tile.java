package app.model;

import app.model.enums.TerrainImage;

public class Tile {

    private boolean isBlocked_top, isBlocked_right, isBlocked_bottom, isBlocked_left;
    private boolean hasPlayer, hasMonster;
    private TerrainImage terrainImage;


    public Tile(){
        isBlocked_top = false;
        isBlocked_bottom = false;
        isBlocked_left = false;
        isBlocked_right = false;
    }

    public void setBlocked_top(boolean isBlocked) {
        isBlocked_top = isBlocked;
    }
    public void setBlocked_bottom(boolean isBlocked) {
        isBlocked_bottom = isBlocked;
    }
    public void setBlocked_left(boolean isBlocked) {
        isBlocked_left = isBlocked;
    }
    public void setBlocked_right(boolean isBlocked) {
        isBlocked_right = isBlocked;
    }

    public boolean isBlocked_top() {
        return isBlocked_top;
    }

    public boolean isBlocked_right() {
        return isBlocked_right;
    }

    public boolean isBlocked_bottom() {
        return isBlocked_bottom;
    }

    public boolean isBlocked_left() {
        return isBlocked_left;
    }
}
