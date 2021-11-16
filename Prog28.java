/*
  file: Prog27.java (pt-br version)
  objective: OOP polymorphism example
  author: Prof. Macris, oct-2021, tch.macris@gmail.com
*/

import javax.swing.JOptionPane;

public class Prog28 {

  public static void mostrarMsg(String text) {
    JOptionPane.showMessageDialog(null, text);
  }

  public static String entrarDados(String text) {
    return JOptionPane.showInputDialog(null, text);
  }

  public static class Animal {
    private String nome;
    private int idade;
    private float peso;
      
    //gets and sets
    public String getNome() { return this.nome; }
    public void setNome(String Nome) { this.nome = Nome; }
    public int getIdade() { return this.idade; }
    public void setIdade(int Idade) { this.idade = Idade; }
    public float getPeso() { return this.peso; }
    public void setPeso(float Peso) { this.peso = Peso; }   

    public String identificar() {
      return "ID" + this.idade + this.nome.toUpperCase();
    }

    public String comunicar() {
      return "Indefinido";
    }
  } 

  public static class Pessoa extends Animal {
    private String instrucao;
    private String conjuge;
      
    //gets and sets
    public String getInstrucao() { return this.instrucao; }
    public void setInstrucao(String Instrucao) { this.instrucao = Instrucao; }
    public String getConjuge() { return this.conjuge; }
    public void setConjuge(String Conjuge) { this.conjuge = Conjuge; }  

    public String raciocinar() {
      return "capacidade de raciocinar: sim";
    }

    public String comunicar() {
      return "Falar";
    }
  }

  public static class Cao extends Animal{
    private boolean cauda;
    private String raca;
      
    //gets and sets
    public boolean getCauda() { return this.cauda; }
    public void setCauda(boolean Cauda) { this.cauda = Cauda; }
    public String getRaca() { return this.raca; }
    public void setRaca(String Raca) { this.raca = Raca; }  

    public String morder() {
      return "capacidade de morder: sim";
    }

    public String comunicar() {
      return "Latir";
    }  
  }

  public static void main (String args[]) {  
      Pessoa func1 = new Pessoa();
      Cao cao1 = new Cao();
      Animal gato1 = new Animal();

      // teste com funcionario
      mostrarMsg("funcionario: " + func1.comunicar());

      // teste com cao
      mostrarMsg("cao:  " + cao1.comunicar());

      // teste com gato
      mostrarMsg("gato:  " + gato1.comunicar());
  }
}
