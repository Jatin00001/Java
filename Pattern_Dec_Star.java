import java.util.Scanner;

public class Pattern_Dec_Star {

    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
        int n = 5;
        for(int i = 0 ; i<n; i++){
            System.out.print("Row is " +i+"  : ");
            for(int  j = 0 ; j<n-i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
