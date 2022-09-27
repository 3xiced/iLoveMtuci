package Core.HrefParser;

public class HrefParserSettings {
    private int searchDepth;
    private String mainUrl;

    public int getSearchDepth() {
        return searchDepth;
    }

    public void setSearchDepth(int searchDepth) {
        this.searchDepth = searchDepth;
    }

    public String getMainUrl() {
        return mainUrl;
    }

    public void setMainUrl(String mainUrl) {
        this.mainUrl = mainUrl;
    }

    public HrefParserSettings(int searchDepth, String mainUrl) {
        this.searchDepth = searchDepth;
        this.mainUrl = mainUrl;
    }
}
