public class TP2_1_H071231093 {
    String name;
    int age;
    boolean isMale;

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

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
        TP2_1_H071231093 orang = new TP2_1_H071231093(); 
        orang.setName("Muhamad Tegar Adyaksa");
        orang.setAge(19);
        orang.setGender(true);

        System.out.println("Nama\t: " + orang.getName());
        System.out.println("Umur\t: " + orang.getAge());
        System.out.println("Gender\t: " + orang.getGender());
    }
}
