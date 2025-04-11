package AulaJavaGeracao;

import java.util.Scanner;

    public class ConverterOperador03 {
	public static void main(String[] args) {
		double a;
		Scanner ler = new Scanner(System.in);
		System.out.println("informe um valor: ");
		a = ler.nextDouble();
		String msg = a % 5 == 0 ? "é multiplo de 5" : "não é multiplo de 5";
		System.out.println("O numero " +msg);
		ler.close();
		}
		}

