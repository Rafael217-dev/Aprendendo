import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempo_viagem, vel_media;
		double litros;
		
		tempo_viagem = sc.nextInt();
		vel_media = sc.nextInt();
		
		litros = tempo_viagem * vel_media / 12.0;
		/*Como tempo_viagem e vel_media são valores do tipo INT, quando coloquei para dividir por 12
		 * os valores estavam sendo arredondados. Para resolver essa problema é necessário transformar
		 * pelo menos um dos valores em valor real, por isso o número divisor que seria 12 se torna
		 * 12.0 e isso acaba resultando o valor real da expressão. Esse método se chama promoção de tipo
		 * e por double ser mais forte e abrangente que o int, já que trabalha com casas decimais, o 
		 * Java automaticamente muda o resultado da expressão para double para evitar perda de dados.*/
		System.out.printf("%.3f%n", litros);
		
		
		sc.close();
	}
}
