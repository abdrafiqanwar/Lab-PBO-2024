package tugas.praktikum;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) {
        this.stage = primaryStage;
        primaryStage.setTitle("Aplikasi JavaFX Saya");
        HomeScene();

    }

    private void HomeScene() {
        Color biru = Color.web("#039BE5");
        Color putih = Color.web("#EFF9FE"); 

        LinearGradient gradasi = new LinearGradient(
                0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
                new Stop(0, biru),
                new Stop(0.50, putih)
        );

        Pane root = new Pane();
        root.setBackground(new Background(new BackgroundFill(gradasi, CornerRadii.EMPTY, Insets.EMPTY)));


        Button button1 = new Button("Button");
        button1.setLayoutX(200);
        button1.setLayoutY(469);
        button1.setPrefHeight(20);
        button1.setPrefWidth(288);
        button1.setFont(Font.font("Inter", FontWeight.BOLD, 24));
        button1.setStyle(
                "-fx-background-color: transparent; -fx-border-color: #039BE5; -fx-border-width: 2px; -fx-text-fill: #039BE5; -fx-background-radius: 30; -fx-border-radius: 30;");
        button1.setOnAction(v -> ProfileScene());

        Text text1 = new Text("fauzan");
        text1.setFont(Font.font("Inter", FontWeight.BOLD, 30));
        text1.setFill(Color.web("#EFF9FE"));
        text1.setLayoutX(30);
        text1.setLayoutY(90);

        Text text2 = new Text("Welcome TO");
        text2.setFont(Font.font("Inter", FontWeight.BOLD, 28));
        text2.setFill(Color.web("#EFF9FE"));
        text2.setLayoutX(30);
        text2.setLayoutY(129);

        Text text3 = new Text("Aplikasi saya");
        text3.setFont(Font.font("Inter", FontWeight.BOLD, 24));
        text3.setFill(Color.web("#EFF9FE"));
        text3.setLayoutX(30);
        text3.setLayoutY(167);

        root.getChildren().addAll(button1, text1, text2, text3);

        Scene HomeScene = new Scene(root, 750, 640);
        stage.setScene(HomeScene);
        stage.show();
    }

    private void ProfileScene() {

        Color biru = Color.web("#039BE5"); 
        Color putih = Color.web("#EFF9FE"); 

        LinearGradient gradasi = new LinearGradient(
                0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
                new Stop(0, biru),
                new Stop(0.50, putih)
        );

        Pane root = new Pane();
        root.setBackground(new Background(new BackgroundFill(gradasi, CornerRadii.EMPTY, Insets.EMPTY)));

        Image logoImage = new Image("/logosisfo.jpeg");
        ImageView imageView = new ImageView(logoImage);
        imageView.setFitWidth(750);
        imageView.setFitHeight(500);
        imageView.setLayoutX(-42);
        imageView.setLayoutY(19);

        Text text4 = new Text();
        text4.setFont(Font.font("Inter", FontWeight.BOLD, 28));
        text4.setFill(Color.web("#EFF9FE"));
        text4.setLayoutX(140);
        text4.setLayoutY(68);

        Text text5 = new Text();
        text5.setFont(Font.font("Inter", FontWeight.BOLD, 24));
        text5.setFill(Color.web("#EFF9FE"));
        text5.setLayoutX(140);
        text5.setLayoutY(102);

        // Membuat tombol untuk kembali ke Scene 1
        // Button buttonToHomeScene = new Button("Kembali ke Scene 1");
        // buttonToHomeScene.setLayoutX(36);
        // buttonToHomeScene.setLayoutY(469);
        // buttonToHomeScene.setFont(Font.font("Inter", FontWeight.BOLD, 24));
        // buttonToHomeScene.setOnAction(e -> HomeScene());

        // Membuat Scene 2
        root.getChildren().addAll(imageView,text4,text5);
        Scene ProfileScene = new Scene(root, 750, 640);
        stage.setScene(ProfileScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}