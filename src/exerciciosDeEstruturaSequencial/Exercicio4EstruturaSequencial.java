package exerciciosDeEstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio4EstruturaSequencial {
	public static void main(String[] args) {
	
	double horas, valorhora, salario;
	int numero;
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
		
	System.out.println("Escreva o n�mero do funcion�rio: ");
	numero = sc.nextInt();
	
	System.out.println("Escreva a quantidade de horas trabalhadas: ");
	horas = sc.nextDouble();
	
	System.out.println("Escreva o valor da hora do funcion�rio: ");
	valorhora = sc.nextDouble();

	sc.close();
	
	salario = horas * valorhora;
		
	System.out.println("FUNCION�RIO N�MERO = " + numero);
	System.out.printf("SAL�RIO = U$ %.2f%n", salario);
		
	}
}
