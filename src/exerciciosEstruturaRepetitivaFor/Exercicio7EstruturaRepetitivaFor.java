package exerciciosEstruturaRepetitivaFor;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7EstruturaRepetitivaFor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, a, b, c;

		N = sc.nextInt();
		a = 0;
		b = 0;
		c = 0;

		for (int i = 1; i <= N; i++) {

			a = i;
			b = i * i;
			c = i * i * i;

			System.out.printf(" %d %d %d%n", a, b, c);

		}

		sc.close();
	}
}
