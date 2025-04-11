package AulaJavaGeracao;

import java.util.Scanner;

public class AulaJavaGeracao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SCANNER
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o ano de nascimento: ");
		int anoNascimento = scanner.nextInt();
		String geracao;
		//PROCESSAMENTO
		if (anoNascimento >= 1946 && anoNascimento <= 1964) {
		geracao = "Baby Boomers";
		} else if (anoNascimento >= 1965 && anoNascimento <= 1980) {
		geracao = "Geração X";
		} else if (anoNascimento >= 1981 && anoNascimento <= 1996) {
		geracao = "Millennials ou Geração Y";
		} else if (anoNascimento >= 1997 && anoNascimento <= 2010) {
		geracao = "Geração Z";
		} else if (anoNascimento > 2010) {
		geracao = "Geração Alpha";
		} else {
		geracao = "Ano de nascimento fora do intervalo definido";
		}
		System.out.println("Você pertence à " + geracao);
		scanner.close();
		}
		 }