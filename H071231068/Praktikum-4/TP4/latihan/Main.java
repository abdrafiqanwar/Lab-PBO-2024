package latihan;

public class Main {
    public static void main(String[] args) {
        Leptop leptop = new Leptop();
        SelfUtils selfUtils = new SelfUtils();
        leptop.setMerk("lenofo");
        leptop.setModel("legion 2");
        leptop.setHarga(80000000);
        leptop.setTahunProduksi("2024");
        leptop.setDeskripsi("SSD Gen 4,layar lebar");

        leptop.displayInfo();
        selfUtils.displaySelfData();


    }
    
}
