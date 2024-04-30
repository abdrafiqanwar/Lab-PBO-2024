package TP4_2_H071231093;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(null, null, 0, null, null);

        laptop.setMerk("ASUS");
        laptop.setModel("Laptop Gaming ROG");
        laptop.setHarga(15000000);
        laptop.setTahunProduksi("2022");
        laptop.setDeskripsi("Laptop Gaming berkekuatan tinggi yang mampu menjalankan beberapa game-game berat!");

        Laptop laptop2 = new Laptop("Acer", "Acer Swift", 12000000, "2021", "Laptop ini cocok digunakan untuk berkerja kantoran!");

        System.out.println();printBarriers();
        laptop.displayInfo();
        System.out.println();printBarriers();
        laptop2.displayInfo();
        System.out.println();printBarriers();
        SelfUtils.displaySelfData();

    }

    public static void printBarriers() {
        System.out.println("=============================================");
    }
}
