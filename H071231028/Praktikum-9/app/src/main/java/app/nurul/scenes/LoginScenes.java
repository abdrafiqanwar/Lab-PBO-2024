package app.nurul.scenes;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginScenes {
    private Stage stage;
    
    public LoginScenes(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        Label label = new Label("SELAMAT DATANG");
        label.getStyleClass().add("login");

        Button buttonLogin = new Button("Login");
        buttonLogin.getStyleClass().add("button");
        buttonLogin.setOnAction(e ->{
            Home homeScene = new Home(stage);
            homeScene.show();
        });

        VBox view = new VBox(label, buttonLogin);
        view.getStylesheets().add(getClass().getResource("/styles/Styles.css").toExternalForm());
        view.setAlignment(Pos.CENTER);
        view.getStyleClass().add("latar"); // Add the "latar" style class to the VBox
        stage.getScene().setRoot(view);
    }
}
