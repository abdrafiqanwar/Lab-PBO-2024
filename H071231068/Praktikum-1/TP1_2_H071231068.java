package Tugas.tugas1;

import java.util.Scanner;

public class TP1_2_H071231068 {
    public static void main(String[] args) {
        String kata;
        System.out.print("Mkasukan judul Film : ");
        Scanner scen = new Scanner(System.in);
        kata = scen.nextLine();
        String katalover = kata.toLowerCase();
        String[] kapitalKata = katalover.split(" ");
        for (int i = 0; i < kapitalKata.length; i++) {
            kapitalKata[i] = kapitalKata[i].substring(0, 1).toUpperCase() + kapitalKata[i].substring(1);
        }
        String result = String.join(" ", kapitalKata);
        System.out.println(result);
        return;
    }
}
