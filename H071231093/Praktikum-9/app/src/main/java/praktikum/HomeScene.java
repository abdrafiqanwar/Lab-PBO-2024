package praktikum;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomeScene {
    private TextField nameField;
    private TextField ageField;
    private TextField jobField;
    private ToggleGroup genderGroup;
    private App TP9_1_H071231093;

    public HomeScene(App TP9_1_H071231093) {
        this.TP9_1_H071231093 = TP9_1_H071231093;
    }

    public Scene createHomeScreen(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setStyle("-fx-background-color: orange;");

        Text sceneTitle = new Text("DATA DIRI");
        sceneTitle.setFont(Font.font("Arial", 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label nameLabel = new Label("Nama:");
        grid.add(nameLabel, 0, 1);

        nameField = new TextField();
        grid.add(nameField, 1, 1);

        Label ageLabel = new Label("Umur:");
        grid.add(ageLabel, 0, 2);

        ageField = new TextField();
        grid.add(ageField, 1, 2);

        Label jobLabel = new Label("Pekerjaan:");
        grid.add(jobLabel, 0, 3);

        jobField = new TextField();
        grid.add(jobField, 1, 3);

        Label genderLabel = new Label("Gender:");
        grid.add(genderLabel, 0, 4);

        genderGroup = new ToggleGroup();
        RadioButton male = new RadioButton("Laki - Laki");
        male.setToggleGroup(genderGroup);
        RadioButton female = new RadioButton("Perempuan");
        female.setToggleGroup(genderGroup);

        HBox genderBox = new HBox(10);
        genderBox.getChildren().addAll(male, female);
        grid.add(genderBox, 1, 4);

        // Buttons
        Button btnReset = new Button("Reset");
        Button btnInput = new Button("Input Data");
        Button btnProfile = new Button("Menu Profile");

        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().addAll(btnReset, btnInput, btnProfile);
        grid.add(hbBtn, 1, 5);

        // Event handling
        btnReset.setOnAction(e -> {
            nameField.clear();
            ageField.clear();
            jobField.clear();
            genderGroup.selectToggle(null);
        });

        btnInput.setOnAction(e -> {
            TP9_1_H071231093.setName(nameField.getText());
            TP9_1_H071231093.setAge(ageField.getText());
            TP9_1_H071231093.setJob(jobField.getText());
            RadioButton genderDipilih = (RadioButton) genderGroup.getSelectedToggle();
            TP9_1_H071231093.setGender(genderDipilih != null ? genderDipilih.getText() : null);
        });

        btnProfile.setOnAction(e -> {
            TP9_1_H071231093.showProfileScreen(primaryStage);
        });

        Scene scene = new Scene(grid, 400, 350);

        return scene;
    }
}
