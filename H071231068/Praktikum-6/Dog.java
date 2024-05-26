package TP6;

abstract class Dog implements Void1 {
    int position;
    int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
}

class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("Pitbull bergerak sebanyak 3, Posisi Sekarang : " + this.position);
    }

    
    public void describe() {
        System.out.println("Pitbull adalah salah satu jenis anjing yang kuat dan berotot. ");
        System.out.println("-------------------------");
    }
}

class Siberian_Husky extends Dog {
    public Siberian_Husky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 2;
        System.out.println("Siberian Husky bergerak sebanyak 2, Posisi Sekarang : " + this.position);
    }


    public void describe() {
        System.out.println("Siberian Husky adalah anjing pembawa kereta luncur. ");
        System.out.println("-------------------------");
    }
}

class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 1;
        System.out.println("Bulldog bergerak sebanyak 1, Posisi Sekarang : " + this.position);
    }


    public void describe() {
        System.out.println("Bulldog adalah anjing yang agresif dan tangguh. ");
        System.out.println("-------------------------");
    }
}

class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("German Shepherd bergerak sebanyak 3, Posisi Sekarang : " + this.position);
    }


    public void describe() {
        System.out.println("German Shepherd merupakan anjing Gembala Jerman sering digunakan untuk menggembalakan domba");
        System.out.println("-------------------------");
    }
}

