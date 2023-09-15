import java.util.Scanner;
public class Bs {
    public static void main(String[] args) {
        int[][] n = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<n.length;i++){
            for(int j = 0 ;j<n.length;j++) {
                n[i][j] = scanner.nextInt();
            }

        }
        for(int i = 0;i<n.length;i++){
            for(int j = 0 ;j<n.length;j++) {
                System.out.print(n[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
