package exerciciosEstruturaRepetitivaFor;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2EstruturaRepetitivaFor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x,y,a,b;
		a=0;
		b=0;
		
		System.out.println("Número de Repetições: ");
		x = sc.nextInt();		
		
		for (int i=1; i<=x; i++) {
			
			y = sc.nextInt();
			
			if (y<10 || y>20) {
				a=a+1;
			}
			
			else {
				 b=b+1;
				}
				}
		System.out.println(b + " In");
		System.out.println(a + " Out");
		
		
		
		sc.close();
	}
	}
