/*
  file: Prog09.java (pt-br version)
  objective: conditional structure example (if-else)
  author: Prof. Macris, jul-2017, tch.macris@gmail.com
*/

import javax.swing.*;

class Prog09 {
   public static void main (String args[]) {
      
      int dia = 0;
      String msg = "";

      dia = Integer.parseInt(
         JOptionPane.showInputDialog(null, "Informe o nr do dia (0-6):")
      );
      
      if (dia < 0 || dia > 6) {
        msg = "Entre um valor de 0 a 6";
      } else {
        if (dia == 0) { msg = "Domingo"; }
        if (dia == 1) { msg = "Segunda-feira"; }
        if (dia == 2) { msg = "Terca-feira"; }
        if (dia == 3) { msg = "Quarta-feira"; }
        if (dia == 4) { msg = "Quinta-feira"; }
        if (dia == 5) { msg = "Sexta-feira"; }
        if (dia == 6) { msg = "Sabado"; }
      }

      JOptionPane.showMessageDialog(null, msg);
   }
}