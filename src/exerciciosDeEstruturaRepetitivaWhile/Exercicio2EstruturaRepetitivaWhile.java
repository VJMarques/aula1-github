package exerciciosDeEstruturaRepetitivaWhile;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2EstruturaRepetitivaWhile {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y;
		System.out.println("Insira a Coordenada X: ");
		x = sc.nextInt();
		System.out.println("Insira a Coordenada Y: ");
		y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto Quadrante");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
			}
		System.out.println();
		
		System.out.println("Insira a Coordenada X: ");
		x = sc.nextInt();
		System.out.println("Insira a Coordenada Y: ");
		y = sc.nextInt();

		}

		sc.close();
	}
}