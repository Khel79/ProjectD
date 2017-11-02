package app.model.enums;

public enum TerrainImage {

    STONE("app/images/floor_stone.png", "effect", 1, false),
    GRASS("app/images/floor_grass.png", "effect", 1, false),
    WATER("app/images/floor_water.png", "effect", 1, false),
    LAVA("app/images/floor_lava.png", "effect", 1, true),
    MUD("app/images/floor_mud.png", "effect", 2, false),
    ICE("app/images/floor_ice.png", "effect", 1, false),
    CURSED("app/images/floor_cursed.png", "effect", 1, true),
    STAIRS("app/images/floor_stairs.png", "effect", 1, false);

    private String url;
    private String effect;
    private int movementCost;
    private boolean hasHarmfulEffect;

    TerrainImage(String url, String effect, int movementCost, boolean hasHarmfulEffect) {
        this.url = url;
        this.effect = effect;
        this.movementCost = movementCost;
        this.hasHarmfulEffect = hasHarmfulEffect;
    }

    public String getUrl() {
        return url;
    }

    public String getEffect() {
        return effect;
    }

    public int getMovementCost() {
        return movementCost;
    }

    public boolean isHasHarmfulEffect() {
        return hasHarmfulEffect;
    }
}
