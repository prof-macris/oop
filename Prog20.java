/*
  file: Prog20.java (pt-br version)
  objective: Exceptions tests (array overflow)
  author: Prof. Macris, oct-2021, tch.macris@gmail.com
*/

import javax.swing.JOptionPane;

public class Prog20 {
   public static void main (String[] args) {

      char[] nome = {'J', 'O', 'A', 'N', 'A'};
      JOptionPane.showMessageDialog(null, nome[5]);

      JOptionPane.showMessageDialog(null, "fim do processamento");
   }
}