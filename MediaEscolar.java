package AulaJava06;

import java.util.Scanner;

public class MediaEscolar {

	public static void main(String[] args) {
		// DECLARAÇÃO DE VARIAVEIS
		double nota1,nota2,nota3,nota4,media;
	    //CHAMAR O SCANNER
	    Scanner ler = new Scanner(System.in);
	    System.out.println("Informe o a nota1: ");
	    nota1 = ler.nextDouble();
	    System.out.println("informe o a nota2:" );
	    nota2 = ler.nextDouble();
	    System.out.println("informe o a nota3: ");
	    nota3 = ler.nextDouble();
	    System.out.println("informe o a nota4:" );
	    nota4 = ler.nextDouble();
	    ler.close();
		//PROCESSAMENTO
	    media = (nota1+nota2+nota3+nota4)/4;
	    if (media >=6) {
	    	System.out.println("aprovado");
	    }
	    else {
	    System.out.println("reprovado");
	    }
	     }
     }
