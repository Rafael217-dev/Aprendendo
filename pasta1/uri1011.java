import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int R;
		double pi,VOLUME;
		
		R = sc.nextInt();
		pi = 3.14159;
		
		VOLUME = (4.0/3) * pi * Math.pow(R, 3);
		
		System.out.printf("VOLUME = %.3f\n", VOLUME);
		
		
		sc.close();
	}
}
