package exerciciosDeEstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio5EstruturaSequencial {
	public static void main(String[] args) {
	
	double preco1, preco2, total;
	int quant1, quant2, cod1, cod2;
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Insira o C�digo da pe�a 1: ");
	cod1 = sc.nextInt();
	System.out.println("Escreva a quantidade de pe�as: ");
	quant1 = sc.nextInt();
	System.out.println("Escreva o valor unit�rio da pe�a: ");
	preco1 = sc.nextDouble();
	
	System.out.println("Insira o C�digo da pe�a 2: ");
	cod2 = sc.nextInt();
	System.out.println("Escreva a quantidade de pe�as: ");
	quant2 = sc.nextInt();
	System.out.println("Escreva o valor unit�rio da pe�a: ");
	preco2 = sc.nextDouble();
	
	total = (preco1 * quant1)+(preco2 * quant2);
		
	sc.close();
			
	System.out.printf("VALOR A PAGAR = R$ %.2f%n", total);
		
	}
}
