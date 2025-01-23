import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, z;
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		int [] numbers = {x, y, z};
		
		Arrays.sort(numbers);
		
		for (int num : numbers) {
			System.out.println(num);
		}
	
		System.out.println("\n" + x + "\n" + y + "\n" + z);
		
		sc.close();
	}
}
