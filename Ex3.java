/*
 Fazer um programa que imprimana tela a média dos números ímpares que estão no intervalo entre 0 e 100.
 */
package aula1;
public class Ex3 {
        public static void main(String[] args) {
            int n;
            int Quantidade=0;
            int Soma=0;
            float Media;
            
            for(n=0;n<=100; n++)
            {
                if(n%2 == 1){
                    Quantidade=Quantidade+1;
                    Soma=Soma+n;
                    n++;
                    System.out.println(Soma);
                }
            }
           Media=Soma/Quantidade;
           System.out.println(Media);
   

}
}
