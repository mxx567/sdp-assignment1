package classes;

abstract class Builder{
    protected String name = "Unknown";
    protected String genre = "Unknown";
    protected int release_year = 2027;
    protected String engine = "Unknown";
    protected boolean hasMultiplayer = false;
    protected boolean hasSingleplayer = false;
    protected String platform = "PC";

    public Builder(String name){
        this.name = name;
    }

    abstract Builder genre(String value);

    abstract Builder release_year(int value);

    abstract Builder engine(String value);

    abstract Builder hasMultiplayer(boolean value);

    abstract Builder hasSingleplayer(boolean value);

    abstract Builder platform(String value);

    public Videogame build() {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (release_year < 1970) {
            throw new IllegalArgumentException("Invalid release year");
        }

        if (!hasSingleplayer && !hasMultiplayer) {
            throw new IllegalStateException("Game must have singleplayer or multiplayer");
        }

        return new Videogame(this);
    }
}