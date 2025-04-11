package AulaJava;

import java.util.Scanner;

public class ConversordeMoedas {

	public static void main(String[] args) {
		//DECLARACAO DE VARIAVEIS
		double valorReal;
		double cotacaoMoedas;
		double valorConvertido;
		
		//ENTRADA DE DADOS
		Scanner ler =new Scanner(System.in);
		
	    System.out.println("Digite o valor em reais: ");
		valorReal = ler.nextDouble();
		
		System.out.println("Digite a cotação da moeda desejada: ");
		cotacaoMoedas = ler.nextDouble();
		
		//PROCESSAMENTO
		valorConvertido = valorReal * cotacaoMoedas;
		
		//SAIDA
		System.out.print("O valor convertido para a moeda desejada é : " + valorConvertido);
		ler.close();
	}

}
