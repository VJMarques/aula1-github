package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class ExercicioFixacaoVetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many rooms will be rented?");
		int number = sc.nextInt();
		sc.nextLine();
		Rent[] vect = new Rent[10];
		
		
		for (int i=0; i<number; i++) {
		
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			vect[room] = new Rent (name,email);
					
		}
		
		System.out.println();
		System.out.println("Busy Rooms: ");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + "" + vect[i]);
			}
						
		}
		
					
		sc.close();

	}

}
