
public class Bangunruang {
    double hitungLuasBangunRuang() {
        return 0.0;
    }
    
    double hitungVolume() {
        return 0.0;
    }
}

class Kubus extends Bangunruang {
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

class Balok extends Bangunruang {
    double panjang;
    double lebar;
    double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    double hitungLuasBangunRuang() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

class Bola extends Bangunruang {
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

class Tabung extends Bangunruang {
    double jariJari;
    double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    double hitungLuasBangunRuang() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}


