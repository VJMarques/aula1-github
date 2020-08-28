package exerciciosDeEstruturaRepetitivaWhile;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3EstruturaRepetitivaWhile {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int c, alcool, diesel, gasolina;
		System.out.println("Insira o codigo do produto: ");
		c = sc.nextInt();
		alcool = 0;
		diesel = 0;
		gasolina = 0;

		while (c != 4) {

			if (c == 1) {
				alcool += 1;
			} else if (c == 2) {
				gasolina += 1;
			} else if (c == 3) {
				diesel += 1;
			}
			c = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	
	sc.close();
	}
}