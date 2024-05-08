class SiberianHusky extends Dog {
    SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 2;
        System.out.println("Siberian Husky bergerak ke kanan menjadi posisi" + this.position);
    }

    @Override
    public void Describe() {
        System.out.println("Bulunya tebal berwarna hitam, putih polos, abu-abu, atau cokelat kemerahan.");
    }
}
