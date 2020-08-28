package exerciciosDeEstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3EstruturaCondicional {
	public static void main(String[] args) {
	
		//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
		
	Scanner sc = new Scanner (System.in);
	double x,y;
	
	System.out.println("INSIRA O NÚMERO X");
	x = sc.nextDouble();
	System.out.println("INSIRA O NÚMERO Y");
	y = sc.nextDouble();
	
	
	if (x%y==0 || y%x==0) {		
	
		System.out.println("SÃO MÚLTIPLOS");
	}
	
	else {
		System.out.println("NÃO SÃO MÚLTIPLOS");
		}
	
	sc.close();
	
			
	}
}
