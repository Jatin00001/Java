import java.util.Scanner;
import java.util.regex.Pattern;

public class RowColPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row,col;
        System.out.println("Enter row :- ");
        row = sc.nextInt();
        System.out.println("Enter col :- ");
        col = sc.nextInt();
        System.out.println("Enter symbol :- ");
        char symbole;
        symbole = sc.next().charAt(0);
        Pattern(row,col,symbole);

    }
    public static void Pattern(int row,int col,char symbol)
    {
        System.out.println("Your Pattern is :- ");
        for(int i = 1;i<=row;i++) {
            System.out.println();
            for (int j = 1;j<=col;j++) {
                System.out.print(symbol);
            }

        }
    }
}
