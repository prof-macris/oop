/*
  file: Prog11.java (pt-br version)
  objective: conditional structure example (switch)
  author: Prof. Macris, jul-2017, tch.macris@gmail.com
*/

import javax.swing.*;

class Prog11 {
   public static void main (String args[]) {
      
      int dia = 0;
      String msg = "";

      dia = Integer.parseInt(
         JOptionPane.showInputDialog(null, "Informe o nr do dia (0-6):")
      );
      
      switch (dia) {
        case 0: msg = "Domingo"; break;
        case 1: msg = "Segunda-feira"; break;
        case 2: msg = "Terca-feira"; break;
        case 3: msg = "Quarta-feira"; break;
        case 4: msg = "Quinta-feira"; break;
        case 5: msg = "Sexta-feira"; break;
        case 6: msg = "Sabado"; break;
        default: msg= "Entre um valor de 0 a 6";
      }

      JOptionPane.showMessageDialog(null, msg);
   }
}