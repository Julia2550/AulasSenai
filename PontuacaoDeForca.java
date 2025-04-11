package AulaJavaGeracao;

import java.util.Scanner;

public class PontuacaoDeForca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CHAMAR O SCANNER
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o nome do personagem: ");
		String nomePersonagem = scanner.nextLine();
		System.out.print("Digite a pontuação de força (1 a 100): ");
		int forca = scanner.nextInt();
		String categoria;
		//PROCESSAMENTO
		if (forca >= 1 && forca <= 20) {
		categoria = "Iniciante";
		} else if (forca >= 21 && forca <= 50) {
		categoria = "Guerreiro";
		} else if (forca >= 51 && forca <= 80) {
		categoria = "Elite";
		} else if (forca >= 81 && forca <= 100) {
		categoria = "Lendário";
		} else {
		categoria = "Erro: Pontuação fora do intervalo válido!";
		}
		System.out.println("Personagem: " + nomePersonagem);
		System.out.println("Classificação: " + categoria);
		scanner.close();
		}
	}