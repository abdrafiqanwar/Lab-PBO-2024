public class Main1 {
        public static void main(String[] args) {
            Smartphone smartphone = new Smartphone(10, "samsung");
            Car car = new Car(20, "Black", 20);
            Pitbull pitbull = new Pitbull(2, 70);
            SiberianHusky siberianHusky = new SiberianHusky(0, 1);
            Bulldog bulldog = new Bulldog(0, 6);
            GermanShepherd germanShepherd = new GermanShepherd(0, 1);
            
            System.out.println("---------------------------------------------------------------------------------------------");
            pitbull.move();
            pitbull.describe();
            System.out.println("---------------------------------------------------------------------------------------------");
            siberianHusky.move();
            siberianHusky.describe();
            System.out.println("---------------------------------------------------------------------------------------------");
            bulldog.move();
            bulldog.describe();
            System.out.println("---------------------------------------------------------------------------------------------");
            germanShepherd.move();
            germanShepherd.describe();
            System.out.println("---------------------------------------------------------------------------------------------");
            smartphone.move();
            System.out.println("---------------------------------------------------------------------------------------------");
            car.move();
            System.out.println("---------------------------------------------------------------------------------------------");
        }
 }

