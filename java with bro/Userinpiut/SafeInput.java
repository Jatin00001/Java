import java.util.Scanner;

public class SafeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String s = sc.nextLine();
        System.out.println("Hello Mr. "+s);
    }
}
