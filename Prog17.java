/*
  file: Prog17.java (pt-br version)
  objective: conditional structure example (array 2d)
  author: Prof. Macris, jul-2017, tch.macris@gmail.com
*/

import javax.swing.*;

class Prog17 {
   public static void main (String args[]) {
      String msg="";

      //forma 1
      String[][] agenda2 = new String[2][3];
      agenda2[0][0] = "Carla Duniz";
      agenda2[1][0] = "10/05/2013";
      agenda2[0][1] = "Peterson Silva";
      agenda2[1][1] = "03/08/2013";
      agenda2[0][2] = "Sandra Oliver";
      agenda2[1][2] = "05/09/2013";

      //forma 2
      String[][] agenda1 = {
        {"Carla Duniz", "Peterson Silva", "Sandra Oliver"},
        {"10/05/2013","03/08/2013","05/09/2013"}
      };

      //sobrescrita da data do paciente Carla
      
      //listagem

      JOptionPane.showMessageDialog(null, msg);
   }
}