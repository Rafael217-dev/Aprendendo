import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4, media, nota_exame, media_final;
		
		
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		n4 = sc.nextFloat();
		
		media = (n1 * 2f + n2 * 3f + n3 * 4f + n4 * 1f) / 10f;
		
		System.out.printf("Media : %.1f%n", media);
		
		if(media >= 7f) {
			System.out.println("Aluno aprovado.");
		}
		
		else if (media >= 5f && media <= 6.9f) {
			System.out.println("Aluno em exame.");
			nota_exame = sc.nextFloat();
			
			System.out.printf("Nota do exame: %.1f%n", nota_exame);
			media_final = (media + nota_exame) / 2f;
			
				if(media_final >= 5f) {
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
