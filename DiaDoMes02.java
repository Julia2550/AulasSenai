package AulaJava06;
import java.util.Scanner;
public class DiaDoMes02 {
	//
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	System.out.println("Informe um mês do ano: ");
	int mes = ler.nextInt();
	switch (mes) {
	case 1:
	System.out.println("O mês escolhido foi Janeiro");
	break;
	case 2:
	System.out.println("O mês escolhido foi Fevereiro");
	break;
	case 3:
	System.out.println("O mês escolhido foi Março");
	break;
	case 4:
	System.out.println("O mês escolhido foi Abril");
	break;
	case 5:
	System.out.println("O mês escolhido foi Maio");
	break;
	case 6:
	System.out.println("O mês escolhido foi Junho");
	break;
	case 7:
	System.out.println("O mês escolhido foi Julho");
	break;
	case 8:
	System.out.println("O mês escolhido foi Agosto");
	break;
	case 9:
	System.out.println("O mês escolhido foi Setembro");
	break;
	case 10:
	System.out.println("O mês escolhido foi Outubro");
	break;
	case 11:
	System.out.println("O mês escolhido foi Novembro");
	break;
	case 12:
	System.out.println("O mês escolhido foi Dezembro");
	break;
	default:
	System.out.println("Mês invalido, informe outro valor");
	}
	 }
	}