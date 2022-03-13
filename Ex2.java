/*
 Fazer um programa que imprima na tela o somatório dos números de 0 a 10.
 */
package aula1;
public class Ex2 {
    public static void main(String[] args){
   int n = 0;
   int Soma = 0;
   while(n<=10)
   {
    Soma = Soma+ n;
    n++;
   }
 System.out.println(Soma);
}
}
