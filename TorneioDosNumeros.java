package meuProjeto.aluno;
import java.util.Scanner;
public class TorneioDosNumeros {
 public static void main(String[] args) {
     
	 Scanner scanner = new Scanner(System.in);

     int pares = 0;
     int impares = 0;

     System.out.println("Digite 10 números inteiros:");

     for (int i = 1; i <= 10; i++) {
         System.out.print("Número " + i + ": ");
         int numero = scanner.nextInt();

         if (numero % 2 == 0) {
             pares++;
         } else {
             impares++;
         }
     }

     System.out.println("Quantidade de números pares: " + pares);
     System.out.println("Quantidade de números ímpares: " + impares);

     if (pares > impares) {
         System.out.println(" Os PARES venceram!");
     } else if (impares > pares) {
         System.out.println(" Os ÍMPARES venceram!");
     } else {
         System.out.println(" Empate entre pares e ímpares!");
     }

     scanner.close();
 }
}
