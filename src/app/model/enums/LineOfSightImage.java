package app.model.enums;

public enum LineOfSightImage {
    NONE("app/images/transparent.png"),
    FREE("app/images/los_free.png"),
    BLOCKED("app/images/los_blocked.png");

    private String url;

    LineOfSightImage(String url) {
        this.url = url;
    }

    public String getUrl() { return url;}
}
