package TugasPraktikum2;

public class Produk {
    String nama;
    int ID;
    int harga;
    int stok;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        this.ID = iD;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public int getStok() {
        return stok;
    }
    public void infoProduk() {
        System.out.println("Nama\t: " + nama);
        System.out.println("ID\t: " + ID);
        System.out.println("Harga\t: " + formatHarga());
        System.out.println("Stok\t: " + stok);
    }
    public String formatHarga() {
        return String.format("%,d", harga).replace(',', '.');
    }
    public void cekStok() {
        if (stok > 0) {
            System.out.println("Masih ada ji, pesan silahkan.");
        } else {
            System.out.println("Maaf, barangnya  sudah habis.");
        }
    }

    public static void main(String[] args) {
        Produk smartphone = new Produk();

        smartphone.setNama("iPhone 15 Pro Max");
        smartphone.setID(15);
        smartphone.setHarga(15000000);
        smartphone.setStok(5);

        smartphone.infoProduk();
        smartphone.cekStok();
    }
}

