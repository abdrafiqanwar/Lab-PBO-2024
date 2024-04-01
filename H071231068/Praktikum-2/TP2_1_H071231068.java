package Tugas.tugas2;

public class tp01 {

    private String nama;
    private int age;
    private boolean isMale;
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isMale() { 
        return isMale;
    }

    public void setMale(boolean isMale) { 
        this.isMale = isMale;
    }
    
    public String  getGender(){
        if (isMale){
            return "Ya dia Laki-Laki";
        } 
        else{
            return "Dia Bukan Laki-laki";
        }
    }

    public static void main(String[] args) {
        tp01 boy = new tp01();
        boy.setNama("Maulana");
        boy.setAge(20);
        boy.setMale(true);
        System.out.println(boy.getNama());
        System.out.println(boy.getAge());
        System.out.println(boy.getGender());
        
        tp01 women = new tp01();
        women.setNama("Ana Tasya");
        women.setAge(18);
        women.setMale(false);
        System.out.println(women.getNama());
        System.out.println(women.getAge());
        System.out.println(women.getGender());
    }
}