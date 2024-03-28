package TP2_H071231069;

class Person {
    String name;
    int age;
    boolean isFemale;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }

    void setGender(boolean isFemale) {
        this.isFemale = isFemale;
    }

    String getGender() {
        return (isFemale ? "Female" : "Male"); // Ternary(menkondisikan)
    }
}

public class TP2_1_H071231069 {
    public static void main(String[] args) {

        Person obj = new Person(); // memanggil obj

        obj.setName("Novi");
        obj.setAge(19);
        obj.setGender(true);

        System.out.println("Hello, My Name is " + obj.getName());
        System.out.println("I'm " + obj.getAge() + " years old");

        if (obj.getGender() == "Female") {
            System.out.println("I've righteous heart and that makes me a " + obj.getGender());
        } 
        else if (obj.getGender() == "Male") {
            System.out.println("I've brave soul and that makes me a " + obj.getGender());
        }

    }
}