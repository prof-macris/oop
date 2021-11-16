/*
  file: Prog19.java (pt-br version)
  objective: Exceptions tests (file read)
  author: Prof. Macris, oct-2021, tch.macris@gmail.com
*/

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileReader;

public class Prog19 {
   public static void main (String[] args) {

      String msg = "";
      File arquivo = new File("d:\\aula\\filmes.txt");
      FileReader fr = new FileReader(arquivo);
      char[] linha = new char[50];
      
      fr.read(linha);
      for (char caractere: linha) { 
         msg += caractere; 
      }
      fr.close();
      JOptionPane.showMessageDialog(null, msg);

      JOptionPane.showMessageDialog(null, "fim do processamento");
   }
}