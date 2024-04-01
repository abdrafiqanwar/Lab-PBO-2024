package Tugas.tugas2;

public class tp02 {
    int ID; 
    String Nama; 
    int Stok; 
    int Harga;
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getNama() {
        return Nama;
    }
    public void setNama(String nama) {
        Nama = nama;
    }
    public int getStok() {
        return Stok;
    }
    public void setStok(int stok) {
        Stok = stok;
    }
    public void stokStatus(){
        //print stock status
        if (Stok < 1) {
            System.out.println("Stok tidak tersedia");
        } else {
            System.out.println("Stok tersedia");
        }
    }
    public int getHarga() {
        return Harga;
    }
    public void setHarga(int harga) {
        Harga = harga;
    }

    public static void main(String[] args) {
        tp02 EsBuah = new tp02();
        EsBuah.setID(1);
        EsBuah.setNama("Aqua");
        EsBuah.setHarga(5000);
        EsBuah.setStok(0);
        EsBuah.stokStatus();

        System.out.println("ID  : " + EsBuah.getID());
        System.out.println("Nama :  " + EsBuah.getNama());
        System.out.println("Jumlah Stok :  " + EsBuah.getStok());
        System.out.println("Harga: Rp."+EsBuah.getHarga());


        tp02 Somay = new tp02();
        Somay.setID(2);
        Somay.setNama("Wardah");
        Somay.setHarga(1000);
        Somay.setStok(50);
        Somay.stokStatus();

        System.out.println("ID  : " + Somay.getID());
        System.out.println("Nama :  " + Somay.getNama());
        System.out.println("Jumlah Stok :  " + Somay.getStok());
        System.out.println("Harga: Rp."+Somay.getHarga());
    }
}
