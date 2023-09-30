package Bitmanipulation;
public class setBit {
    public static int check2(int n,int pos) {
        int bitMask = 1<<pos;
        return bitMask | n ;
    }
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        System.out.println(check2(n,pos));
    }
}
