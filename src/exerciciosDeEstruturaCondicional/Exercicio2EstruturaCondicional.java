package exerciciosDeEstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2EstruturaCondicional {
	public static void main(String[] args) {
	
		//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		
	Scanner sc = new Scanner (System.in);
	double x;
	
	System.out.println("INSIRA O N�MERO");
	
	x = sc.nextDouble();
	
	if (x%2 != 0) {		
	
		System.out.println("�MPAR");
	}
	
	else {
		System.out.println("PAR");
		}
	
	sc.close();
	
			
	}
}
