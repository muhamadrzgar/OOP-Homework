package muhamadrzgar;

import javax.swing.*;

public class MuhamadRzgar {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What's your name?");
        String fristnumber = JOptionPane.showInputDialog("Enter frist number");
        String secondnumber = JOptionPane.showInputDialog("Enter the second number");
        int number1 = Integer.parseInt(fristnumber);
        int number2 = Integer.parseInt(secondnumber);
        int sum = number1 + number2;
        JOptionPane.showMessageDialog(null, "Welcome " + name +" "+ "the sum is " + sum, " The Sum Of The Two Numbers ", JOptionPane.INFORMATION_MESSAGE);
System.exit(0);
    }

}
