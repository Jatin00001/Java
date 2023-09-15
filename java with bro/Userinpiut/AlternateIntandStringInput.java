import java.util.Scanner;

public class AlternateIntandStringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age For Checking");
        int age = sc.nextInt();
        if(age>18) {

            System.out.print("Enter your Height in inch :- ");
            double Height = sc.nextDouble();
            System.out.println("Enter Your Name");
            // now there is a catch multiple int input give a new line error that's why we have to clear buffer
            sc.nextLine(); // this is catch we clear the input buffer
            String name = sc.nextLine();

            System.out.println("Your name is "+name+" \nYour Age is "+age+"\nYour Height is "+Height+" in inch");
            System.out.println("You are now approved !");
        }else System.out.println("You are not approved");


    }
}
