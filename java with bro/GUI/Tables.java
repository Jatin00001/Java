import javax.swing.*;

public class Tables {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter number for Generate tables"));
        if(number > 1){
            for(int i = 1; i<=10; i++) {
                int temp  = number;
                temp *= i ;
                JOptionPane.showMessageDialog(null,number + " X " + i + " = " + temp);
            }
        }

    }
}
