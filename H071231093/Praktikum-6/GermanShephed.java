class GermanShepherd extends Dog {
    GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("German Shepherd bergerak ke kanan menjadi posisi" + this.position);
    }

    @Override
    public void Describe() {
        System.out.println("Struktur tubuh yang agak memanjang, proporsional, berotot, dan memiliki struktur tulang yang solid.");
    }
}
