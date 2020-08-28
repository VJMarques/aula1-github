package exerciciosDeEstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7EstruturaCondicional {
	public static void main(String[] args) {
	
	//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	double x,y;

	
	System.out.println("X: ");
	x = sc.nextDouble();
	System.out.println("Y: ");
	y = sc.nextDouble();
	
	if ((x>0) && (y>0)) {
		System.out.println("QUADRANTE 1");
	}
		else if ((x<0) && (y<0)) {
			System.out.println("QUADRANTE 2");
		}
		else if ((x<0) && (y<0)) {
			System.out.println("QUADRANTE 3");
		}
		else if ((x>0) && (y<0)) {
			System.out.println("QUADRANTE 4");
		}
		else if ((x==0) && (y==0)) {
			System.out.println("ORIGEM");
		}
		else if ((x==0) && (y>0 || y<0)) {
				System.out.println("EIXO Y");
		}
		else if ((x>0||x<0) && (y==0)) {
			System.out.println("EIXO X");
		}
	else {
		System.out.println("DIGITE VALORES VALIDOS!");
	}
		
		
		
	sc.close();
	}
	
}