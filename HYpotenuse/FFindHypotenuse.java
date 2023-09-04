import java.util.Scanner;

public class FFindHypotenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b :");
        b = sc.nextInt();
        c = Math.sqrt( (a*a) + (b*b) );
        System.out.println("Hypotenuse is : "+c);
    }
}
