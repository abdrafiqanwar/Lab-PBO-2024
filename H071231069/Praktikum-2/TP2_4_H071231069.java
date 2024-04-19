package TP2_H071231069;

class Alamat {
    String jalan , kota;
   
    public String getAlamat() {
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    String nim;
    String nama;
    
    Alamat alamat = new Alamat(); //obj dlam kelas

    String getNama() {
        return nama;
    }

    String getAlamat() {
        return alamat.getAlamat();
    }

    String getNim() {
        return nim;
    }
}

public class TP2_4_H071231069 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Balang Baru";
        alamat.kota = "Makassar";
 
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Novi Rezkiyah Azzahrah Ramadhani";
        mahasiswa.nim = "H071231069";

        System.out.println("Nama   : " + mahasiswa.getNama());
        System.out.println("NIM    : " + mahasiswa.getNim());
        System.out.printf("Alamat : " + mahasiswa.getAlamat());
    }
}


