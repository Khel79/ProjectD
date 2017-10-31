package app.model.enums;

public enum SelectionImage {
    SELECTED("app/images/unit_selected.png"),
    NONE("app/images/transparent.png"),
    MOVEMENT("app/images/floor_water.png");

    private String url;

    SelectionImage(String url) {
        this.url = url;
    }

    public String getUrl() { return url;}
}
