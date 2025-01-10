import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Reais, Resto, Quociente, Nota;
		
		Reais = sc.nextInt();
		System.out.println(Reais);
		
		Resto = Reais;
		
		Nota = 100;
		Quociente = Resto / Nota; 
		System.out.println(Quociente + " nota(s) de R$ " + Nota + ",00");
		Resto = Resto % Nota;
		
		Nota = 50;
		Quociente = Resto / Nota;
		System.out.println(Quociente + " nota(s) de R$ " + Nota + ",00");
		Resto = Resto % Nota;
		
		Nota = 20;
		Quociente = Resto / Nota;
		System.out.println(Quociente + " nota(s) de R$ " + Nota + ",00");
		Resto = Resto % Nota;
		
		Nota = 10;
		Quociente = Resto / Nota;
		System.out.println(Quociente + " nota(s) de R$ " + Nota + ",00");
		Resto = Resto % Nota;
		
		Nota = 5;
		Quociente = Resto / Nota;
		System.out.println(Quociente + " nota(s) de R$ " + Nota + ",00");
		Resto = Resto % Nota;
		
		Nota = 2;
		Quociente = Resto / Nota;
		System.out.println(Quociente + " nota(s) de R$ " + Nota + ",00");
		Resto = Resto % Nota;
		
		Nota = 1;
		Quociente = Resto / Nota;
		System.out.println(Quociente + " nota(s) de R$ " + Nota + ",00");
		Resto = Resto % Nota;
		
		sc.close();
	}
}
