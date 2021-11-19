/*
  file: Prog14.java (pt-br version)
  objective: loop structure example (while)
  author: Prof. Macris, jul-2017, tch.macris@gmail.com
*/

import javax.swing.*;

class Prog14 {
   public static void main (String args[]) {
      
      int valor1=0, valor2=0;
      String continua = "sim";

      while (continua == "sim") {

        valor1 = Integer.parseInt(
          JOptionPane.showInputDialog(null, "Informe o valor 1:")
        );

        valor2 = Integer.parseInt(
          JOptionPane.showInputDialog(null, "Informe o valor 2:")
        );

        JOptionPane.showMessageDialog(null, "resultado: " + (valor1 + valor2));

        continua = JOptionPane.showInputDialog(null, "Continua (sim/nao):");
      }
      
    JOptionPane.showMessageDialog(null, "Fim do programa");
  }
}