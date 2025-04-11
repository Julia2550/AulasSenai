package AulaJava06;
	import java.util.Scanner;
	public class ex2 {
	public static void main(String[] args) {
		//DECLARANDO VARIAVEIS
		double numero;
		try (//CHAMAR O SCANNER
		Scanner ler = new Scanner (System.in)) {
			System.out.println("Informe um número");
			numero = ler.nextDouble();
		}
		//PROCESSAMENTO
		if (numero ==1) {
		System.out.println("Domingo");
		} else if (numero ==2) {
		System.out.println("Segunda");
		}else if (numero ==3) {
		System.out.println("Terça");
		}else if (numero ==4 ) {
		System.out.println("Quarta");
		}else if (numero ==5 ) {
		System.out.println("Quinta");
		}
		else if (numero ==6) {
		System.out.println("Sexta");

		}else if (numero ==7) {
		System.out.println("Sábado");
		}
	}
		}
	
	
