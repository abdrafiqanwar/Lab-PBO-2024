package TP2_H071231069;
class Produk {
    String id , nama;
    int stok , harga;
  
    void checkProduct() { //utk sysout print
        System.out.println("ID Produk \t: " + this.id);
        System.out.println("Nama Produk \t: " + this.nama);
        System.out.println("Stok \t\t: " + this.stok);
        System.out.println("Harga \t\t: Rp. " + this.harga);
    }

    String checkStock() {
        if (this.stok > 0) {
            return "Produk " + this.nama + " tersedia di stok";
        } else {
            return "Produk " + this.nama + " lagi tidak tersedia di stok";
    }
    }
}

public class TP2_2_H071231069 {
    public static void main(String[] args) {
        Produk item = new Produk();

        item.id = "NV";
        item.nama = "Parfum";
        item.stok = 200;
        item.harga = 25000;
        
        item.checkProduct();
        System.out.println("\n" + item.checkStock() + "\n");

        Produk cosmetic = new Produk();
        
        cosmetic.id = "RA";
        cosmetic.nama = "Chusion";
        cosmetic.stok = 156;
        cosmetic.harga = 5000;
        
        cosmetic.checkProduct();
        System.out.println("\n" + cosmetic.checkStock());
    }
}