package app.model.enums;

public enum UnitImage {
    HERO_MAGIC("app/images/hero_magic.png", 1),
    HERO_MELEE("app/images/hero_melee.png", 1),
    HERO_RANGED("app/images/hero_ranged.png", 1),

    MONSTER_SKELETON("app/images/monster_skeleton.png", 1),
    MONSTER_BEASTMAN("app/images/monster_beastman.png", 1),
    MONSTER_SORCEROR("app/images/monster_sorceror.png", 1),
    MONSTER_RAZORWING("app/images/monster_razorwing.png", 1),
    MONSTER_HELLHOUND("app/images/monster_hellhound.png", 2),
    MONSTER_GIANT("app/images/monster_giant.png", 4),
    MONSTER_DEMON("app/images/monster_demon.png", 4),
    MONSTER_SPIDER("app/images/monster_spider.png", 4),
    MONSTER_DRAGON("app/images/monster_dragon.png", 4),

    UNIT_TRANSPARENT("app/images/transparent.png", 1);

    private String url;
    private int baseSize;

    UnitImage(String url, int baseSize) {
        this.url = url;
        this.baseSize = baseSize;
    }

    public String getUrl() { return url;}
    public int getBaseSize() { return baseSize;}
}
