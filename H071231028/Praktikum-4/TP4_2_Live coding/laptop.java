public class laptop {
    private String merek;
    private String model;
    private double harga;
    private int tahunProduksi;
    private String Deskripsi;
    
    public laptop() {}

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public void setDeskripsi(String deskripsi) {
        this.Deskripsi = deskripsi;
    }

    
    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    public double getHarga() {
        return harga;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }


    public void displayInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Deskripsi: " + Deskripsi);
    }
}
     

    
    
     
    

