/*
  file: Atm.java
  objective: simple ATM application
  comment: break statement in case 3/4 is just good practice
  author: Prof. Macris, set-2021, tch.macris@gmail.com
*/

import javax.swing.*;
import java.text.DecimalFormat;

class Atm {
   public static void main (String args[]) {
      float value=0, balance=0;
      int option=0;
      String msg="";
      String menu="# Simple ATM Menu #\n\n1. Deposite\n2. Withdraw\n3. Check balance\n4. Exit\n\nChoose an option";

      DecimalFormat df = new DecimalFormat("#.##");

      while (option != 4) {
        option = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
        switch (option) {
          case 1:
            balance += Float.parseFloat(
              JOptionPane.showInputDialog(null, "Enter value to deposit")
            );
            msg = "Operation completed";
            break;
          case 2:
            value = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter value to withdraw"));
            if (value > balance) {
              msg = "Insufficient balance for withdraw\nOperation canceled";
            } else {
              if (value > 500) {
                msg = "Value is exceeded\nOperation canceled";
              } else {
                balance -= value;
                msg = "Operation completed";
              }
            }
            break;
          case 3:
            msg = "Amount: $ " + df.format(balance);
            break;
          case 4:
            System.exit(0);
            break;
          default:
            msg = "Invalid operation";
            break;
        }
        JOptionPane.showMessageDialog(null, msg);
      }
  }
}
