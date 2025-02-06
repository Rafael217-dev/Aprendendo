import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, reajuste,salario_final;
		int percentual;
		salario = sc.nextDouble();
		percentual = 0;
		
		
		if (salario >= 0 && salario <= 400.00) {
			
			reajuste = salario * 0.15;
			salario_final = salario + reajuste;
			percentual = 15;
			
		}
		else if (salario >= 400.01 && salario <= 800.00) {
			
			reajuste = salario * 0.12;
			salario_final = salario + reajuste;
			percentual = 12;
		}
		else if (salario >= 800.01 && salario <= 1200.00) {
			
			reajuste = salario * 0.10;
			salario_final = salario + reajuste;
			percentual = 10;
		}
		else if (salario >= 1200.01 && salario <= 2000.00) {
			
			reajuste = salario * 0.07;
			salario_final = salario + reajuste;
			percentual = 7;
		}
		else {
			
			reajuste = salario * 0.04;
			salario_final = salario + reajuste;
			percentual = 4;
		}
		
		System.out.printf("Novo salario: %.2f%n", salario_final);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.println("Em percentual: " + percentual + " %");
		
		sc.close();
	}
}
