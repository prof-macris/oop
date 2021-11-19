/*
  file: Prog12.java (pt-br version)
  objective: loop structure example (for)
  author: Prof. Macris, jul-2017, tch.macris@gmail.com
*/

import javax.swing.*;

class Prog12 {
   public static void main (String args[]) {
      
      int num = 0;
      String msg = "";

      num = Integer.parseInt(
         JOptionPane.showInputDialog(null, "Informe o nr final da sequencia:")
      );
      
      for (int cont=1; cont <= num; cont++) {
        msg += cont + " ";
        if (cont % 20 == 0) { msg += "\n"; }
      }      
      
      JOptionPane.showMessageDialog(null, "Sequencia\n " + msg);
   }
}