import org.w3c.dom.TypeInfo;

import java.lang.reflect.Type;

public class Test {
    public static void main(String[] args) {
        float n = -2.564f;
        float m = 3.55f;
        float result = Math.min(n, m);
//        System.out.println("min is " + result);

        int n1 = -2;
        int m1 = 3;
        int result2 = Math.min(n1, m1);
//        System.out.println(result2);

        int round = Math.round(m);
        System.out.println(round);
        System.out.println(Math.ceil(m));
        System.out.println(Math.floor(m));
        System.out.println(((Object)m1).getClass().getSimpleName());
    }
}
