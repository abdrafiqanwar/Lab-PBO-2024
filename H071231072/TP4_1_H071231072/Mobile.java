package TP4_1_H071231072;

public class Mobile {
    String merk, model , deskripsi ;
    int harga , tahunProduksi ;

    public Mobile(){

    }

    Mobile (String merk , String model , int harga ,int tahunProduksi ,String deskripsi){
        this.merk = merk ;
        this.model= model ;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi ;
        this.deskripsi= deskripsi ;
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

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    void displayInfo(){
        System.out.println("merk              :" + merk);
        System.out.println("model             : " + model);
        System.out.println("Harga             :" + harga);
        System.out.println("tahunProduksi     :" + tahunProduksi);
        System.out.println("deskripsi        :" + deskripsi);
    }


    }


