public class TP2_04_H071231072 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "JL. Mutiara bouleovard summarecon mutiara makassar";
        alamat.kota = "Kota Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Rafly";
        mahasiswa.nim = "H0712321072";

        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("Alamat : " + mahasiswa.getAlamat());
    }
}

class Alamat {
    String jalan;
    String kota;

    public String getAlamat() {
        String x = "";
        x += jalan + ", " + kota;
        return x;
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