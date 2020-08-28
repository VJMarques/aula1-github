package exerciciosDeEstruturaRepetitivaWhile;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1EstruturaRepetitivaWhile {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y;
		System.out.println("Insira a senha: ");
		x = sc.nextInt();
		y = 0;

		while (x != 2002) {
			y += 1;
			System.out.println("Senha Invalida");
			System.out.println("Tentativas erradas: " + y);
			System.out.println("Insira a senha: ");
			x = sc.nextInt();

		}

		System.out.println("Acesso Permitido");
		sc.close();
	}
}