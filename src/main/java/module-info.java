module SpaceRaceGame {
    requires javafx.controls;
    opens pl.mamicam.game.app to javafx.graphics;
    opens pl.mamicam.game.model to javafx.graphics;
    opens pl.mamicam.game.view to javafx.graphics;
    opens background;
    opens buttons;
    opens fonts;
    opens ships;
}