package SwapNumbers;

public class SwapNumbers {

    static void swap(int[] a,int[] b) {
//        int temp ;
//        temp = a[0];
//        a[0] = b[0];
//        b[0] = temp;
        System.out.println("Before swapping Value of a is " + a[0]
                + " and Value of b is " + b[0]);
        a[0] = (a[0] + b[0]) - (b[0] = a[0]);
        System.out.println("After swapping Value of a is " + a[0]
                + " and Value of b is " + b[0]);
    }
    public static void main(String[] args){
        int[] n = {4};
        int[] b = {5};
        swap(n,b);

    }
}
