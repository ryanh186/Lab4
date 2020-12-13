package main.gui.gamebosswon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class GameBoss2WonMenu extends Application{

    public GameBoss2WonMenu()  {

    }

    /**
     * Start Setup for the game over screen of the Game
     *
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GameBoss2WonMenuSB.fxml"));
        root.setId("pane");
        primaryStage.setTitle("Game Won Menu");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root, 500, 580));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
