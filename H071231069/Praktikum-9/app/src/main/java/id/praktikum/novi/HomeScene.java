// package id.praktikum.novi;

// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.control.TextField;
// import javafx.scene.layout.VBox;

// public class HomeScene {
//     private App app;
//     private Scene scene;

//     // Input fields
//     private TextField nameField;
//     private TextField birthField;
//     private TextField nimField;

//     public HomeScene(App app) {
//         this.app = app;
//         initialize();
//     }

//     private void initialize() {
//         VBox layout = new VBox(10);
//         layout.setAlignment(Pos.CENTER);
//         layout.getStyleClass().add("root"); // Menambahkan kelas CSS

//         // Input fields and labels
//         Label nameLabel = new Label("Nama:");
//         nameField = new TextField();

//         Label birthLabel = new Label("Tanggal Lahir:");
//         birthField = new TextField();

//         Label nimLabel = new Label("NIM:");
//         nimField = new TextField();

//         Button profileButton = new Button("Go to Profile");
//         profileButton.setOnAction(e -> app.switchToProfileScene(nameField.getText(), birthField.getText(), nimField.getText()));

//         layout.getChildren().addAll(nameLabel, nameField, birthLabel, birthField, nimLabel, nimField, profileButton);
//         scene = new Scene(layout, 400, 300);
//         scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm()); // Menambahkan CSS
//     }

//     public Scene getScene() {
//         return scene;
//     }
// }

