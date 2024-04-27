public class WWE {
    String name;
    Pegulat pegulat = new Pegulat();
    int age;
    double strength;

    public WWE() {

    }

    public WWE(String name, String PegulatAbility, String pegulatDivision, double pegulatWeight, double pegulatHeight, int age, double strength) {
        this.name = name;
        this.pegulat.ability = PegulatAbility;
        this.pegulat.division = pegulatDivision;
        this.pegulat.weight = pegulatWeight;
        this.pegulat.height = pegulatHeight;
        this.age = age;
        this.strength = strength;
    }

    public void displayInfo() {
        System.out.println("========== WWE's information ==========");
        System.out.println("Name               : " + this.getName());
        System.out.println("Pegulat Division   : " + this.getPegulat().getDivision());
        System.out.println("Pegulat Ability    : " + this.getPegulat().getAbility());
        System.out.println("Pegulat Weight     : " + this.getPegulat().getWeight());
        System.out.println("Pegulat Height     : " + this.getPegulat().getHeight());
        System.out.println("Age                : " + this.getAge());
        System.out.println("Strenght           : " + this.getStrength());
    }

    public void InitializationStrenghtness(double strength) {
        this.setStrength(strength);
        System.out.printf("%s is initializing to strenght: %.1f", this.getName(), strength);
    }

    public void BodySize(double pegulatWeight, double pegulatHeight) {
        this.pegulat.weight = pegulatWeight;
        this.pegulat.height = pegulatHeight;
        System.out.printf("%s has %.2f and %.2f body size", this.getName(), pegulatWeight, pegulatHeight);
    }

    public void SpecialAbility(String pegulatAbility, int age) {
        this.pegulat.ability = pegulatAbility;
        this.age = age;
        System.out.printf("%s has special %s ability", this.getName(), pegulatAbility, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pegulat getPegulat() {
        return pegulat;
    }

    public void setPegulat(Pegulat pegulat) {
        this.pegulat = pegulat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

   

}