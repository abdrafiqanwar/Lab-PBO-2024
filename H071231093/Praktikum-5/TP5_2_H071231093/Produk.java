public class Produk {
    protected String merek;
    protected int nomorSeri;
    protected double harga;

    public Produk(String merek, int nomorSeri, double harga) {
        this.merek = merek;
        this.nomorSeri = nomorSeri;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Nomor Seri: " + nomorSeri);
        System.out.println("Harga: Rp" + harga);
    }
}

class Ponsel extends Produk {
    private double ukuranLayar;
    private int kapasitasPenyimpanan;

    public Ponsel(String merek, int nomorSeri, double harga, double ukuranLayar, int kapasitasPenyimpanan) {
        super(merek, nomorSeri, harga);
        this.ukuranLayar = ukuranLayar;
        this.kapasitasPenyimpanan = kapasitasPenyimpanan;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
        System.out.println("Kapasitas Penyimpanan: " + kapasitasPenyimpanan + " GB");
    }
}

class Kamera extends Produk {
    private int resolusi;
    private String tipeLensa;

    public Kamera(String merek, int nomorSeri, double harga, int resolusi, String tipeLensa) {
        super(merek, nomorSeri, harga);
        this.resolusi = resolusi;
        this.tipeLensa = tipeLensa;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Resolusi: " + resolusi + " MP");
        System.out.println("Tipe Lensa: " + tipeLensa);
    }
}

class Laptop extends Produk {
    private int ukuranRAM;
    private String tipeProsesor;

    public Laptop(String merek, int nomorSeri, double harga, int ukuranRAM, String tipeProsesor) {
        super(merek, nomorSeri, harga);
        this.ukuranRAM = ukuranRAM;
        this.tipeProsesor = tipeProsesor;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ukuran RAM: " + ukuranRAM + " GB");
        System.out.println("Tipe Prosesor: " + tipeProsesor);
    }
}


