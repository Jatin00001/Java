public class CharStrings {
    public static  void main(String[] args) {
        char[] a = {'a','c','b'};
        for(char i : a) {
            System.out.println(i);
            if(i == '\0') System.out.println("Yes");
        }
    }
}
