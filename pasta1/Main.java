import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, X, Y, MEDIA;
		
		A = 3.5;
		B = 7.5;
		
		X = sc.nextDouble();
		Y = sc.nextDouble();
		
		MEDIA = (X * A + Y * B) / (A + B);
		
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		
		sc.close();
	}
}
