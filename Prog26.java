/*
  file: Prog26.java (pt-br version)
  objective: OOP encapsulation example
  author: Prof. Macris, oct-2021, tch.macris@gmail.com
*/

import javax.swing.JOptionPane;

public class Prog26 {

  public static void mostrarMsg(String text) {
    JOptionPane.showMessageDialog(null, text);
  }

  public static class Pessoa {
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
      return"Falar";
    }
  }

  public static void main (String args[]) {  
      Pessoa aluno = new Pessoa();

      aluno.setNome(JOptionPane.showInputDialog(null, "Informe o nome do   aluno"));

      mostrarMsg("Nome: " + aluno.getNome());

      mostrarMsg("Codigo: " + aluno.identificar());
  }
}
