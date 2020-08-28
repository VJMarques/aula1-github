package exerciciosDeEstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2EstruturaCondicional {
	public static void main(String[] args) {
	
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
	Scanner sc = new Scanner (System.in);
	double x;
	
	System.out.println("INSIRA O NÚMERO");
	
	x = sc.nextDouble();
	
	if (x%2 != 0) {		
	
		System.out.println("ÍMPAR");
	}
	
	else {
		System.out.println("PAR");
		}
	
	sc.close();
	
			
	}
}
