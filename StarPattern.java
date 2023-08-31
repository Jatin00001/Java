import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
//        for(int i = 0 ; i<n;i++){
////            System.out.print("Row is " +i+"  : ");
//            for(int  j = 0 ; j<=i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for(int i = 0; i<n ;i++) {
            System.out.print("i : ");
//            for(int j = 0 ; j<n-i-1 ; j++) {
//                System.out.print("_");
//            }
//            for(int j = 0 ; j<=i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();


            // Alternate solve using Else if
            for(int j = 0 ; j<n ; j++) {
                if(j<n-i-1){
                    System.out.print("_");
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }


    }
}
