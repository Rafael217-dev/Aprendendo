import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, n4, media, a, b, c, d, nota_exame, media_final;
		
		n1 = 2.0;
		n2 = 3.0;
		n3 = 4.0;
		n4 = 1.0;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		
		media = (n1 * a + n2 * b + n3 * c + n4 * d) / (n1 + n2 + n3 + n4);
		
		System.out.printf("Media : %.1f%n", media);
		
		if(media >= 7.0) {
			System.out.println("Aluno aprovado.");
		}
		
		else if (media >= 5.0 || media <= 6.9) {
			System.out.println("Aluno em exame.");
			nota_exame = sc.nextDouble();
			
			System.out.printf("Nota do exame: %.1f%n", nota_exame);
			media_final = (media + nota_exame) / 2.0;
			
				if(media_final >= 5.0) {
					System.out.println("Aluno aprovado.");
				}
				
			System.out.printf("Media final: %.1f%n", media_final);
		}
		
		else {
			
			System.out.println("Aluno reprovado.");
		}
		
		sc.close();
	}
}
