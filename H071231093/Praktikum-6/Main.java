public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, "silver", 200);
        System.out.println();printBarriers();
        car.move();

        Smartphone smartphone = new Smartphone(100000, "vivo");
        smartphone.move();

        Pitbull pitbull = new Pitbull(3, 50);
        pitbull.move();
        pitbull.Describe();
        System.out.println();printBarriers();
    }
    public static void printBarriers() {
        System.out.println("===================================");
    }
}
