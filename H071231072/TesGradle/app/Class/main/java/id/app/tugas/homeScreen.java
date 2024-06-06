package id.app.tugas;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class homeScreen extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Home Scene");

        VBox homelayaout = new VBox(20);
        homelayaout.setAlignment(Pos.CENTER);
        homelayaout.setPadding(new Insets(20));
        Button toProfileButton = new Button("go to profile");
        toProfileButton.setOnAction(e -> switchToProfileScene(primaryStage));
        homelayaout.getChildren().add(toProfileButton);

        Scene homScene = new Scene(homelayaout, 400, 300);
        primaryStage.setScene(homScene);
        primaryStage.show();
    }

    private void switchToProfileScene(Stage stage) {
        ProfileScene profileScene = new ProfileScene();
        profileScene.start(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}