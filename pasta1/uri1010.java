import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String Nome;
		int cod_1, cod_2, qtd_1, qtd_2;
		double valor_pc1, valor_pc2, valor_final;
		
		cod_1 = sc.nextInt();
		qtd_1 = sc.nextInt();
		valor_pc1 = sc.nextDouble();
		
		cod_2 = sc.nextInt();
		qtd_2 = sc.nextInt();
		valor_pc2 = sc.nextDouble();
		
		valor_final = qtd_1 * valor_pc1 + qtd_2 * valor_pc2;
		
		System.out.printf("VALOR A PAGAR = R$ %.2f\n", valor_final);
		
		
		sc.close();
	}
}
