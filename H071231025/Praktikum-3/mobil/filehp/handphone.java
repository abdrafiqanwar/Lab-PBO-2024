package filehp;
class handphone {
   String merk, model,deskripsi;
    int harga, tahunProduksi;
   
    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public handphone(String merk, String model, String deskripsi, int harga, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }






     public void displayinfo() {
        
        System.out.println("============ Specification ============");
        System.out.println("Merk : " + merk);
        System.out.println("Model : " + model);
        System.out.println("Deskripsi : " + deskripsi);
        System.out.println("Harga : " + harga);
        System.out.println("Tahun Produksi : " + tahunProduksi);
        System.out.println("========================================");
     }

    
    public static void main(String[] args) {
    handphone ipon = new handphone("ipon", "14", "boba", 200000, 2021);;
    handphone sumsang = new handphone("sumsang", "S20", "Kotak", 300000, 2020);
    ipon.displayinfo();
    sumsang.displayinfo();
  }
    




    
}





