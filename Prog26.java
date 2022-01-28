/*
  file: Prog26.java
  objective: OOP encapsulation example (Vet Clinic context)
  author: Prof. Macris, oct-2021, tch.macris@gmail.com
*/

import javax.swing.JOptionPane;

public class Prog26 {

  public static void showData(String text) {
    JOptionPane.showMessageDialog(null, text);
  }
  
  public static String enterData(String text) {
    return JOptionPane.showInputDialog(null, text);
  } 

  public static class Person {
    private String name;
    private int age;
    private float weight;
    
    // gets and sets
    public String getName() { return this.name; }
    public void setName(String Name) { this.name = Name; }
    public int getAge() { return this.age; }
    public void setAge(int Age) { this.age = Age; }
    public float getWeight() { return this.weight; }
    public void setWeight(float Weight) { this.weight = Weight; }  

    public String identify() {
      return "ID" + this.age + this.name.toUpperCase();
    }

    public String communicate() {
      return "Talk";
    }
  }  
  public static void main (String args[]) {
    Person student = new Person();

    student.setName(enterData("Enter student name"));
    student.setAge(Integer.parseInt(enterData("Enter student age")));

    showData("Name: " + student.getName());
    showData("Code: " + student.identify());
  }
}
