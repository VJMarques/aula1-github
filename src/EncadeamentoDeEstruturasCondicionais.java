import java.util.Locale;
import java.util.Scanner;

public class EncadeamentoDeEstruturasCondicionais {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	int hora;
	
	System.out.println("Que horas s�o?");
	
	hora = sc.nextInt();
	
	if (hora < 12) {		
	
		System.out.println("Bom dia!");
	}
	
	else {
		if (hora >= 12 && hora < 18) {
		System.out.println("Boa tarde!");
		}
	
	else {
		if (hora >= 18);
		System.out.println("Boa noite!");
	}
	}
	sc.close();
	
			
	}
}
