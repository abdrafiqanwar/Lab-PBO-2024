public class Main {
    public static void main(String[] args) {
        HotWheels mobil1 = new HotWheels("Lamborghini", 4, 20000, 0);
        HotWheels mobil2 = new HotWheels("Tesla", 4, 50000, 0);

        System.out.println();
        mobil1.showSpec();
        mobil2.showSpec();
        printBarriers();
        mobil1.upgrade(50000);
        printBarriers();
        mobil2.upgrade(50000);
        printBarriers();
        System.out.println();
        mobil2.showSpec();
        printBarriers();
        mobil2.raceTo(mobil1);
        printBarriers();
        mobil1.raceTo(mobil2);
        printBarriers();
        System.out.println();
        mobil1.showSpec();
        mobil2.showSpec();
    }

    public static void printBarriers() {
        System.out.println("================================");
    }
}