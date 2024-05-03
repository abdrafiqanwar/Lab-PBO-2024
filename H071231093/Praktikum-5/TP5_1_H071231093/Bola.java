class Bola extends BangunRuang{
    double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    double hitungLuasBangunRuang() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    double hitungVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}