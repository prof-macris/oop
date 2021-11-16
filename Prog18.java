/*
  file: Prog18.java (pt-br version)
  objective: simple ATM application (subrotines)
  author: Prof. Macris, set-2021, tch.macris@gmail.com
*/

import javax.swing.*;
import java.text.DecimalFormat;

class Prog18 {

   static void mostra(String texto) {
     JOptionPane.showMessageDialog(null, texto);
   }

   static float operacao(char tipo, float saldo, float valor) {
     float novo = saldo;
     switch(tipo) {
       case 'D' : novo = saldo + valor; break;
       case 'S': novo = saldo - valor; break;
     }
     return novo;
   }

   public static void main (String args[]) {
      
      float valor=0, saldo=0;
      int opcao=0;
      String msg="";
      String menu="# Menu ATM simples #\n\n1. Depositar\n2. Sacar\n3. Consultar saldo\n4. Sair\n\nEscolha uma opcao";

      DecimalFormat df = new DecimalFormat("#.##");

      while (opcao != 4) {

        opcao = Integer.parseInt(
          JOptionPane.showInputDialog(null, menu)
        );

        switch (opcao) {
          case 1:
            valor = Float.parseFloat(
              JOptionPane.showInputDialog(null, "Entre com o valor do deposito (R$)")
            );
            saldo = operacao('D', saldo, valor);
            mostra("Operacao completada");
            break;
          case 2:
            valor = Float.parseFloat(
              JOptionPane.showInputDialog(null, "Entre com o valor do saque (R$)")
            );
            if (valor > saldo) {
              mostra("Saldo insuficiente\nOperacao cancelada");
            } else {
              if (valor > 500) {
                mostra("Valor acima do limite\nOperacao cancelada");
              } else {
                saldo = operacao('S', saldo, valor);
                mostra("Operacao completada");
              }
            }
            break;
          case 3:
            mostra("Saldo atual: R$ " + df.format(saldo));
            break;
          case 4:
            System.exit(0);
            break;
          default:
            mostra("Operacao invalida");
            break;
        }
      }
  }
}