import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		/*Para verificar se um numero é multiplo de outro, é necessário
		 * fazer uma conta dividindo os numeros, e se caso o resto da
		 * divisão de 0, um é multiplo do outro, se não, eles nao sao
		 * multiplos. Nesse código, a condição verificada é que 
		 * qualquer que seja a ordem de entrada dos valores, o resultado
		 * deve ser 0, isso é a garantia que os valores digitados são
		 * multiplos.*/
		
		
		if(b % a == 0 || a % b == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		sc.close();
	}
}
