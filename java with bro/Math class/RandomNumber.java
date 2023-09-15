import java.util.Random;

class Rolling{
    Random random;
    int ans;
    Rolling() {
        random = new Random();
        roll();
    }
    void roll() {
        ans = random.nextInt(6)+1;
        System.out.println(ans);
    }


}
public class RandomNumber {
    public static void main(String[] args) {

        System.out.println("Dice is rolling");
        Rolling dice = new Rolling();
    }
}
