package Bitmanipulation;

public class GetBit {
    public static boolean check1(int n,int pos) {
        int bitMask = 1<<pos;
        if((bitMask & n ) == 0) {
            return false;
        } else{
           return true;
        }
    }

    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 2;
        // bit agar non-zero hai eska mtlb 1 hai bit vrna zero hai
        if(check1(n,pos)) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }


}
