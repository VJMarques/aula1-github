package exerciciosEstruturaRepetitivaFor;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4EstruturaRepetitivaFor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a,b,c;
		int N;
				
		System.out.println("Número de Repetições: ");
		N = sc.nextInt();		
		
		for (int i=0; i<N; i++) {
			
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = a/b;
			
			if (b==0) {
				System.out.println("Divisão Impossível");
				
			}
			
			else {
				System.out.printf("Divisão: %.1f%n ", c);			
			}
		}
				
		
		sc.close();
	}
	}
