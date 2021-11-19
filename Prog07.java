/*
  file: Prog07.java (pt-br version)
  objective: conditional structure example (if-else)
  author: Prof. Macris, jul-2017, tch.macris@gmail.com
*/

import javax.swing.*;
import java.text.DecimalFormat;

class Prog07 {
   public static void main (String args[]) {
      
      DecimalFormat df = new DecimalFormat("#.##");
      float nota1 = 0, nota2 = 0, media = 0;
      String msg = "- Resultado -\n";

      nota1 = Float.parseFloat(
         JOptionPane.showInputDialog(null, "Informe a nota 1: ")
      );
      
      nota2 = Float.parseFloat(
         JOptionPane.showInputDialog(null, "Informe a nota 2: ")
      );

      media = (nota1 + nota2)/2;
      
   	if (media >= 7) {
	      msg += "Media: " + df.format(media) + "\nAprovado";
	   } else {
         msg += "Media: " + df.format(media) + "\nReprovado";
      }

      JOptionPane.showMessageDialog(null, msg);
   }
}