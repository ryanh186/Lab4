package main.gui.levelmenu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;
import main.games.MazeGame.Maze;
import main.games.MazeGame.Mazelvl2;
import main.games.MazeGame.Mazelvl3;
import main.games.shooter.LBossLevel.BossLevel;
import main.games.shooter.ShootingGame;
import main.games.shooter.level1.Level1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



    public class LevelPopUpWindowController implements Initializable {

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

        }

        /**
         * Method tied to button for opening the first level(Shooting Game)
         *
         * @param actionEvent
         * @throws IOException
         */
        @FXML
        public void openLevelOne(ActionEvent actionEvent) throws IOException {

            Maze game = new Maze();
            Stage shootingGameStage = new Stage();
            try {
                game.start(shootingGameStage);
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /**
         * Method tied to button for opening the first level(Shooting Game)
         *
         * @param actionEvent
         * @throws IOException
         */
        @FXML
        public void openLevelTwo(ActionEvent actionEvent) throws IOException {
            Mazelvl2 game = new Mazelvl2();
            Stage shootingGameStage = new Stage();
            try {
                game.start(shootingGameStage);
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        /**
         * Method tied to button for opening the first level(Shooting Game)
         *
         * @param actionEvent
         * @throws IOException
         */
        @FXML
        public void openLevelThree(ActionEvent actionEvent) throws IOException {
            Mazelvl3 game = new Mazelvl3();
            Stage shootingGameStage = new Stage();
            try {
                game.start(shootingGameStage);
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /**
         * Method tied to button for opening the level menu
         *
         * @param actionEvent
         * @throws IOException
         */
        @FXML
        public void openLevelMenu(ActionEvent actionEvent) throws IOException {
            LevelMenu levelMenu = new LevelMenu();
            Stage instructionsMenuStage = new Stage();
            try {
                levelMenu.start(instructionsMenuStage);
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        /**
         * Method tied to button for opening the first level(Shooting Game)
         *
         * @param actionEvent
         * @throws IOException
         */
        @FXML
        public void openLevelOnePopUp(ActionEvent actionEvent) throws IOException {
            Level1PopUp level1PopUp = new Level1PopUp();
            Stage levelOnePopUp = new Stage();
            try {
                level1PopUp.start(levelOnePopUp);
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @FXML
        public void openLevelTwoPopUp(ActionEvent actionEvent) throws IOException {
            Level2PopUp level2PopUp = new Level2PopUp();
            Stage levelTwoPopUp = new Stage();
            try {
                level2PopUp.start(levelTwoPopUp);
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        @FXML
        public void openLevelThreePopUp(ActionEvent actionEvent) throws IOException {
            Level3PopUp level3PopUp = new Level3PopUp();
            Stage levelThreePopUp = new Stage();
            try {
                level3PopUp.start(levelThreePopUp);
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }





