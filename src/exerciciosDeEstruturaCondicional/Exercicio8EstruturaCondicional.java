package exerciciosDeEstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio8EstruturaCondicional {
	public static void main(String[] args) {
	
	//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	double salario, imposto;

	
	System.out.println("SALÁRIO: ");
	salario = sc.nextDouble();
	
	if (salario <= 2000) {
		imposto = 0.0;
	}	
		else if (salario > 2000 && salario <= 3000) {
		imposto = (salario - 2000)*0.08;
		}
		else if (salario > 3000 && salario <= 4500) {
		imposto = ((salario - 3000)*0.18) + 1000*0.08 ;
		}
		else {
		imposto = (((salario - 4500)*0.28)+ 1500*0.18 + 1000*0.08);
		}
	if (imposto == 0) {
		System.out.println("ISENTO");
	}
		else {
			System.out.printf("IMPOSTO: R$ %.2f ", imposto);
		}
		
	}
}
	



	
	
	
