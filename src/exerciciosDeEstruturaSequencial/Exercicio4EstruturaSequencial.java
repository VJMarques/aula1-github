package exerciciosDeEstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio4EstruturaSequencial {
	public static void main(String[] args) {
	
	double horas, valorhora, salario;
	int numero;
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
		
	System.out.println("Escreva o número do funcionário: ");
	numero = sc.nextInt();
	
	System.out.println("Escreva a quantidade de horas trabalhadas: ");
	horas = sc.nextDouble();
	
	System.out.println("Escreva o valor da hora do funcionário: ");
	valorhora = sc.nextDouble();

	sc.close();
	
	salario = horas * valorhora;
		
	System.out.println("FUNCIONÁRIO NÚMERO = " + numero);
	System.out.printf("SALÁRIO = U$ %.2f%n", salario);
		
	}
}
