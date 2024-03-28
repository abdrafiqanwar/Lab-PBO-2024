
// Class Produk
class Produk {
    String ID, nama;
    int stok;
    double harga;

    public Produk(String iD, String nama, int stok, double harga) {
        ID = iD;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    void cekDataProduk() {
        System.out.println("DATA PRODUK");
        System.out.println("Nama        : " + nama);
        System.out.println("ID Produk   : " + ID);
        System.out.println("Stok        : " + stok);
        System.out.printf("Harga       : Rp. %.2f%n", harga);
    }

    void cekProduk() {
        if (stok == 0) {
            System.out.println("Tidak Tersedia");
        } else {
            System.out.println("Stok tersedia : " + stok);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Produk produk1 = new Produk("P001", "Produk 1", 10, 20000.00);
        produk1.cekDataProduk();
        produk1.cekProduk();

        Produk produk2 = new Produk("P002", "Produk 2", 0, 30000.00);
        produk2.cekDataProduk();
        produk2.cekProduk();
    }
}