package exerciciosDeEstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5EstruturaCondicional {
	public static void main(String[] args) {
	
	//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		
	Scanner sc = new Scanner (System.in);
	double c,preco,q;
	Locale.setDefault(Locale.US);
	
	System.out.println("INSIRA O CÓDIGO DO ITEM: ");
	c = sc.nextDouble();
	
	if (c==1) {
		System.out.println("QUANTOS CACHORROS-QUENTES?");
		q = sc.nextDouble();
		preco = q*4;
		System.out.println("TOTAL A PAGAR: R$ " + preco);
	}
		else if (c==2) {
			System.out.println("QUANTOS X-SALADAS?");
			q = sc.nextDouble();
			preco = q*4.5;
			System.out.println("TOTAL A PAGAR: R$ " + preco);
		}
		else if (c==3) {
			System.out.println("QUANTOS X-BACONS?");
			q = sc.nextDouble();
			preco = q*5.0;
			System.out.println("TOTAL A PAGAR: R$ " + preco);
		}
		else if (c==4) {
			System.out.println("QUANTAS TORRADAS SIMPLES?");
			q = sc.nextDouble();
			preco = q*2.0;
			System.out.println("TOTAL A PAGAR: R$ " + preco);
		} 
		else if (c==5) {
			System.out.println("QUANTOS REFRIS?");
			q = sc.nextDouble();
			preco = q*1.5;
			System.out.println("TOTAL A PAGAR: R$ " + preco);
		}
		else {
			System.out.println("INSIRA UM CÓDIGO VÁLIDO");
		}
	sc.close();
	}
	
}