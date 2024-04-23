class Poin {
    private int seranganTangan;
    private int seranganKaki;
    private int bantingan;

    public Poin(int seranganTangan, int seranganKaki, int bantingan) {
        this.seranganTangan = seranganTangan;
        this.seranganKaki = seranganKaki;
        this.bantingan = bantingan;
    }

    public int getSeranganTangan() {
        return seranganTangan;
    }

    public int getSeranganKaki() {
        return seranganKaki;
    }

    public int getBantingan() {
        return bantingan;
    }

    public int getTotalPoin() {
        return seranganTangan + seranganKaki + bantingan;
    }
}

class Silat {
    private String nama;
    private String sudut;
    private Poin poin;

    public Silat() {
    }

    // Constructor 1
    public Silat(String nama) {
        this.nama = nama;
    }

    // Constructor 2
    public Silat(String nama, String sudut) {
        this.nama = nama;
        this.sudut = sudut;
    }

    // Behaviour 1
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPoin(Poin poin) {
        this.poin = poin;
    }

    // Behaviour 2
    public void setSudut(String sudut) {
        this.sudut = sudut;
    }

    public void getTotalPoin() {
        System.out.println("Total Poin: " + poin.getTotalPoin());
    }

    // Behaviour 1
    public void Identitas() {
        System.out.println("Nama: " + nama);
        System.out.println("Sudut: " + sudut);
    }
    
    // Behaviour 2
    public void menujukanPoin() {
        System.out.println("Poin Serangan Tangan: " + poin.getSeranganTangan());
        System.out.println("Poin Serangan Kaki: " + poin.getSeranganKaki());
        System.out.println("Poin Bantingan: " + poin.getBantingan());
        System.out.println("Total Poin: " + poin.getTotalPoin());
        System.out.println("===========");
    }

    public static void main(String[] args) {
        Silat silat = new Silat();
        silat.nama = "Wahyu";
        silat.sudut = "Merah";
        Poin poin = new Poin(10, 10, 20);
        silat.setPoin(poin);

        silat.Identitas();
        silat.menujukanPoin();

        Silat silat1 = new Silat("Diki", "Biru");
        Poin poin1 = new Poin(8, 9, 7);
        silat1.setPoin(poin1);

        silat1.Identitas();
        silat1.menujukanPoin();
    }

}