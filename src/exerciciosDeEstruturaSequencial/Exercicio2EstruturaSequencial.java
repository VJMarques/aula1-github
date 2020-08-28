package exerciciosDeEstruturaSequencial;
import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2EstruturaSequencial {
	public static void main(String[] args) {
		double pi, area, raio;
		
		Locale.setDefault(Locale.US);
		
		pi = 3.14159;
				
		Scanner sc = new Scanner (System.in);	
		
		System.out.println("Entre o valor do raio: ");
		raio = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("Valor de pi: %.5f%n", pi);
				
		area = pi * Math.pow(raio, 2);
		
			
		System.out.printf("Area com 4 casas = %.4f%n", area);
		
	
		
		
	}

	private static Scanner newScanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}
}
