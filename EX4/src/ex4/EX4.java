
package ex4;

import java.util.Scanner;


public class EX4 {


    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        int vezes = 0, contador=0; 
      
     
      System.out.println("Digite o número de vezes que você quer repetir a mensagem:");
      vezes = grava.nextInt();
      
      while(contador!=vezes){
      System.out.println("Isso é um teste");
      contador++;
      }
      
    }

}