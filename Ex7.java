/*
 Fazer um programa que o usuário entre com o seu nome completo e o programa 
exiba na tela apenas o primeiro e último nome. 
Exemplo: para a entrada de nome "Ana Maria de Souza",
o programa deverá imprimir na tela "Ana Souza".
 */
package aula1;

import java.util.Arrays; 
import java.util.Scanner; 

public class Ex7 {
    public static void main(String[] args){
        String Nome;
        
        Scanner NomeCompleto = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        Nome= NomeCompleto.nextLine();
        
        String[] separarNome = Nome.split(" ");
        
        System.out.println(Arrays.toString(separarNome));
        System.out.println( separarNome[0]);
        System.out.println( separarNome[ separarNome.length-1]);
        
        
    }
}
