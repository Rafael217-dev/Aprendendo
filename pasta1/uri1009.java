import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String Nome;
		double salario_fixo, comissao, vendas, TOTAL;
		
		Nome = sc.next();
		salario_fixo = sc.nextDouble();
		vendas = sc.nextDouble();
		
		comissao = vendas * 0.15;
		
		TOTAL = salario_fixo + comissao;
		
		System.out.printf("TOTAL = R$ %.2f\n " , TOTAL);
		
		
		sc.close();
	}
}
