import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double a, b, c, delta, r1, r2;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = b * b - 4.0 * a * c;
		/*Encontrando o valor de Delta
		  essa é a representação de Delta = b² - 4ac */
		
		if (a == 0 || delta < 0) {
		//Não existe um resultado se a for igual a 0, em toda situação
		//Se a não tem nenhum valor, por obrigação ele recebe o valor 1
		//E Delta também não pode receber um valor negativo.
			System.out.println("Impossivel calcular");
		}
		else {
			
			r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
			
		}
		
		
		sc.close();
	}
}
