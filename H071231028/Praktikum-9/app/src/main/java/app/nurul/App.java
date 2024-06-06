package app.nurul;

import app.nurul.scenes.LoginScenes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("YO YO YO YO");
        Pane root = new Pane();
        root.getStyleClass().add("latar");
        Scene scene = new Scene(root, 640, 480);
        scene.getStylesheets().add(getClass().getResource("/styles/Styles.css").toExternalForm());
        stage.setScene(scene);
        stage.show();

        LoginScenes login = new LoginScenes(stage);
        login.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
