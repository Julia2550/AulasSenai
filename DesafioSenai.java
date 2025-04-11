package AulaJava;

import java.util.Scanner;

public class DesafioSenai {

	public static void main(String[] args) {
		// DECLARAÇÃO DE VARIAVEIS
        double Angulo,Radiano =0;
        
       //ENTRADA DE DADOS 
        Scanner ler =new Scanner(System.in);
        
        System.out.println("informe o Angulo (°):");
        Angulo = ler .nextDouble();
        
       //PROCESSAMENTO
        Math.atan(Radiano);
        Radiano = ((Angulo *3.14)/180);
        
        //SAIDA
        System.out.println("A conversâo de Angulo pra radiano é:" +Radiano);
        ler .close();
        
}
 }