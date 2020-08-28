package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatrizProposto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserir a Ordem da Matriz");
		System.out.print("M (linhas): ");
		int m = sc.nextInt();
		System.out.print("N (colunas): ");
		int n = sc.nextInt();
		System.out.println();
				
		//INSTANCIAÇÃO DA MATRIZ//
		int[][] mat = new int[m][n];
		
		
		for (int i = 0; i<m; i++) {
		
			for (int j = 0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.print("Valor de X: ");
		int x = sc.nextInt();
		
		for (int i = 0; i<m; i++) {
			
			for (int j = 0; j<n; j++) {
				
				if (mat[i][j] == x) {
					
					System.out.print("Position: " + i + ", " + j);
					System.out.println();
					
				if (i>0)	{
					System.out.print("Up: " + mat[(i-1)][j]); 
					System.out.println();
				}
				if (i<m-1) {
					System.out.print("Down: " + mat[(i+1)][j]);
					System.out.println();
				}
				if (j>0) {
					System.out.print("Left: " + mat[i][(j-1)]);
					System.out.println();
				}
				if (j<n-1) {
					System.out.print("Right: " + mat[i][(j+1)]);
					System.out.println();
				}
				
				}
				
				}
					
			}
		
		
		sc.close(); 
	}
		
	
	}
