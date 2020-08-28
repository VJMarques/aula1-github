package orientacaoAObjetos;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio1OrientacaoAObjetos {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	Rectangle rect;
		
	rect = new Rectangle();

	
	System.out.println("Enter the measures of Width: ");
	rect.width = sc.nextDouble();
	
	System.out.println("Enter the measures of Height: ");
	rect.height = sc.nextDouble();
	
	
	System.out.printf("Area: %.2f", rect.Area());
	System.out.println();
	System.out.printf("Perimeter: %.2f", rect.Perimeter());
	System.out.println();
	System.out.printf("Diagonal: %.2f", rect.Diagonal());
	
	
	sc.close();
	
	}

}
