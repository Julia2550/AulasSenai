package AulaSenaiRepetição;
import java.util.Scanner;
 public class AulaTabuada01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    int num;
	Scanner ler = new Scanner (System.in);
    System.out.println("informe um nunmero para tabuada: ");
    num = ler.nextInt();
	for (int i = 1; i <= 10; i++) {
    System.out.println( i + " X " + num + " = " + (i*num));
    ler.close();
	
	}
	 }
}
