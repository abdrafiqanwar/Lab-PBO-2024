import java.util.Scanner;

public class TP1_3_H071201025 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();

        char[] userinput = temp.toCharArray();

        System.out.println(formatDate(userinput));
    }
    
    public static String formatDate(char[] text){
        String tanggal = (text[0] == '0') ? "0" + text[1] : text[0] + "" + text[1];
        
        String bulan = bulanFormatting(Integer.parseInt(Character.toString(text[3]) + text[4]));

        String tahun = tahunFormatting(Integer.parseInt(Character.toString(text[6]) + text[7]));

        return String.format("%s-%s-%s", tanggal, bulan, tahun);
    }

    public static String bulanFormatting(int bulan) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[bulan-1];
    }

    public static String tahunFormatting(int tahun) {
        String result = "";
        if (tahun > 24){

            result += "19";
        }
        else if (tahun <= 24 && tahun < 10){
            
            result += "200";
        }
        else{
            result += "20";}

        
        result += Integer.toString(tahun);
        return result;
    }


























}
