import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4, media, nota_exame, media_final;

		/*Esse aqui é o jeito correto de resolver o problema. A real é que as únicas diferenças de um para o outro é o uso do float, ao invés do double
  		o que torna esse código um pouco mais leve que o outro, porém, menos preciso em suas contas matemáticas. Então, a dica é: Se precisa de uma
    		api que não exija tanto uma precisão muito detalhada e precisa ser otimizada em questão de memória, como sistemas embarcados ou dispositivos
      		com baixa capacidade, Float é a melhor opção. Agora, se você vai mexer com bancos, cálculos sensíveis, ciências e etc, o Duble é a melhor opção
		mais pesado?? Sim, porém mais preciso e confiável.*/
		
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
