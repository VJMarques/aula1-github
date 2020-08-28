package orientacaoAObjetos;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;


public class Exercicio3OrientacaoAObjetos {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	Student student = new Student();
	
	System.out.println("Insert Student's name: ");
	student.name = sc.nextLine();
	
	System.out.println("Insert Student's 1st grade: ");
	student.grade1 = sc.nextDouble();
	
	System.out.println("Insert Student's 2nd grade: ");
	student.grade2 = sc.nextDouble();
	
	System.out.println("Insert Student's 3rd grade: ");
	student.grade3 = sc.nextDouble();
	
	student.finalGrade();
	
	if ((student.finalGrade() > 60)){
		
		System.out.printf("FINAL GRADE: %.2f", student.finalGrade());
		System.out.println();
		System.out.println("PASSED!");
	}
	
		else {
		
			System.out.printf("FINAL GRADE: %.2f", student.finalGrade());
			System.out.println();
			System.out.println("FAILED! ");
			System.out.printf("Missing %.2f points.%n", student.missingGrade());
			
		}
			
	sc.close();
	
	}

}
