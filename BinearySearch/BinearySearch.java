import java.util.Scanner;

public class BinearySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = {1,2,3,4,5,60};
//        System.out.println(n.length); by default any array have own length function in java
//        System.out.println(n); // give you a address
       for(int i = 0 ;i < n.length;i++) {
           System.out.print(n[i]+" ");
       }
        System.out.println("Enter element");
        int find = sc.nextInt();
        int ans = bs(n,find);
        System.out.println(ans);

    }
    static  int bs(int[] a , int key) {
        int s = 0;
        int e = a.length-1;
        int mid  = s + (e-s)/2;
        while(s<=e) {
            if(a[mid] == key ) {
                return mid;
            } else if (a[mid] < key) {
                s = mid + 1;
            } else e = mid - 1;
            mid  = s + (e-s)/2;
        }

        return -1;
    }
}
