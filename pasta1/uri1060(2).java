import java.util.Scanner;
import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor;
		int positivo = 0;
		
		for (int i = 0; i <6; i++) {
			
			valor = sc.nextDouble();
			if (valor > 0) {
				positivo ++;
			}
		}
		System.out.printf("%d valores positivos%n", positivo);
		
		sc.close();
	}
}
