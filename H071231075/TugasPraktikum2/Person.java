package TugasPraktikum2;

public class Person {
    String name;
    int age;
    boolean isMale;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }
    public String getGender() {
        return isMale ? "Laki-laki" : "Perempuan";
    }

    public static void main(String[] args) {
        Person orang = new Person();
        orang.setName("Muh.Fauzan");
        orang.setAge(19);
        orang.setGender(true);

        System.out.println("Nama\t: " + orang.getName());
        System.out.println("Umur\t: " + orang.getAge());
        System.out.println("Gender\t: " + orang.getGender());
    }
}