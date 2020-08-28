package exerciciosDeEstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio6EstruturaSequencial {
	public static void main(String[] args) {
	
	double A, B, C, pi, triangulo, circulo, trapezio, quadrado, retangulo;
			
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	pi = 3.14159;
	
//INSERÇÃO DE VALORES
	System.out.println("Insira o valor de A: ");
	A = sc.nextDouble();
	System.out.println("Insira o valor de B: ");
	B = sc.nextDouble();
	System.out.println("Insira o valor de C: ");
	C = sc.nextDouble();
	
//CÁLCULO DAS ÁREAS 
	triangulo = ((A*C)/2);
	circulo = pi*(Math.pow(C, 2));
	trapezio = (((A+B)*C)/2);
	quadrado = Math.pow(B,2);
	retangulo = A*B;

	sc.close();
	
	System.out.printf("ÁREA DO TRIÂNGULO DE BASE A E ALTURA C = %.3f%n", triangulo);
	System.out.printf("ÁREA DO CIRCULO DE RAIO C = %.3f%n", circulo);
	System.out.printf("ÁREA DO TRAPEZIO DE BASE A E B E ALTURA C = %.3f%n", trapezio);
	System.out.printf("ÁREA DO QUADRADO DE LADO B = %.3f%n", quadrado);
	System.out.printf("ÁREA DO RETANGULO DE BASE A E ALTURA B = %.3f%n", retangulo);
	
	}
}
