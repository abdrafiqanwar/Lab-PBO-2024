class Alamat {
    String alamat_jalan;
    String kota;

    public String getAlamat() {
        return alamat_jalan + ", " + kota;
    }
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
        return alamat.getAlamat();
    }
}

public class TP2_4_H071201025 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Roland Philip ";
        mahasiswa.nim = "H071231025";
        
        Alamat alamat = new Alamat();
        alamat.alamat_jalan = "Antang";
        alamat.kota = "Makassar";
        mahasiswa.alamat = alamat;

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}
