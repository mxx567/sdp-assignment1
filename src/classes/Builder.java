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

    abstract Builder genre();

    abstract Builder release_year();

    abstract Builder engine();

    abstract Builder hasMultiplayer();

    abstract Builder hasSingleplayer(boolean hasSingleplayer);

    abstract Builder platform();

    public Videogame build(){
        return new Videogame(this);
    }
}