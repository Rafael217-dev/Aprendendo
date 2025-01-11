import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int dias_vivo, anos, meses, dias, sobra;
		
		dias_vivo = sc.nextInt();
		
		sobra = dias_vivo;
		
		anos = dias_vivo / 365;
		sobra = dias_vivo % 365;
		meses = sobra / 30;
		dias = sobra % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		sc.close();
	}
}
