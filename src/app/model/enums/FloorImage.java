package app.model.enums;

public enum FloorImage {

    STONE("app/images/floor_stone.png"),
    GRASS("app/images/floor_stone.png"),
    WATER("app/images/floor_water.png"),
    LAVA("app/images/floor_lava.png"),
    MUD("app/images/floor_mud.png"),
    ICE("app/images/floor_ice.png"),
    CURSED("app/images/floor_cursed.png"),
    STAIRS("app/images/floor_stairs.png");

    private String url;

    FloorImage(String url) {
        this.url = url;
    }

    public String getUrl() { return url;}
}
