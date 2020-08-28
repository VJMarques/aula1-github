import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		x = sc.nextInt();
				
		for (int i=1; i<=x; i++) {

			if (i%2 !=0) {
				System.out.println("Ímpares: " +i);
			}
		
		
		
		sc.close();
	}
	}
}
