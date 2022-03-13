/*
 Fazer um programa paracalcular o Índice de Massa Corporal. O programa deverá 
exibir a janela de diálogo duas vezes, na primeira vez o usuário deverá fornecer 
o peso e  na segunda a altura. Em seguida, o programa deverá imprimir na tela 
o valor do IMC. A fórmula de cálculo do IMC é peso/(altura*altura).
 */
package aula1;

import javax.swing.JOptionPane;

public class Ex5 {
    public static void main(String[] args){
        float Peso;
        float Altura;
        float Imc;
        
        String pesoinfo = JOptionPane.showInputDialog("Digite o seu peso: ");
        Peso = Float.parseFloat(pesoinfo);
        String alturainfo = JOptionPane.showInputDialog("Digite sua altura ");
        Altura= Float.parseFloat(alturainfo);
        
        Imc = (Peso/(Altura * Altura));
        System.out.println("O seu IMC é: " + Imc);
    }
}
      