import java.util.Scanner;

public class AddThreeNumber {

    public static double calculateNumber(double a, double b, double c) {
        return (a + b + c) / 3;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Average is "+ calculateNumber(a,b,c));
    }
}
