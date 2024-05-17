package Classes;

import java.util.Scanner;

public class Projek {
    Scanner input = new Scanner(System.in);
    private int projek;

    public Projek(){}

    public int getProjek(){
        int jumlahProjek = 0;
        if(projek == 1){
            jumlahProjek = 4;
        }else if(projek == 2){
            jumlahProjek = 8;
        }else if(projek == 3){
            jumlahProjek = 12;
        }else{
            jumlahProjek = 15;
        }
        return jumlahProjek;
    }

    public void projekIT() {
        boolean loop = true;
        while (loop) {
            try {
                System.out.println("Projek IT:");
                System.out.println("1. Minimal 4");
                System.out.println("2. Minimal 8");
                System.out.println("3. Minimal 12");
                System.out.println("4. Lebih dari 15");
                System.out.print("Input: ");
                this.projek = input.nextInt();
                
                if (projek >= 1 && projek <= 4) {
                    loop = false;
                } else {
                    System.out.println("Tolong pilih 1-4");
                }
            } catch (Exception e) {
                System.out.println("Tolong pilih 1-4");
                input.next(); // Clear the invalid input
            }
        }
    }    
}
