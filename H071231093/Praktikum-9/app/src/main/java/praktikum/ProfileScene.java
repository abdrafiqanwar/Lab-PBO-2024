package praktikum;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ProfileScene {
    private App TP9_1_H071231093;

    public ProfileScene(App TP9_1_H071231093) {
        this.TP9_1_H071231093 = TP9_1_H071231093;
    }

    public Scene createProfileScene(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setStyle("-fx-background-color: orange;");

        String name = TP9_1_H071231093.getName();
        String age = TP9_1_H071231093.getAge();
        String job = TP9_1_H071231093.getJob();
        String gender = TP9_1_H071231093.getGender();

        if (name == null || name.isEmpty() || age == null || age.isEmpty() || job == null || job.isEmpty() || gender == null) {
            Text errorMsg = new Text("Tolong isi form dengan benar!");
            errorMsg.setFont(Font.font("Arial", 16));
            grid.add(errorMsg, 0, 0, 2, 1);
        } else {
            Text sceneTitle = new Text("Data Diri");
            sceneTitle.setFont(Font.font("Arial", 20));
            grid.add(sceneTitle, 0, 0);

            grid.add(new Label("Nama:"), 0, 1);
            grid.add(new Label(name), 1, 1);

            grid.add(new Label("Umur:"), 0, 2);
            grid.add(new Label(age), 1, 2);

            grid.add(new Label("Pekerjaan:"), 0, 3);
            grid.add(new Label(job), 1, 3);

            grid.add(new Label("Gender:"), 0, 4);
            grid.add(new Label(gender), 1, 4);
        }

        //button
        Button backButton = new Button("Kembali");
        backButton.setOnAction(e -> {
            TP9_1_H071231093.showHomeScreen(primaryStage);
        });

        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(backButton);
        grid.add(hbBtn, 1, 6);


        Scene scene = new Scene(grid, 400, 350);

        return scene;
    }
}
