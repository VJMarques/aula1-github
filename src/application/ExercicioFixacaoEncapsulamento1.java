package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ExercicioFixacaoEncapsulamento1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account; // Declaracao de account como variável, pois a classe Account DEVE ser
							// instanciada, uma vez que ela depende de entradas do método

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		System.out.print("Is there an initial deposit? ");
		char answer = sc.next().charAt(0);
		sc.nextLine();

		if (answer == 'y') {

			System.out.print("Enter the initial deposit: ");
			double initialDeposit = sc.nextDouble();
			System.out.println();
			account = new Account(number, holder, initialDeposit); // Caso haja um deposito inicial, a construção
																	// Account deve receber 3 variáveis, contando o
																	// deposito inicial.
			System.out.println("Account Data: ");
			System.out.println(account);

		}

		else {

			account = new Account(number, holder); // Caso nao haja, a construção Account recebe só 2 variaveis
			System.out.printf("Account Data: " + account);
			System.out.println();
		}

		// O próximo passo é o usuário fazer um depósito na conta
		System.out.print("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue); // Quando o depósito acontece, o método deposit deve ser chamado para atualizar
										// o valor de BALANCE no resultado
		sc.nextLine();

		System.out.println("Updated account data: ");
		System.out.printf("Account Data: " + account);
		System.out.println();

		System.out.print("Enter withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		sc.nextLine();

		System.out.println("Updated account data: ");
		System.out.printf("Account Data: " + account);

		sc.close();

	}

}
