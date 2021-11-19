/*
  file: Prog15.java (pt-br version)
  objective: conditional structure example (array 1d)
  author: Prof. Macris, jul-2017, tch.macris@gmail.com
*/

import javax.swing.*;

class Prog15 {
   public static void main (String args[]) {
      
      int nr = 0;
      String msg = "";

      String[] nome = new String[7];
      nome[0]= "Domingo"; 
      nome[1]= "Segunda-feira"; 
      nome[2]= "Terca-feira"; 
      nome[3]= "Quarta-feira"; 
      nome[4]= "Quinta-feira"; 
      nome[5]= "Sexta-feira"; 
      nome[6]= "Sabado"; 

      nr = Integer.parseInt(
         JOptionPane.showInputDialog(null, "Informe o nr do dia (0-6):")
      );
      
      if (nr < 0 || nr > 6) {
        msg = "Entre um valor de 0 a 6";
      } else {
        msg = nome[nr];
      }

      JOptionPane.showMessageDialog(null, msg);
   }
}