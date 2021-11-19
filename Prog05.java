/*
  file: Prog05.java (pt-br version)
  objective: string methods example
  author: Prof. Macris, jul-2017, tch.macris@gmail.com
*/

import javax.swing.*;

class Prog05 {
   public static void main (String args[]) {
     String texto = "Ciencia da Computacao e Eng";
     String texto2 = texto.replace("Eng", "Engenharia");
     String msg="";
     
     
	   msg = "Tamanho: " + texto.length() + "\n" + 
	 	"Maiusculo: " + texto.toUpperCase() + "\n" + 
	    "Posicao de 'Computacao': " + texto.indexOf("Computacao") + "\n" + 
	    "Nova string: " + texto2;
	 
     JOptionPane.showMessageDialog(null, msg.concat("\n\nFim da mensagem"));
	
   }
}