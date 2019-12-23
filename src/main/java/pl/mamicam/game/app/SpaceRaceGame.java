package pl.mamicam.game.app;

import javafx.application.Application;
import javafx.stage.Stage;
import pl.mamicam.game.view.ViewManager;

public class SpaceRaceGame extends Application {

    private static System.Logger LOGGER = System.getLogger("SpaceRaceGame");

    @Override
    public void start(Stage primaryStage) {
        try {
            ViewManager manager = new ViewManager();
            primaryStage = manager.getMainStage();
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        launch(args);
    }
}
