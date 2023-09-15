import java.util.Scanner;
public class FindDuplicates {
    static int findXor(int[] a) {
        int ans = 0;
        for (int i:a) {
            ans = ans ^ i;
            System.out.print(i+" ");
        }
//        System.out.println(a.length);
        System.out.println(ans);
//        xor
        for(int i = 1;i<a.length;i++){
            ans = ans ^ i;
        }
        return ans ;
    }
    public static  void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
        int[] array = new int[]{ 1, 3, 2, 1};
        for (int i: array) {
            System.out.print(i+" ");
        }
        System.out.println();
        int ans = findXor(array);
        System.out.println(ans);
    }
}
