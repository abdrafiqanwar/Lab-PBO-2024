class Balok extends BangunRuang {
    double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    double hitungLuasBangunRuang() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}