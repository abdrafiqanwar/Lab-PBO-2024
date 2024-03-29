public class TP2_2_H071231093 {
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

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
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
            System.out.println("Masih tersedia, silakan pesan.");
        } else {
            System.out.println("Maaf, barang sudah habis.");
        }
    }

    public static void main(String[] args) {
        TP2_2_H071231093 PC = new TP2_2_H071231093();

        PC.setNama("RTX Geforce");
        PC.setID(4700);
        PC.setHarga(30000000);
        PC.setStok(10);

        PC.infoProduk();
        PC.cekStok();
    }
}
