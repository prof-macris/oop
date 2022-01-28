/*
  file: Prog27.java
  objective: OOP inheritance example (Vet Clinic context)
  author: Prof. Macris, oct-2021, tch.macris@gmail.com
*/

import javax.swing.JOptionPane;

public class Prog27 {

  public static void showData(String text) {
    JOptionPane.showMessageDialog(null, text);
  }
  
  public static String enterData(String text) {
    return JOptionPane.showInputDialog(null, text);
  } 

  public static class Animal {
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
      return "";
    }
  }

  public static class Person extends Animal {
    private String education;
    private String partner;
    
    // gets and sets
    public String getEducation() { return this.education; }
    public void setEducation(String Education) { this.education = Education; }
    public String getPartner() { return this.partner; }
    public void setPartner(String Partner) { this.partner = Partner; }

    public String reasoning() {
      return "ability to reason: yes";
    }
  }

  public static class Dog extends Animal {
    private String race;    
    private boolean tail;
    
    // gets and sets
    public String getRace() { return this.race; }
    public void setRace(String Race) { this.race = Race; }    
    public boolean getTail() { return this.tail; }
    public void setTail(String Tail) { this.tail = (Tail.equals("yes")) ? true : false; }

    public String bite() {
      return "ability to bite: yes";
    }
  }  

  public static void main (String args[]) {
    Person emp1 = new Person();
    Dog dog1 = new Dog();

    // Employee test
    emp1.setName(enterData("Employee name"));
    emp1.setPartner(enterData("Partner name"));
    showData("-Employee-\n" + emp1.getName() + "\nPartner: " + emp1.getPartner() + "\n" + emp1.reasoning());

    // Dog test    
    dog1.setName(enterData("Dog name"));
    dog1.setTail(enterData("Tail?"));
    showData("-Dog-\n"  + dog1.getName() + "\nTail: " + dog1.getTail() + "\n" + dog1.bite());
  }
}
