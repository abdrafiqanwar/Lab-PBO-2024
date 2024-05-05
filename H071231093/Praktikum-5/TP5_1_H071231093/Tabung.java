class Tabung extends BangunRuang {
    double jariJari, tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    double hitungLuasBangunRuang () {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}