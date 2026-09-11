package classes;

public class RacingGameBuilder extends Builder {

    public RacingGameBuilder(String name) {
        super(name);
        this.genre = "Racing";
        release_year = 2027;
    }

    public RacingGameBuilder genre(String genre) {
        this.genre = genre;
        return this;
    }

    public RacingGameBuilder release_year(int release_year) {
        this.release_year = release_year;
        return this;
    }

    @Override
    public RacingGameBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public RacingGameBuilder hasMultiplayer(boolean hasMultiplayer) {
        this.hasMultiplayer = hasMultiplayer;
        return this;
    }

    public RacingGameBuilder hasSingleplayer(boolean hasSingleplayer) {
        this.hasSingleplayer = hasSingleplayer;
        return this;
    }

    public RacingGameBuilder platform(String platform) {
        this.platform = platform;
        return this;
    }
}