public class Main {
    public static void main(String[] args) {
        HotWheels mercedesDenz = new HotWheels("Mercedes-Denz", 4, 50000);
       
        HotWheels ferharri = new HotWheels("Ferharri",4,450);
        
        ferharri.setName("Ferharri");
        ferharri.setSpeed(4);
        ferharri.setCash(50000);

        System.out.println();
        mercedesDenz.showSpec();
        ferharri.showSpec();

        printBarriers();
        mercedesDenz.upgrade(50000);
        printBarriers();
        ferharri.upgrade(50000);
        printBarriers();

        System.out.println();
        ferharri.showSpec();

        printBarriers();
        mercedesDenz.raceTo(ferharri); // corrected method call
        printBarriers();
        ferharri.raceTo(mercedesDenz); // corrected method call
        printBarriers();

        System.out.println();
        mercedesDenz.showSpec();
        ferharri.showSpec();
    }

    public static void printBarriers() {
        System.out.println("================================");
    }

}