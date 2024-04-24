package nomor2;
public class Main {
    public static void main(String[] args) {
        HotWheels mercebesDenz = new HotWheels("Mercebes-Denz", 4, 20000, 0);
        HotWheels ferharri = new HotWheels("Ferharri", 4, 50000, 0);

        System.out.println();
        mercebesDenz.showSpec();
        ferharri.showSpec();
        printBarriers();
        mercebesDenz.upgrade(50000);
        printBarriers();
        ferharri.upgrade(50000);
        printBarriers();
        System.out.println();
        ferharri.showSpec();
        printBarriers();
        ferharri.raceTo(mercebesDenz);
        printBarriers();
        mercebesDenz.raceTo(ferharri);
        printBarriers();
        System.out.println();
        mercebesDenz.showSpec();
        ferharri.showSpec();
    }

    public static void printBarriers() {
        System.out.println("================================");
    }
}
