package exerciciosDeEstruturaSequencial;
import java.io.InputStream;
import java.util.Scanner;

public class Exercicio1EstruturaSequencial {
	public static void main(String[] args) {
		int x, y, soma;
		
		Scanner sc = new Scanner (System.in);	
		
		System.out.println("Entre o valor de x: ");
		x = sc.nextInt();
		
		System.out.println("Entre o valor de y: ");
		y = sc.nextInt();
		
		sc.close();
		
		soma = x + y;
		System.out.println("SOMA = " + soma );
		
	
		
		
	}

	private static Scanner newScanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}
}
