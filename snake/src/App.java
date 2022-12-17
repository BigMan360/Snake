
import javafx.application.Application;

import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override // starts the game
    public void start(Stage stage) {

        try {

            Game game = new Game();
            game.startGame();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
