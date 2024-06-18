package id.app.tugas;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class profileScene {
    private Stage stage;

    public profileScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        VBox profileLayout = new VBox(20);
        profileLayout.setAlignment(Pos.CENTER);
        profileLayout.setPadding(new Insets(20));
        Label nameLabel = new Label("Username: JohnDoe");
        nameLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        Image profileImage = new Image("path/to/profile/IMG_1139.JPG");
        ImageView profileImageView = new ImageView(profileImage);
        profileImageView.setFitWidth(100);
        profileImageView.setFitHeight(100);

        Button backButton = new Button("Back to Home");
        backButton.setOnAction(e -> switchToHomeScene());

        profileLayout.getChildren().addAll(profileImageView, nameLabel, backButton);

        Scene profileScene = new Scene(profileLayout, 400, 300);
        stage.setScene(profileScene);
        stage.setTitle("Profile Scene");
        stage.show();
    }

    private void switchToHomeScene() {
        HomeScene homeScene = new HomeScene();
        homeScene.start(stage);
    }
}