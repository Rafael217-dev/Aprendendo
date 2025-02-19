import java.util.Scanner;
import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double v1,v2,v3,v4,v5,v6, positivo, n;
		
		v1 = sc.nextDouble();
		v2 = sc.nextDouble();
		v3 = sc.nextDouble();
		v4 = sc.nextDouble();
		v5 = sc.nextDouble();
		v6 = sc.nextDouble();
		
		positivo = 0;
		
		if (v1 > 0) {
			positivo ++;
		}
		if (v2 > 0) {
			positivo ++;
		}
		if (v3 > 0 ) {
			positivo ++;
		}
		if (v4 > 0 ) {
			positivo ++;
		}
		if (v5 > 0 ) {
			positivo ++;
		}
		if (v6 > 0 ) {
			positivo ++;
		}
		
		n = positivo;
		
		System.out.printf("%.0f valores positivos%n", n);
		
		
		
		sc.close();
	}
}
