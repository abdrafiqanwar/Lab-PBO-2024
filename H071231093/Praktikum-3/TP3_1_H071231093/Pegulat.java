public class Pegulat {
    String ability;
    String division;
    double weight; // kg
    double height; // cm

    public Pegulat() {

    }

    public Pegulat(String ability, String division, double weight, double height) {
        this.ability = ability;
        this.division = division;
        this.weight = weight;
        this.height = height;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

   
}
