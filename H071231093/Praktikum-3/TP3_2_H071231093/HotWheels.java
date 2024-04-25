public class HotWheels {
    String name;
    double speed;
    double cash;
    int winningAmount;

    // TODO 1 : Constructor
    public HotWheels(String name, double speed, double cash, int winningAmount) {
        this.name = name;
        this.speed = speed;
        this.cash = cash;
        this.winningAmount = winningAmount;
    }

    // TODO 2 : Getter
    public void showSpec() {
        System.out.println("========== Specification ==========");
        System.out.println("Name : " + getName());
        System.out.println("Speed : " + getSpeed());
        System.out.println("Winning Amount : " + getWinningAmount());
        System.out.println("Cash : Rp. " + getCash() + "\n");
    }

    public void upgrade(int budget) {
        if (budget > getCash()) {
            System.out.printf("%s cannot be upgraded, not enough money...\n", getName());
        } else {
            int increaseSpeed = budget / 50000;
            setSpeed(getSpeed() + increaseSpeed); // TODO 3 : Increase the Car's Speed
            setCash(getCash() - budget + (budget % 50000));
            System.out.printf("Increases the speed of %s by %d...\n", getName(), increaseSpeed);
        }
    }

    public void raceTo(HotWheels enemy) {
        if (this.getSpeed() > enemy.getSpeed()) { // TODO 4
            this.setWinningAmount(this.getWinningAmount() + 1); // TODO 5 : Increase the Winning Amount
            this.setCash(this.getCash() + 40000); // TODO 6 : Increase the Car's Cash 
            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", this.getName(), enemy.getName(), this.getWinningAmount()); // TODO 7 : Call all the Getter
        } else if (this.getSpeed() == enemy.getSpeed()) {
            System.out.printf("%s with %s are equally strong! The match ended in a draw...\n", this.getName(), enemy.getName());
        } else {
            enemy.setWinningAmount(enemy.getWinningAmount() + 1); // TODO 8 : Increase the Enemy's winning Amount
            enemy.setCash(enemy.getCash() + 40000); // TODO 9 : increase Enemy's Cash
            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", enemy.getName(), enemy.getName(), enemy.getWinningAmount());
        }
    }

     // TODO 10 : Setter and Getter
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public int getWinningAmount() {
        return winningAmount;
    }

    public void setWinningAmount(int winningAmount) {
        this.winningAmount = winningAmount;
    }
}
