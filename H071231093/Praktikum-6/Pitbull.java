class Pitbull extends Dog {
    Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("Pitbull bergerak ke kanan menjadi posisi " + this.position);
    }

    @Override
    public void Describe() {
        System.out.println("Mereka biasanya memiliki badan yang pendek dengan kaki yang kuat.");
    }
}
