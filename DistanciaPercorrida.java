package AulaJava;

import java.util.Scanner;

public class DistanciaPercorrida {

	public static void main(String[] args) {
		// DECLARAÇÃO DE VARIAVEIS
    double AnguloDeLançamento,VelocidadeInicial,DistanciaPercorrida;
       //ENTRADA DE DADOS
    
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe o valor do ângulo (°):");
    AnguloDeLançamento = ler .nextDouble();
    
    System.out.println("Informe a velocidade inicial (km/h");
    VelocidadeInicial = ler .nextDouble();
    //PROCESSAMENTO
    
    DistanciaPercorrida = (((VelocidadeInicial *VelocidadeInicial)*Math.sin(AnguloDeLançamento))/9.81);
    //SAÍDA
    
    System.out.println("A distância percorrida é:"+DistanciaPercorrida);
    ler.close();
	}
}
