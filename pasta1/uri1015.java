import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, y1, y2, Distancia;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		Distancia = Math.sqrt(Math.pow((x2-x1), 2.0) + Math.pow((y2-y1), 2.0));
		/*Vou comentar isso se não eu nunca mais lembro:
		 * Para calular a distancia entre 2 pontos com 2 eixos
		 * é necessário utilizar a formula Distancia = Raiz quadrada de (x2 - x1)² + (y2 - y1)²
		 * Ou seja, Distancia receberá o valor da raiz quadrada do resultado da expressão acima
		 * e em java, para resolver essa expressão é da forma que está acima. Fica de exemplo para 
		 * outra possíveis situações parecidas. PS: Não consegui resolver sozinho. :(*/
		
		System.out.printf("%.4f%n", Distancia);
		
		sc.close();
	}
}
