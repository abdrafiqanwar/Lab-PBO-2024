package TP7;

class Karyawan extends Keluarga {
    private String nama;
    private int umur;
    private String jabatan;
    private double gaji;
    private Pengalaman pengalaman;
    private Projek projek;

    public Karyawan(String nama, int umur, String jabatan, double gaji, String jumlahAnak, int statuss) {
        super(jumlahAnak, statuss);
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public void display() {
        System.out.println("Detail Karyawan: ");
        System.out.println("Nama            : " + getNama());
        System.out.println("Umur            : " + getUmur());
        System.out.println("Jabatan         : " + getJabatan());
        System.out.println("Gaji            : " + getGaji());

        if (this instanceof Keluarga) {
            Keluarga karyawanKeluarga = (Keluarga) this;
            if (karyawanKeluarga.getStatusKeluarga() == 2) {
                System.out.println("Status : Sudah menikah, memiliki " + karyawanKeluarga.getJumlahAnak() + " anak");
            } else {
                System.out.println("Status : Belum menikah");
            }
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public Projek getProjek() {
        return projek;
    }

    public void setProjek(Projek projek) {
        this.projek = projek;
    }


    public Pengalaman getPengalaman() {
        return pengalaman;
    }

    public void setPengalaman(Pengalaman pengalaman) {
        this.pengalaman = pengalaman;
    }
}
