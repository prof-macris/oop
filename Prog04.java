/*
  file: Prog04.java (pt-br version)
  objective: user input/output data example (dialog)
  author: Prof. Macris, jul-2017, tch.macris@gmail.com
*/

import javax.swing.*;

class Prog04 {
   public static void main (String args[]) {
     int dia=0, mes=0, ano=0;
	  
     String aux1 = JOptionPane.showInputDialog(null, "Informe o dia (ex: 31): ");
     String aux2 = JOptionPane.showInputDialog(null, "Informe o mes (ex: 12): ");
     String aux3 = JOptionPane.showInputDialog(null, "Informe o ano (ex: 2017): ");
	  
     dia = Integer.parseInt(aux1); 
     mes = Integer.parseInt(aux2);
     ano = Integer.parseInt(aux3);
     
     JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
   }
}