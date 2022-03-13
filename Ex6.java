/*
Fazer um programa que o usuário entre com uma frase e o programa imprimana tela 
a frase com todos os caracteres em maiúsculo.
 */
package aula1;

import java.util.Scanner; 

public class Ex6 {
    public static void main(String[] args){
        String Frase;
        Scanner Mensagem = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        Frase = Mensagem.nextLine();
        System.out.println(Frase.toUpperCase());
    }
}
