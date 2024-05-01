package TP4_2_H071231093;

public class Laptop {
    private String merk;
    private String model;
    private int harga;
    private String tahunProduksi;
    private String deskripsi;
    
    public Laptop(String merk, String model, int harga, String tahunProduksi, String deskripsi) {
        this.merk = merk;
        this.model = model;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
        this.deskripsi = deskripsi;
    }

    public void displayInfo(){
        System.out.println("Informasi Laptop");
        System.out.println("Merk Laptop      : "  + this.getMerk());
        System.out.println("Model Laptop     : "  + this.getModel());
        System.out.println("Harga laptop     : "  + this.getHarga());
        System.out.println("Tahun Produksi   : "  + this.getTahunProduksi());
        System.out.println("Deskripsi Laptop : "  + this.getDeskripsi());

    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(String tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

}
