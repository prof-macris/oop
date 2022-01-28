/*
  file: Prog24.java
  objective: structured version example (Ball context)
  author: Prof. Macris, oct-2017, tch.macris@gmail.com
*/

import javax.swing.JOptionPane;

public class Prog24 {

  public static void showData(String text) {
    JOptionPane.showMessageDialog(null, text);
  }
  
  public static String enterData(String text) {
    return JOptionPane.showInputDialog(null, text);
  } 

  public static void emptyBall() {
    showData("Ball state: empty");
  }

  public static void fillBall() {
     showData("Ball state: full");
  }

  public static void throwBall(String par1, float par2) {
     showData("Ball thrown: " + par1 + ", " + par2 + " mts");
  }

  public static void main (String args[]) {
    String Color = "";
    String Format = ""; 
    float Weight = 0;
    double Price = 0;
    boolean Full = true;
	
    // Changing color
    Color = "Orange";
    
    // Showing colorr 
    showData("Color: " + Color);
	  
    // Calling emptyBall procedure
    emptyBall();
  }
}
