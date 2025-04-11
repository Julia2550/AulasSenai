package AulaJava;
import java.util.Scanner;

public class ConversorDeTemperatura {
 public static void main(String[] args) {
	 
	 //DECLARACAO DE VARIAVEIS
	 double fahrenheit;
	 final double CELSIUS;
	 
	 //ENTRADA DE DADOS
	 Scanner ler = new Scanner(System.in);
	 
	 System.out.print("Digite a temperatura em Fahrenheit: ");
	 fahrenheit = ler.nextDouble();
	 
	 //PROCE3SSAMENTO
	 CELSIUS = (((fahrenheit -32)*5)/9);
	 
	 //SAIDA
	 System.out.print("A temperatura em Celsius é: " + CELSIUS);
	 ler.close();
	

	}

}
