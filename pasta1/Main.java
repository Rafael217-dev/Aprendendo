import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B,C, X, Y, Z, MEDIA;
		
		A = 2.0;
		B = 3.0;
		C= 5.0;
		
		X = sc.nextDouble();
		Y = sc.nextDouble();
		Z = sc.nextDouble();
		
		MEDIA = (X * A + Y * B + Z * C) / (A + B + C);
		
		System.out.printf("MEDIA = %.1f\n ", MEDIA);
		
		sc.close();
	}
}
