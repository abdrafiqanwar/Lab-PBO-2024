// package id.praktikum.novi;


// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
// import javafx.scene.layout.VBox;

// public class ProfileScene {
//     private App app;
//     private Scene scene;

//     public ProfileScene(App app, String name, String birth, String nim) {
//         this.app = app;
//         initialize(name, birth, nim);
//     }

//     private void initialize(String name, String birth, String nim) {
//         VBox layout = new VBox(10);
//         layout.setAlignment(Pos.CENTER);
//         layout.getStyleClass().add("root"); // Menambahkan kelas CSS

//         // Profil user
//         Label nameLabel = new Label("Nama: " + name);
//         Label birthLabel = new Label("Tanggal Lahir: " + birth);
//         Label nimLabel = new Label("NIM: " + nim);

//         Image profileImage = new Image("file:resources/profile.jpg"); // Gantilah dengan path yang sesuai
//         ImageView profileImageView = new ImageView(profileImage);
//         profileImageView.setFitHeight(100);
//         profileImageView.setFitWidth(100);

//         Button backButton = new Button("Back to Home");
//         backButton.setOnAction(e -> app.switchToHomeScene());
//         layout.getChildren().addAll(profileImageView, nameLabel, birthLabel, nimLabel, backButton);
//         scene = new Scene(layout, 400, 300);
//         scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm()); // Menambahkan CSS
//     }
    
//     public Scene getScene() {
//         return scene;
//     }

//     public void setApp(App app) {
//         this.app = app;
//     }
// }
