package exerciciosDeEstruturaSequencial;
import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3EstruturaSequencial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
			
	int A, B, C, D, DIFERENCA;
	
	System.out.println("Entre o valor de A");
	A = sc.nextInt();
	
	System.out.println("Entre o valor de B");
	B = sc.nextInt();
	
	System.out.println("Entre o valor de C");
	C = sc.nextInt();
	
	System.out.println("Entre o valor de D");
	D = sc.nextInt();
	
	sc.close();
	
	DIFERENCA = ((A*B)-(C*D));
	
	System.out.println("DIFERENCA = " + DIFERENCA);
	
	
	
	}
}
