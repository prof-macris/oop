/*
  file: Prog03.java (pt-br version)
  objective: user input/output data example (console)
  author: Prof. Macris, jul-2017, tch.macris@gmail.com
  note: a definicao de nota1/nota2 como int pode trazer problemas com truncagem
*/
import java.util.Scanner;

class Prog03 {

  public static void main(String[] args) {
  	
    float nota1, nota2, media;
	
    Scanner entrada = new Scanner(System.in);
	
    System.out.print("Digite a nota 1: ");
    nota1 = Float.parseFloat(entrada.nextLine());
    
    System.out.print("Digite a nota 2: ");
    nota2 = Float.parseFloat(entrada.nextLine());	  
    
    media = (nota1 + nota2)/2;
    
    System.out.println("Media: " + media);
    System.out.println("Fim do programa");
  }
}
