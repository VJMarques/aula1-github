package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;
import entities.Student;


public class ExercicioFixacaoMembrosEstaticos {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	double dollarPrice;
	double amount;	
	
	System.out.print("What is the Dollar price? ");
	dollarPrice = sc.nextDouble();
	
	System.out.print("How many dollars will be bought? ");
	amount = sc.nextDouble();
	
	System.out.printf("Amount to be paid in Reais: %.2f ", CurrencyConverter.dollarToReal(amount, dollarPrice));
		
	sc.close();
	
	}

}
