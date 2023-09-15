import javax.swing.*;
public class VotingGui {
    public static void main(String[] args) {
        String name2 = JOptionPane.showInputDialog("Enter Your Name :- ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your  Age for Voting"));
        if(age>18) {
            JOptionPane.showMessageDialog(null,name2);
            int bjp = 0;
            int jaddu = 0;
            int other = 0;
            JOptionPane.showMessageDialog(null,"Enter 1 for bjp 2 for jaddu 3for other");
            int n = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 2 3 for voting"));
            if(n == 1){
                bjp++;
                System.out.println("your vote for bjp");
                JOptionPane.showMessageDialog(null,"Your vote for bjp ");
            }
            if(n==2)
            {jaddu++;
                System.out.println("your vote for jaddu");
                JOptionPane.showMessageDialog(null,"Your vote for jaddu ");}
            if(n==3) {
                other++;
                JOptionPane.showMessageDialog(null,"Your vote for other ");
            }
            JOptionPane.showMessageDialog(null,"Your vote is submitted ");
        }else{
            JOptionPane.showMessageDialog(null,"You are not eligible for vote");
        }
    }
}
