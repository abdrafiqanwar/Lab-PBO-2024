public class BangunRuang {
    double hitungLuasBangunRuang() {
        return 0.0;
    }
    
    double hitungVolume() {
        return 0.0;
    }
}

class Kubus extends BangunRuang {
    double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    double hitungLuasBangunRuang() {
        return 6 * Math.pow(sisi, 2);
    }

    double hitungVolume() {
        return Math.pow(sisi, 3);
    }
}
