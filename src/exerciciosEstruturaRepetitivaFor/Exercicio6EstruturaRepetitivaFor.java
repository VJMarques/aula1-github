package exerciciosEstruturaRepetitivaFor;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio6EstruturaRepetitivaFor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x,d;		
		x = sc.nextInt();
		d = 0;
		
		for (int i=1; i<=x ;i++) {
	
			d = x%i;
			
			if (d==0) {
				System.out.println(+i);
			}
		}
				
		sc.close();
	}
	}
