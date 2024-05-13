package TP6;

class Car implements Void1{

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
        System.out.println("-------------------------");
    }
}

