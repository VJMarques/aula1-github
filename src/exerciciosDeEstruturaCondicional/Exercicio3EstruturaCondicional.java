package exerciciosDeEstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3EstruturaCondicional {
	public static void main(String[] args) {
	
		//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem crescente ou decrescente.
		
	Scanner sc = new Scanner (System.in);
	double x,y;
	
	System.out.println("INSIRA O N�MERO X");
	x = sc.nextDouble();
	System.out.println("INSIRA O N�MERO Y");
	y = sc.nextDouble();
	
	
	if (x%y==0 || y%x==0) {		
	
		System.out.println("S�O M�LTIPLOS");
	}
	
	else {
		System.out.println("N�O S�O M�LTIPLOS");
		}
	
	sc.close();
	
			
	}
}
