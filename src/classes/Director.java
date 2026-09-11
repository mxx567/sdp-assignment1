package classes;

public class Director {
    public Videogame createMultiplayerRacingGame(String name) {
        return new RacingGameBuilder(name)
                .engine("Unreal Engine")
                .release_year(2026)
                .hasSingleplayer(true)
                .hasMultiplayer(true)
                .platform("PC")
                .build();
    }

    public Videogame createConsoleMultiplayerShooterGame(String name) {
        return new MultiplayerShooterBuilder(name)
                .engine("Unreal Engine")
                .release_year(2026)
                .hasSingleplayer(false)
                .hasMultiplayer(true)
                .platform("PS5, Xbox Series X|S")
                .build();
    }
}
