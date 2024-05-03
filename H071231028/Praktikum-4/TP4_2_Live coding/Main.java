public class Main {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("Informasi objek laptop 1");
        System.out.println("=============================================");

        laptop laptop1 = new laptop();
       
        laptop1.setMerek("Acer");
        laptop1.setModel("flip");
        laptop1.setHarga(10000000);
        laptop1.setTahunProduksi(2020);
        laptop1.setDeskripsi("laptop dengan kamera canggih.");

        laptop1.displayInfo();
        
        laptop laptop2 = new laptop();
        System.out.println("=============================================");
        laptop2.setMerek("Asus");
        laptop2.setModel("Gaming");
        laptop2.setHarga(12000000);
        laptop2.setTahunProduksi(2021);
        laptop2.setDeskripsi("Laptop dengan performa cepat.");

        System.out.println("Informasi Objek Laptop 2:");
        System.out.println("=============================================");
        System.out.println("Merek: " + laptop2.getMerek());
        System.out.println("Model: " + laptop2.getModel());
        System.out.println("Harga: " + laptop2.getHarga());
        System.out.println("Tahun Produksi: " + laptop2.getTahunProduksi());
        System.out.println("Deskripsi: " + laptop2.getDeskripsi());
        System.out.println("=============================================");

       
        SelfUtils.displayseldata();
    }
}
        


    
    

