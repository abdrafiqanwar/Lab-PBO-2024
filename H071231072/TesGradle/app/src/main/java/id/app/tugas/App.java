package id.app.tugas;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class App extends Application {
    private Map<String, String> userCredentials = new HashMap();
    private Map<String, String> userProfiles = new HashMap();
    private String currentLoggedInUser;
    private String username;
    private String password;
    private String name;
    private String date;
 
    public App() {
    }
 
    public void start(Stage stage) throws Exception {
       stage.setScene(this.mainMenuScene(stage));
       stage.show();
       stage.setResizable(false);
    }
 
    private Scene mainMenuScene(Stage stage) {
       Label judul1 = new Label("WELCOME");
       judul1.getStyleClass().add("judul");
       judul1.relocate(220.0, 120.0);
       Button btn1 = new Button("Login");
       btn1.getStyleClass().add("button");
       btn1.relocate(240.0, 210.0);
       btn1.setOnAction((e) -> {
          stage.setScene(this.loginScene(stage));
       });
       Button btn2 = new Button("Register");
       btn2.getStyleClass().add("button");
       btn2.relocate(240.0, 270.0);
       btn2.setOnAction((e) -> {
          stage.setScene(this.registerScene(stage));
       });
       Pane root = new Pane();
       root.getChildren().addAll(new Node[]{judul1, btn1, btn2});
       root.getStyleClass().add("latar");
       Scene scene = new Scene(root, 640.0, 480.0);
       scene.getStylesheets().add(this.getClass().getResource("/Style/Style.css").toExternalForm());
       stage.setTitle("rfly App");
       return scene;
    }
 
    private Scene registerScene(Stage stage) {
       Label registerLabel = new Label("REGISTER");
       registerLabel.getStyleClass().add("judul");
       registerLabel.relocate(215.0, 70.0);
       Label nama1 = new Label("Name\t:");
       TextField nama2 = new TextField();
       nama1.getStyleClass().add("input");
       nama1.relocate(90.0, 140.0);
       nama2.relocate(190.0, 140.0);
       nama2.getStyleClass().add("tabelInput");
       Label dateLabel = new Label("Birthday\t:");
       TextField dateField = new TextField();
       dateLabel.getStyleClass().add("input");
       dateLabel.relocate(90.0, 180.0);
       dateField.relocate(190.0, 180.0);
       dateField.getStyleClass().add("tabelInput");
       Label usernama1 = new Label("Username:");
       TextField usernama2 = new TextField();
       usernama1.getStyleClass().add("input");
       usernama1.relocate(90.0, 220.0);
       usernama2.relocate(190.0, 220.0);
       usernama2.getStyleClass().add("tabelInput");
       Label passwordLabel = new Label("Password\t:");
       PasswordField passwordField = new PasswordField();
       passwordLabel.getStyleClass().add("input");
       passwordLabel.relocate(90.0, 260.0);
       passwordField.relocate(190.0, 260.0);
       passwordField.getStyleClass().add("tabelInput");
       Label salah1 = new Label();
       salah1.getStyleClass().add("error");
       salah1.relocate(190.0, 300.0);
       Button submit = new Button("Submit");
       submit.getStyleClass().add("buttonS");
       submit.relocate(440.0, 320.0);
       submit.setOnAction((e) -> {
          this.name = nama2.getText();
          this.date = dateField.getText();
          this.username = usernama2.getText();
          this.password = passwordField.getText();
          if (!this.name.isEmpty() && !this.date.isEmpty() && !this.username.isEmpty() && !this.password.isEmpty()) {
             if (this.password.length() < 8) {
                salah1.setText("Password must be at least 8 characters");
                salah1.getStyleClass().add("warning");
                salah1.relocate(190.0, 290.0);
             } else {
                this.userCredentials.put(this.username, this.password);
                this.userProfiles.put(this.username, this.name + ", Birthday\t: " + this.date);
                stage.setScene(this.registerSuccess(stage));
             }
          } else {
             salah1.setText("Please fill in all fields");
             salah1.getStyleClass().add("warning");
             salah1.relocate(410.0, 290.0);
          }
 
       });
       Button back = new Button("Back");
       back.getStyleClass().add("buttonS");
       back.relocate(270.0, 340.0);
       back.setOnAction((e) -> {
          stage.setScene(this.mainMenuScene(stage));
       });
       Pane root = new Pane();
       root.getChildren().addAll(new Node[]{registerLabel, nama1, nama2, dateField, dateLabel, usernama1, usernama2, passwordField, passwordLabel, submit, salah1, back});
       root.getStyleClass().add("latar");
       Scene scene = new Scene(root, 640.0, 480.0);
       scene.getStylesheets().add(this.getClass().getResource("/Style/Style.css").toExternalForm());
       return scene;
    }
 
    private Scene registerSuccess(Stage stage) {
       Label success = new Label("Registration Successful");
       success.getStyleClass().add("judul");
       success.relocate(143.0, 150.0);
       Button back = new Button("Back");
       back.getStyleClass().add("buttonS");
       back.relocate(270.0, 250.0);
       back.setOnAction((e) -> {
          stage.setScene(this.mainMenuScene(stage));
       });
       Pane root = new Pane();
       root.getChildren().addAll(new Node[]{success, back});
       root.getStyleClass().add("latar");
       Scene scene = new Scene(root, 640.0, 480.0);
       scene.getStylesheets().add(this.getClass().getResource("/Style/Style.css").toExternalForm());
       return scene;
    }
 
    private Scene loginScene(Stage stage) {
       Label loginLabel = new Label("LOGIN");
       loginLabel.getStyleClass().add("judul");
       loginLabel.relocate(250.0, 100.0);
       Label usernameLogin1 = new Label("Username:");
       TextField usernameLogin2 = new TextField();
       usernameLogin1.getStyleClass().add("input");
       usernameLogin1.relocate(90.0, 200.0);
       usernameLogin2.relocate(190.0, 200.0);
       usernameLogin2.getStyleClass().add("tabelInput");
       Label passLogin = new Label("Password\t:");
       PasswordField passwordFieldLogin = new PasswordField();
       passLogin.getStyleClass().add("input");
       passLogin.relocate(90.0, 240.0);
       passwordFieldLogin.relocate(190.0, 240.0);
       passwordFieldLogin.getStyleClass().add("tabelInput");
       Label salah2 = new Label();
       salah2.getStyleClass().add("error");
       salah2.relocate(190.0, 300.0);
       Button submit1 = new Button("Submit");
       submit1.getStyleClass().add("buttonS");
       submit1.relocate(440.0, 300.0);
       submit1.setOnAction((e) -> {
          String username = usernameLogin2.getText();
          String password = passwordFieldLogin.getText();
          if (this.userCredentials.containsKey(username) && ((String)this.userCredentials.get(username)).equals(password)) {
             this.currentLoggedInUser = username;
             stage.setScene(this.profileScene(stage));
          } else {
             salah2.setText("Invalid username or password");
             salah2.getStyleClass().add("warning");
             salah2.relocate(360.0, 267.0);
          }
 
       });
       Button back = new Button("Back");
       back.getStyleClass().add("buttonS");
       back.relocate(270.0, 340.0);
       back.setOnAction((e) -> {
          stage.setScene(this.mainMenuScene(stage));
       });
       Pane root = new Pane();
       root.getChildren().addAll(new Node[]{loginLabel, passLogin, passwordFieldLogin, usernameLogin1, usernameLogin2, back, submit1, salah2});
       root.getStyleClass().add("latar");
       Scene scene = new Scene(root, 640.0, 480.0);
       scene.getStylesheets().add(this.getClass().getResource("/Style/Style.css").toExternalForm());
       return scene;
    }
 
    private Scene profileScene(Stage stage) {
       Label profil = new Label("PROFILE");
       profil.getStyleClass().add("judul");
       profil.relocate(250.0, 100.0);
       String[] profileDetails = ((String)this.userProfiles.get(this.currentLoggedInUser)).split(", ");
       Label hasilNama = new Label("Name\t: " + profileDetails[0]);
       hasilNama.getStyleClass().add("input");
       hasilNama.relocate(90.0, 170.0);
       Label hasilDate = new Label("" + profileDetails[1]);
       hasilDate.getStyleClass().add("input");
       hasilDate.relocate(90.0, 210.0);
       Button back = new Button("Back");
       back.getStyleClass().add("buttonS");
       back.relocate(440.0, 340.0);
       back.setOnAction((e) -> {
          stage.setScene(this.mainMenuScene(stage));
       });
       Pane root = new Pane();
       root.getChildren().addAll(new Node[]{profil, back, hasilNama, hasilDate});
       root.getStyleClass().add("latar");
       Scene scene = new Scene(root, 640.0, 480.0);
       scene.getStylesheets().add(this.getClass().getResource("/Style/Style.css").toExternalForm());
       return scene;
    }
 
    public static void main(String[] args) {
       launch(args);
    }
 }
 