package Bitmanipulation;
public class clearBit {

    public static int check3(int n,int pos) {
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        int LatestNumber = notBitMask &n ;
        return LatestNumber;
    }

    public static void main(String[] args) {
        int n = 1;
        int pos = 0;
        System.out.println(check3(n,pos));
    }
}