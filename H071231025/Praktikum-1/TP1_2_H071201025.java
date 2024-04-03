import java.util.Scanner;

public class TP1_2_H071201025 {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String userinput = new String();

        try {
            System.out.println("Masukan Hasil Text yang Ingin Di konversi: ");
            userinput = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Text Tidak Valid!");
        }

        System.out.println(Title(userinput));

    }

    static String Title(String userinput) {
        userinput = userinput.toLowerCase();
        char[] inputArray = userinput.toCharArray();

        for (int i = 0; i < inputArray.length ; i++) {

            if(i == 0 || inputArray[i-1] == ' '){

                inputArray[i] = Character.toUpperCase(inputArray[i]);
            }
        }
        String result = new String(inputArray);
        return result;
    }





}
