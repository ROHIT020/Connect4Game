package com.example.game;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MyMain extends Application {

    private Controller controller;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MyMain.class.getResource("game_layout.fxml"));
        GridPane rootGridPane= fxmlLoader.load();

        MenuBar menuBar = createMenu();
        menuBar.prefWidthProperty().bind(stage.widthProperty());

        Pane menuPane=(Pane) rootGridPane.getChildren().get(0);
        menuPane.getChildren().add(menuBar);

        controller= fxmlLoader.getController();
        controller.createPlayground();

        Scene scene = new Scene(rootGridPane);
        stage.setScene(scene);
        stage.setTitle("Connect Four");
        stage.setResizable(false);
        stage.show();
    }

    private MenuBar createMenu() {

        // File Menu
        Menu fileMenu = new Menu("File");

        MenuItem newGame = new MenuItem("New game");
        newGame.setOnAction(event -> controller.resetGame());

        MenuItem resetGame = new MenuItem("Reset game");
        resetGame.setOnAction(event -> controller.resetGame());

        SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
        MenuItem exitGame = new MenuItem("Exit game");
        exitGame.setOnAction(event -> exitGame());

        fileMenu.getItems().addAll(newGame, resetGame, separatorMenuItem, exitGame);

        // Help Menu
        Menu helpMenu = new Menu("Help");

        MenuItem aboutGame = new MenuItem("About Connect4");
        aboutGame.setOnAction(event -> aboutConnect4());

        SeparatorMenuItem separator = new SeparatorMenuItem();
        MenuItem aboutMe = new MenuItem("About Me");
        aboutMe.setOnAction(event -> aboutMe());

        helpMenu.getItems().addAll(aboutGame, separator, aboutMe);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, helpMenu);

        return menuBar;
    }

    private void aboutMe() {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About The Developer");
        alert.setHeaderText("Rohit Kumar");
        alert.setContentText("I love to play around with code and create games. " +
                "Connect 4 is one of them. In free time " +
                "I like to spend time with nears and dears.");

        alert.show();
    }

    private void aboutConnect4() {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About Connect Four");
        alert.setHeaderText("How To Play?");
        alert.setContentText("Connect Four is a two-player connection game in which the " +
                "players first choose a color and then take turns dropping colored discs " +
                "from the top into a seven-column, six-row vertically suspended grid. "+
                "The pieces fall straight down, occupying the next available space within the column. "+
                "The objective of the game is to be the first to form a horizontal, vertical, " +
                "or diagonal line of four of one's own discs. Connect Four is a solved game. " +
                "The first player can always win by playing the right moves.");

        alert.show();
    }

    private void exitGame() {

        Platform.exit();
        System.exit(0);
    }

    private void resetGame() {
        // TODO
    }

    public static void main(String[] args) {
        launch();
    }
}