package exerciciosDeEstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4EstruturaCondicional {
	public static void main(String[] args) {
	
	//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
	Scanner sc = new Scanner (System.in);
	int x,y,hora;
		
	System.out.println("INSIRA A HORA INICIAL: ");
	x = sc.nextInt();
	System.out.println("INSIRA A HORA FINAL: ");
	y = sc.nextInt();
	
	if ((x<=23 && x>=0) && (y<=23 && y>=0)) {
	
		if (x>y) {
			hora = 24+y-x;
			System.out.println("O JOGO DUROU " + hora +"HORAS" );
		}
		
		if (y>x) {
			hora = y-x;
			System.out.println("O JOGO DUROU " + hora +"HORAS" );
		}
		
		if (x==y) {
			hora = 24;
			System.out.println("O JOGO DUROU " + hora +"HORAS" );
		}
	} 
		
	else {
		System.out.println("INSIRA UMA HORA VÁLIDA");
	
	sc.close();
	
			
	}
}
}