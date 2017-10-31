package app.model.enums;

public enum TokenImage {
    NONE("app/images/transparent.png"),

    POTION_HEALTH("app/images/token_potion_health.png"),
    POTION_FATIGUE("app/images/token_potion_fatigue.png"),
    POTION_STEALTH("app/images/token_potion_stealth.png"),
    POTION_ARMOR("app/images/token_potion_armor.png"),
    POTION_POWER("app/images/token_potion_power.png"),

    TREASURE_COPPER("app/images/token_treasure_copper.png"),
    TREASURE_SILVER("app/images/token_treasure_silver.png"),
    TREASURE_GOLD("app/images/token_treasure_gold.png"),

    QUESTION_MARK("app/images/token_question_mark.png"),

    RUNE_NORMAL("app/images/token_rune_normal.png"),
    RUNE_GREEN("app/images/token_rune_green.png"),
    RUNE_RED("app/images/token_rune_red.png"),
    RUNE_PURPLE("app/images/token_rune_purple.png"),

    TRAP_PIT("app/images/token_trap_pit.png"),
    TRAP_SPIKES("app/images/token_trap_spikes.png"),
    TRAP_ROCK("app/images/token_trap_rock.png");

    private String url;

    TokenImage(String url) {
        this.url = url;
    }

    public String getUrl() { return url;}
}
