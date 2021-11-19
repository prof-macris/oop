/*
  file: Prog10.java (pt-br version)
  objective: conditional structure example (if-else)
  author: Prof. Macris, jul-2017, tch.macris@gmail.com
*/

import javax.swing.*;

class Prog10 {
   public static void main (String args[]) {
      
      int temp = 0;
      String msg = "";

      temp = Integer.parseInt(
         JOptionPane.showInputDialog(null, "Informe a temperatura atual em Celsius:")
      );
      
      if (temp < 5) {
        msg = "Temperatura invalida";
      } else {
        if (temp <= 50) { msg = "Dentro do limite esperado"; }
        else if (temp < 70) { msg = "Atencao, acima do limite"; }
        else { msg = "PERIGO, risco de explosao"; }
      }

      JOptionPane.showMessageDialog(null, msg);
   }
}