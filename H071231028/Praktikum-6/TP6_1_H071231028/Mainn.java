interface IMove {
    void move(); 
}

abstract class Dog implements IMove {
    int position;
    int averageLenght;

    public Dog(int position, int averageLenght) {
        this.position = position;
        this.averageLenght = averageLenght;
    }

    abstract void describe(); 
}

class Pitbul extends Dog {
    public Pitbul(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    public void move() {
        position += 3;
        System.out.println("Pitbul berpindah sebanyak " + position);
    }

    @Override
    public void describe() {
        System.out.println("Pitbul merupakan hewan yang kuat");
    }
}

class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    public void move() {
        position += 2;
        System.out.println("Siberian Husky berpindah sebanyak " + position);
    }

    @Override
    public void describe() {
        System.out.println("Siberian merupakan hewan lucu");
    }
}

class Bulldog extends Dog {
    public Bulldog(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    public void move() {
        position += 1;
        System.out.println("Bulldog berpindah sebanyak " + position);
    }

    @Override
    public void describe() {
        System.out.println("Bulldog merupakan hewan seram");
    }
}

class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    public void move() {
        position += 3;
        System.out.println("German Shepherd berpindah sebanyak " + position);
    }

    @Override
    public void describe() {
        System.out.println("German Shepherd merupakan hewan lucu");
    }
}

class Smartphone implements IMove {
    int price;
    String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}

class Car implements IMove {
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(120000, "Oppo");
        smartphone.move();
        Car car = new Car(5, "merah", 170);
        car.move();
        Bulldog bulldog = new Bulldog(10, 11);
        bulldog.move();
        bulldog.describe();

        String separator = new String(new char[50]).replace('\0', '=');
        
        System.out.println(separator);
        System.out.println("                    INFO PHONE                    ");
        System.out.println(separator);
        System.out.println("Brand \t: " + smartphone.brand);
        System.out.println("Price \t: " + smartphone.price);
        smartphone.move();

        System.out.println(separator);
        System.out.println("                     INFO CAR                     ");
        System.out.println(separator);
        System.out.println("Car's Total Forward Gear : " + car.totalForwardGear);
        System.out.println("Car's Color              : " + car.color);
        System.out.println("Car's Max Speed          : " + car.maxSpeed);
        car.move();

        System.out.println(separator);
        System.out.println("                     INFO DOG                     ");
        System.out.println(separator);
        bulldog.describe();
        System.out.println("Bulldog's Average Length  : " + bulldog.averageLenght);
        System.out.println("Bulldog's Position now    : " + bulldog.position);
        bulldog.move();
    }
}
