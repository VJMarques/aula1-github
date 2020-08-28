package orientacaoAObjetos;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Exercicio2OrientacaoAObjetos {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	Employee employee = new Employee();
	
	System.out.print("Name: ");
	employee.name = sc.nextLine();
	
	System.out.print("Salary: ");
	employee.salary = sc.nextDouble();
	
	System.out.print("Tax: ");
	employee.tax = sc.nextDouble();
	System.out.println();
	
	System.out.println(employee);
	System.out.println();
	
	System.out.print("Which percentage to increase salary? ");
	double percentage = sc.nextDouble();
	employee.increasedSalary(percentage);
	System.out.println();
	
	System.out.print("Updated Data: " + employee);
	
	
	
	sc.close();
	
	}

}
