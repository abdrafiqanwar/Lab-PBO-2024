package TP8_1_H071231093;

public class Main {
    public static void main(String[] args) {
        Thread UiThread = new Thread(new UIThread());
        UiThread.start();
    }
}