package exerciciosEstruturaRepetitivaFor;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4EstruturaRepetitivaFor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a,b,c;
		int N;
				
		System.out.println("N�mero de Repeti��es: ");
		N = sc.nextInt();		
		
		for (int i=0; i<N; i++) {
			
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = a/b;
			
			if (b==0) {
				System.out.println("Divis�o Imposs�vel");
				
			}
			
			else {
				System.out.printf("Divis�o: %.1f%n ", c);			
			}
		}
				
		
		sc.close();
	}
	}
