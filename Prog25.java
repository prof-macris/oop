/*
  file: Prog25.java (pt-br version)
  objective: OOP real world abstraction example
  author: Prof. Macris, oct-2021, tch.macris@gmail.com
*/

import javax.swing.JOptionPane;

public class Prog25 {

  public static void mostrarMsg(String text) {
    JOptionPane.showMessageDialog(null, text);
  }

  public static class Bola {
   String Cor="";
   String Formato="";
   float Peso=0;
   float Valor=0;
   boolean Cheia=true;
   
   public void encherBola() {
     Cheia = true;
   }

   public void esvaziarBola() {
     Cheia = false;
   }

   public String lancarBola(String direcao, float distancia) {
     String msg="";
     msg=direcao + ", " + distancia + " mts";
     return msg;	 
   }
  }

  public static void main (String args[]) {

      // Instanciando 2 objetos da classe bola
      Bola objBasq = new Bola();
      Bola objFut = new Bola();
    
      //Atribuindo alguns valores aos objetos
      objBasq.Cor="Laranja";
      objBasq.Valor=35;

      objFut.Cor="Branco e Preto";
      objFut.Formato="Circular";

      //Executando alguns metodos dos objetos
      objBasq.esvaziarBola();
      String lancamento=objFut.lancarBola("norte", 50);
    
      //Testando alguns comandos
      mostrarMsg("Bola de basquete cheia ? " + objBasq.Cheia);
      mostrarMsg("Ultimo lancamento da bola de futebol:\n" +  lancamento);
  }
}
