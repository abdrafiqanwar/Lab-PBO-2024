package app.nurul.scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Home {
    private Stage stage;

    public Home(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        Label label = new Label("MASUKAN DATA");
        label.setTextFill(Color.rgb(32, 205, 141));
        label.setFont(Font.font("System", FontWeight.BOLD, 30));

        Label nama = new Label("Masukan Nama");
        nama.getStyleClass().add("isi");
        nama.setPadding(new Insets(0, 0, 0, 20));
        TextField tNama = new TextField();
        tNama.setMaxWidth(200); // Set max width
        tNama.getStyleClass().add("kolomk");
        VBox hnama = new VBox(nama, tNama);
        hnama.setSpacing(10);

        Label id = new Label("Masukan Id");
        id.setPadding(new Insets(0, 0, 0, 20));
        id.getStyleClass().add("isi");
        TextField tId = new TextField();
        tId.setMaxWidth(200); // Set max width
        tId.getStyleClass().add("kolomk");
        VBox hId = new VBox(id, tId);
        hId.setSpacing(10); 

        Label posisi = new Label("Posisi");
        posisi.setPadding(new Insets(0, 0, 0, 20));
        posisi.getStyleClass().add("isi");
        TextField tposis = new TextField();
        tposis.setMaxWidth(200); // Set max width
        tposis.getStyleClass().add("kolomk");
        VBox hposisi = new VBox(posisi, tposis);
        hposisi.setSpacing(10);

        Label masuk = new Label("Masuk");
        masuk.setPadding(new Insets(0, 0, 0, 20));
        masuk.getStyleClass().add("isi");
        TextField tMasuk = new TextField();
        tMasuk.setMaxWidth(200); // Set max width
        tMasuk.getStyleClass().add("kolomk");
        VBox hMasuk = new VBox(masuk, tMasuk);
        hMasuk.setSpacing(10);


        Button buton = new Button("NEXT");
        buton.getStyleClass().add("home");
        buton.setMaxHeight(30);
        buton.setPrefWidth(30);
        buton.setOnAction(e -> {
            if(tNama.getText().trim().isEmpty()) {
                return;
            } else {
                Profile pro = new Profile(stage);
                pro.setNama(tNama.getText());
                pro.setId(tId.getText());
                pro.setPosisi(tposis.getText());
                pro.setTmasuk(tMasuk.getText());
                pro.show();
            }
        });

        HBox box = new HBox(buton);
        box.setAlignment(Pos.BOTTOM_RIGHT);

        VBox gabung = new VBox(label, hnama, hId, hposisi, hMasuk, box);
        gabung.setAlignment(Pos.TOP_CENTER);
        gabung.setSpacing(25);
        gabung.setPadding(new Insets(10));
        gabung.getStylesheets().add(getClass().getResource("/styles/Styles.css").toExternalForm());
        stage.getScene().setRoot(gabung);

    }
}
