import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int carroX, carroY, minutos, distancia;
		
		distancia = sc.nextInt();
		carroX = 60;
		carroY = 90;
		
		minutos = carroY / carroX * distancia * 2;
		/* 90/60 daria 1.5 o resultado, mas como é um valor do tipo INT a parte decimal é descartada.
		 * deixando somente o resultado 1. Sendo assim o valor da expressão fica o seguinte:
		 * 90/60 = 1
		 * 1 * 30 = 30
		 * 30 * 2 = 60
		 * Se fosse um casso de valor real e não INT, o resultado final da expressão seria 90.*/
		
		System.out.println(minutos + " minutos");
		
		
		
		sc.close();
	}
}
