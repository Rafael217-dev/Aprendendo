import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");//E caso os 2 pontos estão no centro, significa que ele está no ponto de origem.
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");//Se o eixo X estiver 0.0, então signifca que o ponto está em algum do eixo Y, porque não houve deslocamento do eixo X.
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");//E aqui o mesmo se aplica para o eixo Y.
		}
		else if(x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		sc.close();
	}
}
