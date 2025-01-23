import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, area, perimetro;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
		/*Condição para formar um triangulo: A condição necessária para
		 * que 3 lados forme um triangulo, é necessário que a soma de
		 * dois lados seja maior que o terceiro. */	
			perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f%n", perimetro);
			/*Caso a condição necessária seja alcançada, o calculo do
			 * perimetro do triangulo é feita pela soma dos 3 lados. O
			 * resultado dessa soma será o perimetro do Triangulo.*/
		}
		else {
			area = ((a + b) * c)/2.0;
			/*A formula para calcular a base de um trapezio é essa
			 *onde a e b representam as bases do trapezio, c a altura
			 *após encontrar o resultado das bases * altura é só dividir
			 *por 2.*/
			System.out.printf("Area = %.1f%n", area);
		}
		
		sc.close();
	}
}
