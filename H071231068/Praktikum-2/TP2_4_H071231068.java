package Tugas.tugas2;

class Alamat {
  private  String jalan;
    String kota;
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat.jalan + ", " + alamat.kota;
    }
}


public class Tp04{
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Ahmad";
        mahasiswa.nim = "H071231068";
        

        System.out.println("NAMA : " + mahasiswa.getNama());
        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("ALAMAT : " + mahasiswa.getAlamat());
    }
}

