package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.EmployeeLista;

public class ExercicioMatrizExemplo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserir a Ordem da Matriz: ");
		int n = sc.nextInt();
		
		//INSTANCIAÇÃO DA MATRIZ//
		int[][] mat = new int[n][n];
		
		
		for (int i = 0; i<n; i++) {
		
			for (int j = 0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println("Main Diagonal: ");
		
		for (int i=0 ; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int i = 0; i<n; i++) {
			for (int j =0; j<n; j++) {
				if (mat[i][j] < 0) {
					count ++;
				}		
			
			}
		}
		
		System.out.print("Negative numbers: " + count);
		
		
		sc.close(); 
	}
		
	
	}


