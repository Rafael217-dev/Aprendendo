import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*De certo modo em um mundo ideal, essa forma de resolver o problema que eu encontrei estaria correto, afinal, o double oferece mais precisão
  		e confiabilidade, porém, em contrapartida, deixa o código mais pesado, por ser 64bits, enquanto float é apenas 32bits. A única coisa que esse
    		código diferiu do outro, foi a diferença de precisão, onde o double arrendodava para 4.9 e o float arredondava para 4.8. O problema pedia
      		que o resultado desse 4.8, então eu olhei a maneira que professor fez e fui entendendo aos poucos. Mas fique de aprendizado.*/
		double n1, n2, n3, n4, media, a, b, c, d, nota_exame, media_final;
		
		n1 = 2.0;		
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
		
		else if (media >= 5.0 && media <= 6.9) {
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
