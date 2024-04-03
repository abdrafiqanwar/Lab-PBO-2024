import java.util.Scanner;

public class TP1_5_H071201025 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Masukan Target Nomor Yang ada cari : ");
        int target = scanner.nextInt();
        scanner.nextLine();
        System.out.println(twoDSearch(target,nums));

    }

    public static String twoDSearch(int target,int[][] listofnum) {
        
        for (int i = 0 ; i < listofnum.length ; i++){
            for (int j = 0 ; j < listofnum[0].length ; j++){
                
                if(listofnum[i][j] == target){
                    return String.format("Found %d at [%d][%d]", target, i, j);
                }

            }
        }
        return "not found";
    }
}
    