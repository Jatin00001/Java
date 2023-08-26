import java.util.Scanner;
class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :- ");
        int a  = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a :- "+a+"\nb :- "+b);
        while(a!=0){
            if(a<18){
                System.out.println("Not adult");
            }else{
                System.out.println("Adult");
            }
            System.out.print("Enter zero for exit :- ");
            a  = sc.nextInt();
        }


    }
}
