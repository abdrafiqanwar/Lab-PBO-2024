import java.util.Scanner;

public class TP1_1_H071201025 {
    
    public static void main (String[]args){

        Scanner scan = new Scanner (System.in);


        System.out.println("berapa banyak angka? : ");
        int repeat2 = scan.nextInt();
        scan.nextLine ();


        System.out.println("Masukan barisan angka ");
        double[] userinput2 = new double[repeat2];

        try {
            for(int i = repeat2-1; i >= 0 ; i--){
                userinput2[i]= scan.nextDouble();
            }
        } catch (Exception e) {
            System.out.println("bukan angka");
            return;
        }

        HitungDecimmal1(userinput2,repeat2);

    }

    static void HitungDecimmal1(double[] userinput, int repeat){
        int bulat = 0;
        int decimal = 0;
        
        for(int i = repeat - 1; i >= 0 ; i--){
            if(userinput[i] % 1 != 0){
            decimal ++;}
            else{bulat ++;}
        }

        System.out.println(decimal + " Bilangan Decimal\n" + bulat +  " Bilagan Bulat");
    }


}