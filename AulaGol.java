package AulaGol;

import java.util.Random;
import java.util.Scanner;

public class AulaGol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIAVEIS
		double direcao;
		int goleiro;
		//ENTRADA
		Scanner ler = new Scanner(System.in);
		System.out.print("Escolha uma direção para chutar: ");
		direcao = ler.nextDouble();
		ler.close();
		//PROCESSAMENTO
		if (direcao <=0 || direcao >= 4) {
		System.out.println("Chutou fora,seu ruim!");
		}else {
		Random randon = new Random ();
		goleiro = randon.nextInt(3)+1;
		//SAIDA
		System.out.println("Goleiro pulou para " + goleiro);
		if (goleiro == direcao) {
		System.out.println("O goleiro defendeu HAHAHA!");
		}
		else {
		System.out.println("GOOOOOL DA JUMAA!!");
		}
		 }
		}
}