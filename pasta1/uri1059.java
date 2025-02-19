import java.util.Scanner;
import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		int i, par;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			/*Para que haja a verificação se o número é par ou não
			 * deve-se fazer i módulo 2 = 0, ou seja, se o valor de i divido por 2
			 * é igual a 0.*/
			}
		}
	}
}
