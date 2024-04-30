package Praktikum4;

public class main {
    public static void main(String[] args) {
        laptop asus = new laptop(merk:null, model:null, harga:0, tahunproduksi:null, deskripsi:null);
        asus.setMerk(merk:"Lenovo");
        asus.setModel(model:"Thinkpad");
        asus.setHarga(harga: 200000);
        asus.setTahunproduksi(tahunproduksi:"2014");
        asus.setDeskripsi("Laptop punya daya tahan lama");

        System.out.println();printBarrier();
        asus.displayInfo();
            
    }

}
