import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int duracao;
		int h_inicial = sc.nextInt();
		int h_final = sc.nextInt();
		
		if (h_inicial < h_final) {
			duracao = h_final - h_inicial;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		else if(h_inicial == h_final) {
			duracao = h_inicial - h_final + 24;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		else {
			duracao = h_final - h_inicial + 24;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		sc.close();
	}
}
