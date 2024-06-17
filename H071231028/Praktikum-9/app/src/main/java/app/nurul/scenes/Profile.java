package app.nurul.scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Profile {
    private Stage stage;
    private String nama;
    private String id;
    private String posisi;
    private String tmasuk;

    public Profile(Stage stage) {
        this.stage = stage;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getTmasuk() {
        return tmasuk;
    }

    public void setTmasuk(String tmasuk) {
        this.tmasuk = tmasuk;
    }

    public void show() {
        Label b = new Label("SELAMAT DATANG\n ");
        b.getStyleClass().add("judul");
    

        Image foto = new Image("Image/profil.jpg");
        ImageView viewFoto = new ImageView(foto);
        viewFoto.setFitHeight(150);
        viewFoto.setFitWidth(150);

        VBox gambar = new VBox(viewFoto);
        gambar.setPadding(new Insets(10, 0, 10, 150)); // Add padding around the image
        gambar.setAlignment(Pos.CENTER); // Center the image vertically

        Label lnama = new Label("NAMA\t\t\t : " + nama);
        lnama.getStyleClass().add("pro");

        Label lid = new Label("ID\t\t\t\t : " + id);
        lid.getStyleClass().add("pro");

        Label lposisi = new Label("POSISI\t\t\t : " + posisi);
        lposisi.getStyleClass().add("pro");

        Label lmasuk = new Label("TAHUN MASUK\t : " + tmasuk);
        lmasuk.getStyleClass().add("pro");

        VBox textVBox = new VBox(lnama, lid, lposisi, lmasuk);
        textVBox.setSpacing(10);
        textVBox.setAlignment(Pos.TOP_LEFT);

        HBox content = new HBox(textVBox, gambar);
        content.setSpacing(20); // Increase spacing between text and image
        content.setPadding(new Insets(10));
        content.setAlignment(Pos.TOP_LEFT);

        Button back = new Button("HOME");
        back.getStyleClass().add("home");
        back.setMaxHeight(30);
        back.setPrefHeight(30);
        back.setOnAction(e -> {
            Home home = new Home(stage);
            home.show();
        });

        HBox be = new HBox(b);
        be.setAlignment(Pos.CENTER);

        HBox buttonBox = new HBox(back);
        buttonBox.setAlignment(Pos.BOTTOM_RIGHT);

        VBox hbox = new VBox(be, content, buttonBox);
        hbox.setSpacing(20);
        hbox.setPadding(new Insets(10));
        hbox.setAlignment(Pos.TOP_LEFT);
        hbox.getStylesheets().add(getClass().getResource("/styles/Styles.css").toExternalForm());

        stage.getScene().setRoot(hbox);
    }
}
