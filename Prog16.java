/*
  file: Prog16.java (pt-br version)
  objective: conditional structure example (array 1d)
  author: Prof. Macris, jul-2017, tch.macris@gmail.com
*/

import javax.swing.*;

class Prog16 {
   public static void main (String args[]) {
      String msg="";
      double[] nota = {7.9, 5.8, 5.4, 10.0, 4.4, 8.9, 5.5, 8.7};
      double media=0;
      

      for (int cont=0; cont < nota.length; cont++) {
        msg = msg + "\n(" + cont + ") " + nota[cont];
        media += nota[cont];
      }
      
      media /= 8;
      msg += "\nMedia: " + media;
      
      JOptionPane.showMessageDialog(null, msg);
   }
}