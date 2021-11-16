/*
  file: Prog22.java (pt-br version)
  objective: Exceptions tests (file read catched)
  author: Prof. Macris, oct-2021, tch.macris@gmail.com
*/

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Prog22 {
   public static void main (String[] args) {

   String msg = "";
   try {
      File arquivo = new File("d:\\aula\\filmes.txt");
      FileReader fr = new FileReader(arquivo);
      char[] linha = new char[50];
      
      fr.read(linha);
      for (char caractere: linha) { 
         msg += caractere; 
      }
      fr.close();
      JOptionPane.showMessageDialog(null, msg);
    } catch (FileNotFoundException nf)  {
      JOptionPane.showMessageDialog(null, "erro:\n" + nf.getMessage());
    } catch (IOException io) {
      io.printStackTrace();
    } finally {
      JOptionPane.showMessageDialog(null, "fim do try");
    }
    JOptionPane.showMessageDialog(null, "fim do processamento");
   }
}