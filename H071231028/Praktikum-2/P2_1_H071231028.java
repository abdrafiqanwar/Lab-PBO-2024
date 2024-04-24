// import java.util.Scanner;

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
        return (isFemale ? "Female" : "Male");
    }
}

public class P2_1_H071231028 {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // String nama = input.nextLine();
        // int umur = input.nextInt();
        // boolean laki = input.nextBoolean();

        Person obj = new Person();

        obj.setName("Nugrah");
        obj.setAge(19);
        obj.setGender(true); // true for female

        System.out.println("Hello, My Name is " + obj.getName());
        System.out.println("I'm " + obj.getAge() + " years old");

        if (obj.getGender().equals("Male")) {
            System.out.println("I've balls and that makes me a " + obj.getGender());
        } 
        else if (obj.getGender().equals("Female")) {
            System.out.println("I've a righteous heart and that makes me a " + obj.getGender());
        }

        // input.close();
    }
}
