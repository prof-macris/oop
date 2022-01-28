/*
  file: Prog25.java
  objective: OOP abstraction version example (Ball context)
  author: Prof. Macris, oct-2021, tch.macris@gmail.com
*/

import javax.swing.JOptionPane;

public class Prog25 {

  public static void showData(String text) {
    JOptionPane.showMessageDialog(null, text);
  }
  
  public static String enterData(String text) {
    return JOptionPane.showInputDialog(null, text);
  } 

  public static class Ball {
    String Color;
    String Format; 
    float Weight;
    double Price;
    boolean Full;
    
    public void emptyBall() {
      Full = false;
    }

    public void fillBall() {
       Full = true;
    }

    public String throwBall(String direction, float distance) {
      return direction + ", " + distance + " mts";
    }
  }  
  public static void main (String args[]) {
    // Basketball instance
    Ball basq1 = new Ball();

    // Assigning values to some properties
    basq1.Format = "Circular";
    basq1.Color = "Orange";
    basq1.Price = 35;

    // Running some methods
    basq1.emptyBall();
    String pitch = basq1.throwBall("north", 50);
	  
    // Testing results
    showData("Ball full? " + basq1.Full);
    showData("Ball shape: " + basq1.Format);
    showData("Last ball pitch:\n" +  pitch);
  }
}
