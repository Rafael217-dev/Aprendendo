import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		double valor, total;
		cod = sc.nextInt();
		qtd = sc.nextInt();
		
		if (cod == 1) {
			valor = 4.00;
			total = qtd * valor;
			
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (cod == 2) {
			valor = 4.50;
			total = qtd * valor;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (cod == 3 ) {
			valor = 5.00;
			total = qtd * valor;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (cod == 4 ) {
			valor = 2.00;
			total = qtd * valor;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (cod == 5 ) {
			valor = 1.50;
			total = qtd * valor;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		
		sc.close();
	}
}
