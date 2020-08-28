package exerciciosEstruturaRepetitivaFor;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3EstruturaRepetitivaFor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,media;
		int N;
				
		System.out.println("Número de Repetições: ");
		N = sc.nextInt();		
		
		for (int i=0; i<N; i++) {
			
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			
			media = (((a*2)+(b*3)+(c*5))/10);
			System.out.printf("Média: %.1f%n ", media);			
		}
				
		
		sc.close();
	}
	}
