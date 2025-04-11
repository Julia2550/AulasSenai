package AulaJava06;
	import java.util.Scanner;
	public class DiaDomes {
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
		System.out.println("Janeiro");
		} else if (numero ==2) {
		System.out.println("Fevereiro");
		}else if (numero ==3) {
		System.out.println("Março");
		}else if (numero ==4 ) {
		System.out.println("Abril");
		}else if (numero ==5 ) {
		System.out.println("Maio");
		}else if (numero ==6) {
		System.out.println("Junho");
		}else if (numero ==7) {
		System.out.println("Julho");
		} else if (numero ==8) {
		System.out.println("Agosto");
		}else if (numero ==9) {
		System.out.println("Setembro");
		}else if (numero ==10 ) {
		System.out.println("Outubro");
		}else if (numero ==11 ) {
		System.out.println("Novembro");
		}else if (numero ==12) {
		System.out.println("Dezembro");
		
		}
		 }
		}
