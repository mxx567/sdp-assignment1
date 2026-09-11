public class Videogame {
    private final String name;
    private final String genre;
    private final int release_year;
    private final String engine;
    private final boolean hasMultiplayer;
    private final boolean hasSingleplayer;
    private final String platform;

    public String toString(){
        return "Name: " + name + ", Genre: " + genre + ", Release Year: " + release_year + ", Engine: " + engine + ", Has Single-Player: " + hasMultiplayer
                + ", Has Multiplayer: " + hasMultiplayer + ", Platform: " + platform;
    }

}