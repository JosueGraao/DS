
package ex3;

import java.util.Scanner;


public class EX3 {


    public static void main(String[] args) {
        int aluno =0, media=0, c=0, idade = 0 , soma = 0; 
        Scanner grava = new Scanner(System.in);
     
        System.out.println("Digite o número de alunos");
        aluno = grava.nextInt();
      
        while(c!=aluno){
            c++;
            System.out.println("Digite a idade do aluno");
            idade = grava.nextInt();
            soma = soma + idade;
    }
        media = soma/aluno;
        System.out.println("A média da idade dos alunos é "+media);
      
    }

}