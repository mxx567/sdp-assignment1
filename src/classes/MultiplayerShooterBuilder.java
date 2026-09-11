package classes;

public class MultiplayerShooterBuilder extends Builder {

    public MultiplayerShooterBuilder(String name) {
        super(name);
        this.genre = "Shooter";
        this.hasMultiplayer = true;
        this.release_year = 2027;
    }

    public MultiplayerShooterBuilder genre(String genre) {
        this.genre = genre;
        return this;
    }

    public MultiplayerShooterBuilder release_year(int release_year) {
        this.release_year = release_year;
        return this;
    }


    public MultiplayerShooterBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public MultiplayerShooterBuilder hasMultiplayer(boolean hasMultiplayer) {
        this.hasMultiplayer = hasMultiplayer;
        return this;
    }

    public MultiplayerShooterBuilder hasSingleplayer(boolean hasSingleplayer) {
        this.hasSingleplayer = hasSingleplayer;
        return this;
    }

    public MultiplayerShooterBuilder platform(String platform) {
        this.platform = platform;
        return this;
    }
}