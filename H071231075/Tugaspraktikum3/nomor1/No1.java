package nomor1;
class Ulti {
    String namaUlti = "Ultimate";
    int damageUlti = 50; // Default Damage

    public Ulti(){
    }
    public Ulti(String namaUlti , int damageUlti){
        this.namaUlti = namaUlti;
        this.damageUlti = damageUlti;
    }

    //setter getter
    public String getnamaUlti() {
        return namaUlti;
    }
    public void setNamaUlti(String namaUlti) {
        this.namaUlti = namaUlti;
    }

    public int getdamageUlti() {
        return damageUlti;
    }
    public void setDamageUlti(int damageUlti) {
        this.damageUlti = damageUlti;
    }
}

class Kaiju {
    String namaChar; 
    Ulti ulti = new Ulti();
    int health = 100;
    int damageBasicAtt = 10;
    int maxultipoint = 2;
    int ultipoint = 0;
    int skillpoint = 0;
    int damageskill = 20;

    //constructor
    public Kaiju(){
    }
    public Kaiju(String namaChar,int health,int damageBasicAtt,int damageskill ,int maxultipoint, String namaUlti, int damageUlti ){
        this.namaChar = namaChar;
        this.health = health;
        this.damageBasicAtt = damageBasicAtt;
        this.maxultipoint = maxultipoint;

        this.ulti.namaUlti = "Ulti";
        this.ulti.damageUlti = 50;
    }

    //behavior
    public void checkStatus(){
        System.out.println("===== Character Status =====");
        System.out.println("Nama             : " + this.namaChar);
        System.out.println("Nama Ulti        : " + this.ulti.getnamaUlti());
        System.out.println("damage Ulti      : " + this.ulti.getdamageUlti() );
        System.out.println("Health           : " + this.health);
        System.out.println("Damage Basic Att : " + this.damageBasicAtt);
        System.out.println("Skill Damage     : " + this.damageskill);
        System.out.println("Ulti Point       : " + this.ultipoint);
        System.out.println("Skill Points     : " + this.skillpoint);
    }
    public void basicAttack(Kaiju musuh){
        musuh.health = musuh.health - this.damageBasicAtt;
        this.ultipoint = this.ultipoint + 1;
        this.skillpoint = this.skillpoint + 1;
        System.out.printf("%s Melakukan Basic Attack ke %s\n", this.getnamaChar(), musuh.getnamaChar());
        if(musuh.getHealth() <= 0){
            System.out.printf("%s Kalah \n", musuh.getnamaChar());
        }
    }
    public void ultiAttack(Kaiju musuh){
        if(this.ultipoint >= this.maxultipoint){
            System.out.printf("%s Melancarkan %s ke %s\n",this.getnamaChar(), this.ulti.getnamaUlti(), musuh.getnamaChar() );
            musuh.health = musuh.health - this.ulti.getdamageUlti();
            this.health = this.health - musuh.ulti.getdamageUlti();
            this.ultipoint = 0;
            if(musuh.getHealth() <= 0){
                System.out.printf("%s telah Kalah \n", musuh.getnamaChar());
            }
        }
        else{
            System.out.printf("%s Tidak bisa menggunakan Ulti,point kurang\n",this.getnamaChar(),musuh.getnamaChar());
        }
    }
    public void skillAttack(Kaiju musuh){
        if(this.skillpoint > 0){
            musuh.health = musuh.health - this.damageskill;
            this.skillpoint = this.skillpoint - 1;
            this.ultipoint = this.ultipoint +1;
            System.out.printf("%s Melakukan Skill Attack ke %s\n", this.getnamaChar(), musuh.getnamaChar());
        }else{
            System.out.printf("%s Tidak bisa menggunakan Skill,point kurang\n",this.getnamaChar(),musuh.getnamaChar());
        }
    }

    // setter getter
    public String getnamaChar() {
        return this.namaChar;
    }
    public void setnamaChar(String name) {
        this.namaChar = name;
    }

    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public double getdamageBasicAtt() {
        return this.damageBasicAtt;
    }
    public void setdamageBasicAtt(int damageBasicAtt) {
        this.damageBasicAtt = damageBasicAtt;
    }

    public int getMaxultipoint(){
        return this.maxultipoint;
    }
    public void setMaxultipoint(int maxultipoint){
        this.maxultipoint = maxultipoint;
    }

    public void setNamaUlti(String namaUlti){
        this.ulti.namaUlti = namaUlti;
    }
    public void setDamageUlti(int damageUlti){
        this.ulti.damageUlti = damageUlti;
    }
    public int getdamageskill(){
        return this.damageskill;
    }
    public void setdamageskill(int damageskill){
        this.damageskill = damageskill;
    }
}

public class No1{
    public static void main(String[] args){
        Ulti ulti1 = new Ulti();
            ulti1.setNamaUlti("Gelombang kehidupan");
            ulti1.setDamageUlti(50);
        Kaiju char1 = new Kaiju();
            char1.setnamaChar("Godzilla");
            char1.setHealth(100);
            char1.setMaxultipoint(1);
            char1.setdamageBasicAtt(5);
            char1.setdamageskill(20);
            char1.setNamaUlti(ulti1.getnamaUlti());
            char1.setDamageUlti(ulti1.getdamageUlti());
        
        Ulti ulti2 = new Ulti("",20);
        Kaiju char2 = new Kaiju("Mecha Godzilla",100,10,20,2,ulti2.getnamaUlti(),ulti2.getdamageUlti());

        char1.checkStatus();
        char2.checkStatus();
        garis();

        char1.ultiAttack(char2);
        char2.ultiAttack(char2);
        garis(); //tidak dapat ulti karena ulti point kedua char kurang

        char1.basicAttack(char2);
        char2.basicAttack(char1);
        garis();

        char1.skillAttack(char2);
        char2.skillAttack(char1);
        garis();

        char1.checkStatus();
        char2.checkStatus();

        char2.skillAttack(char1);
        char1.ultiAttack(char2);
    }

    public static void garis(){
        System.out.println("===========================================");
    }
}
