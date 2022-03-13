/*
Fazer um programa que exiba a janela de diálogo três vezes, em cada uma delas o
usuário  irá  entrar  com  um  número  inteiro.  Após  isso  o  programa  deverá  
imprimir  na  tela  o somatório dos valores.
 */
package aula1;

import java.util.Scanner; 

public class Ex4 {
    public static void main(String[] args){
        int n;
        int Soma =0;
        int Quantidade;
        
        Scanner Mensagem = new Scanner(System.in);//criar classe para o scanner
        
        for(Quantidade=1;Quantidade <=3;Quantidade++){
            System.out.println("Insira um número: ");
            n = Mensagem.nextInt();
            Soma=Soma+n;
        }
        System.out.println("A somatória desses valores são: " + Soma);
                    
}
}
