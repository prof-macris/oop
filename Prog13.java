/*
  file: Prog13.java (pt-br version)
  objective: loop structure example (for)
  author: Prof. Macris, jul-2017, tch.macris@gmail.com
*/

import javax.swing.*;

class Prog13 {
   public static void main (String args[]) {
      
      int num = 0;
      String msg = "";

      num = Integer.parseInt(
         JOptionPane.showInputDialog(null, "Informe o nr final da sequencia:")
      );

      for (int cont=1; cont <= num; cont++) {
        if (cont % 2 == 0) {
          msg += "\n" + cont + ": par";
        } else {
          msg += "\n" + cont + ": impar";
        }
      }      
      
      JOptionPane.showMessageDialog(null, "Sequencia\n" + msg);
   }
}