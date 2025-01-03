import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num_fncr, hrs_trbld, NUMBER;
		double SALARY, salario;
		
		num_fncr = sc.nextInt();
		hrs_trbld = sc.nextInt();
		salario = sc.nextDouble();
		
		NUMBER = num_fncr;
		SALARY = hrs_trbld * salario;
		
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f\n" , SALARY);
		
		
		
		
		sc.close();
	}
}
