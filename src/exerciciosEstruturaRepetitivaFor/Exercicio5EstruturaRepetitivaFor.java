package exerciciosEstruturaRepetitivaFor;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5EstruturaRepetitivaFor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x,f;		
		x = sc.nextInt();
		f = 1;
		
		for (int i=1; i<=x ;i++) {
	
			f = f*i;
		}
				System.out.println("Fatorial = "+f);
				
		sc.close();
	}
	}
