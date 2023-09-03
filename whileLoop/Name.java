import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
//        while (name == "") {
        while (name.isBlank()) {
            System.out.print("Enter Your Name : ");
            name = sc.nextLine();
        }
        System.out.println("Your name is "+name);

    }
}
