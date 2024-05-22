package TP8_2_H071231093;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text To Type ||");
        System.out.println("\""+typeRacer.getWordsToType() + "\"");


        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Asep", 80, typeRacer);
        typers[1] = new Typer("Bot Budi", 72, typeRacer);
        typers[2] = new Typer("Bot Coki",70,typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));
        typeRacer.startRace();
    }
}
