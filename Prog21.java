/*
  file: Prog20.java (pt-br version)
  objective: Exceptions tests (array overflow catched)
  author: Prof. Macris, oct-2021, tch.macris@gmail.com
*/

import javax.swing.JOptionPane;

public class Prog21 {
   public static void main (String[] args) {

      char[] nome = {'J', 'O', 'A', 'N', 'A'};
      try {
        JOptionPane.showMessageDialog(null, nome[5]);
      } catch (ArrayIndexOutOfBoundsException ex) {
         JOptionPane.showMessageDialog(null, "Posicao de elemento inexistente: " + ex.getMessage());
      }
      JOptionPane.showMessageDialog(null, "fim do processamento");
   }
}