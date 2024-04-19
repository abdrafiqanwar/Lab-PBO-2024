import java.util.Scanner;

public class TP2_01_H071231072 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person rafly = new Person();

        System.out.print("Masukkan nama anda: ");
        String nama = input.nextLine();
        rafly.setName(nama);

        System.out.print("Masukkan umur anda: ");
        int umur = input.nextInt();
        input.nextLine(); 
        rafly.setAge(umur);

        System.out.print("Masukkan Jenis Kelamin anda (Laki-laki/Perempuan): ");
        String jenisKelamin = input.nextLine();
        rafly.setGender(jenisKelamin);

        
        //System.out.printf("\nDATA ANDA\nNama         : %s\nUmur         : %d\nJenis Kelamin: %s", rafly.getName(), rafly.getAge(), rafly.getGender());
        
        System.out.println(rafly.info());
        System.out.println(rafly.getName() + " is Male? " + rafly.getGender());
        input.close();
    }
}

class Person {
     String name;
     int age;
     boolean isMale;

    void setName(String nama) {
        this.name = nama; //atrbt 
    }

    String getName() {
        return name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void setGender(String jenisKelamin) {
        if (jenisKelamin.equalsIgnoreCase("Laki-laki")|| jenisKelamin.equalsIgnoreCase("laki-laki")) {
            this.isMale = true;
        } else {
            this.isMale = false;
        }
    }
    
    boolean getGender() {
        if (isMale) {
            return true;
        }else {
            return false;
        }
    }

    String info() {
        return "\nYour Data \nName : " + getName()+ "\nAge : " + getAge();
    }
}
