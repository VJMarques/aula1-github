package exerciciosDeEstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1EstruturaCondicional {
	public static void main(String[] args) {
	
		//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		
	Scanner sc = new Scanner (System.in);
	double x;
	
	System.out.println("INSIRA O N�MERO");
	
	x = sc.nextDouble();
	
	if (x >= 0) {		
	
		System.out.println("POSITIVO");
	}
	
	else {
		System.out.println("NEGATIVO");
		}
	
	sc.close();
	
			
	}
}
