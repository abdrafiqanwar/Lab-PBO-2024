package latihan;

class Leptop{
    private String Merk;
    private String Model;
    private int Harga;
    private String tahunProduksi;
    private String Deskripsi;

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String merk) {
        Merk = merk;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int harga) {
        Harga = harga;
    }

    public String getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(String tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.Deskripsi = deskripsi;
    }

    public void displayInfo() {
        System.out.println("Merk    :" + Merk);
        System.out.println("Model   :" + Model);
        System.out.println("Harga   :" + Harga);
        System.out.println("Tahun   :" + tahunProduksi);
        System.out.println("Deskripsi   :" + Deskripsi);
    }
}
    




