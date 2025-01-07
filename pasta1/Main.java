import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, x, y;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		x = (a + b + Math.abs(a - b)) / 2;
		
		y = (x + c + Math.abs(x - c)) / 2;
		
		System.out.println(y + (" eh o maior"));
	
		
		sc.close();
	}
}
