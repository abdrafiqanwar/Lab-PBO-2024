class Alamat {
    String jalan;
    String kota;

    public Alamat(String jalan, String kota) {
        this.jalan = jalan;
        this.kota = kota;
    }

    public String getAlamat() {
        return jalan + ", " + kota;
    }
}

public class TP2_4_H071231093 {
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

    class Main {
    public static void main(String[] args) {
        Alamat alamat = new Alamat("Perintis Kemerdekaan VII", "Makassar");

        TP2_4_H071231093 mahasiswa = new TP2_4_H071231093();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Muhamad Tegar Adyaksa";
        mahasiswa.nim = "H071231093";

        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("NIM\t: " + mahasiswa.getNim());
        System.out.println("Alamat\t: " + mahasiswa.getAlamat());
    }
}


