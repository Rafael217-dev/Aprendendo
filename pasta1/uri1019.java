import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, horas, minutos, segundos, resto;
		
		N = sc.nextInt();
		
		horas = N / 3600;//3600 é a quantidade de segundos em 1 hora.
		resto = N % 3600;
		
		minutos = resto / 60;//60 é a quantidade de segundos em 1 minutos.
		segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
	}
}
