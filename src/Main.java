import classes.*;

void main() {
    Director dir = new Director();

    Videogame racingGame = dir.createMultiplayerRacingGame("MP Racing");
    Videogame shooterGame = dir.createConsoleMultiplayerShooterGame("shootergame");

    System.out.println(racingGame);
    System.out.println(shooterGame);
}