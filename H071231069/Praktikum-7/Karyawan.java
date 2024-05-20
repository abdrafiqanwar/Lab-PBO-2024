public class Karyawan {
    String nama, jabatan;
    int umur;
    double gaji;


    public Karyawan(String nama, int umur,String pendidikanTerakhir, double gaji){
        this.nama = nama;
        this.umur = umur;
        this.gaji = gaji;
        this.jabatan = "Karyawan";
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getJabatan() {
        return jabatan;
    }
    
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getGaji() {
        return gaji;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public void tampilkanDetail() {
        System.out.println("Nama               : " + nama);
        System.out.println("Umur               : " + umur);
        System.out.println("Jabatan            : " + jabatan);
        System.out.println("Gaji               : " + gaji);
        System.out.println("--------------------------------------");
    }
}
