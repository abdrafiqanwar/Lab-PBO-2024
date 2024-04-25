import java.util.Scanner;
import java.util.ArrayList;

class Film {
    String judul, genre;
    double durasi;
    
    public Film() {}

    public Film(String judul, String genre, double durasi) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
    }

    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public double getDurasi() {
        return durasi;
    }
    public void setDurasi(double durasi) {
        this.durasi = durasi;
    }  
}

class Bioskop {
    // Attribute
    private String namaBioskop;
    private String lokasi;
    private int jumlahKursiTersedia;

    ArrayList <Film> daftarFilm = new ArrayList<>();

    // Constructor tanpa parameter
    public Bioskop() {}

    // Constructor dengan parameter
    public Bioskop(String namaBioskop, String lokasi, int jumlahKursiTersedia) {
        this.namaBioskop = namaBioskop;
        this.lokasi = lokasi;
        this.jumlahKursiTersedia = jumlahKursiTersedia;
    }

    // Getter dan Setter
    public String getNamaBioskop() {
        return namaBioskop;
    }

    public void setNamaBioskop(String namaBioskop) {
        this.namaBioskop = namaBioskop;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public int getJumlahKursiTersedia() {
        return jumlahKursiTersedia;
    }

    public void setJumlahKursiTersedia(int jumlahKursiTersedia) {
        this.jumlahKursiTersedia = jumlahKursiTersedia;
    }

    // Behaviour 1: Menampilkan informasi tentang bioskop
    public void displayInfo() {
        System.out.println("==================== Informasi Bioskop " + getNamaBioskop() +  " ====================");
        System.out.println("Nama Bioskop           : " + getNamaBioskop());
        System.out.println("Lokasi                 : " + getLokasi());
        System.out.println("Jumlah Kursi Tersedia  : " + getJumlahKursiTersedia());
        for (Film film : daftarFilm) {
            System.out.println("\nJudul Film             : " + film.getJudul());
            System.out.println("Genre Film             : " + film.getGenre());
            System.out.println("Durasi Film            : " + film.getDurasi());
        }
    }

    // Behaviour 2: Melakukan penambahan Film
    public void tambahFilm(Film film) {
        daftarFilm.add(film);
        System.out.println(this.getNamaBioskop() + " Telah Menambahakan sebuah film " + film.genre + " berjudul " + film.getJudul());
    }
}

class Pemesanan {
    // Attribute
    private String namaPemesan;
    private int jumlahTiket;
    private Bioskop bioskopTujuan;

    // Constructor dengan parameter
    public Pemesanan(String namaPemesan, int jumlahTiket, Bioskop bioskopTujuan) {
        this.namaPemesan = namaPemesan;
        this.jumlahTiket = jumlahTiket;
        this.bioskopTujuan = bioskopTujuan;
    }

    // Getter dan Setter
    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    public Bioskop getBioskopTujuan() {
        return bioskopTujuan;
    }

    public void setBioskopTujuan(Bioskop bioskopTujuan) {
        this.bioskopTujuan = bioskopTujuan;
    }

    // Method untuk menampilkan informasi pemesanan
    public void watchTo(String judulFilm) {

        boolean filmDitemukan = false;
            
        // Iterasi daftar film di bioskop tujuan untuk mencari film dengan judul yang sesuai
        for (Film film : bioskopTujuan.daftarFilm) {
            if (film.getJudul().equalsIgnoreCase(judulFilm)) {
                filmDitemukan = true;
                System.out.println(getNamaPemesan() + " Membeli tiket film " + film.getJudul() + " di bioskop " + bioskopTujuan.getNamaBioskop() + " " + bioskopTujuan.getLokasi() + " sebanyak " + getJumlahTiket() + " tiket");
                System.out.println("==============================================");

                System.out.println("Informasi Pemesanan:");
                System.out.println("Nama Pemesan          : " + namaPemesan);
                System.out.println("Judul  Film           : " + film.getJudul());
                System.out.println("Jumlah Tiket          : " + jumlahTiket);
                System.out.println("Bioskop Tujuan        : " + bioskopTujuan.getNamaBioskop());
                System.out.println("Lokasi Bioskop Tujuan : " + bioskopTujuan.getLokasi());
                
                // Kurangi jumlah kursi yang tersedia di bioskop
                int kursiTersediaSekarang = bioskopTujuan.getJumlahKursiTersedia() - jumlahTiket;
                bioskopTujuan.setJumlahKursiTersedia(kursiTersediaSekarang);
                System.out.println("Jumlah Kursi Tersedia : " + kursiTersediaSekarang);
                break; // Keluar dari loop setelah menemukan film
            }
        }
    
        if (!filmDitemukan) {
            System.out.println("Film dengan judul '" + judulFilm + "' tidak ditemukan di bioskop " + bioskopTujuan.getNamaBioskop() + " " + bioskopTujuan.getLokasi());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Membuat objek bioskop A dengan 100 kursi tersedia
        System.out.println("==============================================");
        System.out.print("Masukkan Nama bioskop               : ");
        String namaBioskop = sc.nextLine();
        System.out.print("Masukkan lokasi bioskop             : ");
        String lokasi = sc.nextLine();
        System.out.print("Masukkan jumlah kursi yang tersedia : ");
        int jumlahKursiTersedia = sc.nextInt();
        sc.nextLine();

        Bioskop bioskopA = new Bioskop(namaBioskop, lokasi, jumlahKursiTersedia);
        
        System.out.println("==============================================");
        boolean tambahFilm = true;
        while (tambahFilm) {
            System.out.print("Masukkan judul film: ");
            String judul = sc.nextLine();
            
            System.out.print("Masukkan genre film: ");
            String genre = sc.nextLine();
            
            System.out.print("Masukkan durasi film (dalam menit): ");
            int durasi = sc.nextInt();
            sc.nextLine(); // Membersihkan newline di buffer

            // Membuat objek Film dan menambahkannya ke dalam daftarFilm
            Film filmBaru = new Film(judul, genre, durasi);
            bioskopA.tambahFilm(filmBaru);

            System.out.print("Ingin menambah film lagi? (ya/tidak): ");
            String jawaban = sc.nextLine();
            if (!jawaban.equalsIgnoreCase("ya")) {
                tambahFilm = false;
            }
        }

        bioskopA.displayInfo();
        System.out.println("==============================================");

        // Membuat objek pemesanan tiket
        System.out.print("Masukkan Nama Pemesan               : ");
        String namaPemesan = sc.nextLine();
        System.out.print("Masukkan Jumlah Tiket               : ");
        int jumlahTiket = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan Nama Film                  : ");
        String film = sc.nextLine();

        Pemesanan pemesanan1 = new Pemesanan(namaPemesan, jumlahTiket, bioskopA);
        
        pemesanan1.watchTo(film);

        sc.close();
    }
}
