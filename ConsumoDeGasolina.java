package AulaJava;
import java.util.Scanner;

public class ConsumoDeGasolina {
 public static void main(String[] args) {
	 
	 //DECLARANDO VARIAVEIS
	 double valLitro, distanciaKM, consumo,
	 totalLitros, totalGasto; 
	 
	 //ENTRADA DE DADOS 
	 Scanner ler = new Scanner(System.in);
	 
	 System.out.println("Informe o valor do combustivel (R$): ");
	 valLitro = ler.nextDouble();
	 
	 System.out.println("informe a distancia percorrida (KM: ");
	 distanciaKM = ler.nextDouble();
	 
	 System.out.println("Informe o consumo medio (KM/1): ");
	 consumo = ler.nextDouble();
	 
	 //PROCESSAMENTO
	 totalLitros = distanciaKM/consumo;
	 totalGasto = totalLitros*valLitro;
	 
	 //SAIDA
	 System.out.println("O total de litros consumidos é: " + totalLitros + "Litros");
	 
	 System.out.println("O total gasto é de R$ " + totalGasto);
	 ler.close();
	 
	 
	 
	}

}
