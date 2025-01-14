import java.util.Locale;
import java.util.Scanner;

/*Bom, esse foi o método que eu encontrei para resolver o problema em questão
 * é bem parecido com o método utilizado no problema 1018, mas esse método
 * não foi aceito pelo beecrowd. Mas irei subir esse código mesmo assim
 * pois mesmo estando errado e o resultado saindo do mesmo jeito que foi
 * pedido no enunciado, essa é a prova de que eu tentei resolver sozinho
 * e essa foi a forma que encontrei de resolver esse problema :D .
 * 
 * O problema desse código é que, como ele depende exclusivamente da
 * precisão do double, então pode ser que tenha algum erro de arredondamento
 * do código em algumas situações específicas. Irei reescrever o código
 * com um outro método onde esse problema de arredondamento será resolvido
 * e irei deixar salvo essas duas versões. Novamente digo, mesmo sabendo
 * que esse código tem um pequeno problema na questão do arredondamento
 * do double, irei upa-lo mesmo assim na plataforma como lembrete de que:
 * Eu errei, mas errei tentando.*/
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double quociente, resto, valor, moeda;
		int cast, nota;
		
		valor = sc.nextDouble();
		
		resto = valor;
		
		System.out.println("NOTAS:");
		
		nota = 100;
		quociente = resto / nota;
		cast = (int) quociente;
		System.out.println(cast + " nota(s) de R$ " + nota + ".00");
		resto = resto % nota;
		
		nota = 50;
		quociente = resto / nota;
		cast = (int) quociente;
		System.out.println(cast + " nota(s) de R$ " + nota + ".00");
		resto = resto % nota;
		
		nota = 20;
		quociente = resto / nota;
		cast = (int) quociente;
		System.out.println(cast + " nota(s) de R$ " + nota + ".00");
		resto = resto % nota;
		
		nota = 10;
		quociente = resto / nota;
		cast = (int) quociente;
		System.out.println(cast + " nota(s) de R$ " + nota + ".00");
		resto = resto % nota;
		
		nota = 5;
		quociente = resto / nota;
		cast = (int) quociente;
		System.out.println(cast + " nota(s) de R$ " + nota + ".00");
		resto = resto % nota;
		
		nota = 2;
		quociente = resto / nota;
		cast = (int) quociente;
		System.out.println(cast + " nota(s) de R$ " + nota + ".00");
		resto = resto % nota;
		
		System.out.println("MOEDAS:");
		moeda = 1.00;
		quociente = resto / moeda;
		cast = (int) quociente;
		System.out.println(cast + " moeda(s) de R$ 1.00");
		resto = resto % moeda;
		
		
		moeda = 0.50;
		quociente = resto / moeda;
		cast = (int) quociente;
		System.out.println(cast + " moeda(s) de R$ 0.50");
		resto = resto % moeda;
		
		
		moeda = 0.25;
		quociente = resto / moeda;
		cast = (int) quociente;
		System.out.println(cast + " moeda(s) de R$ 0.25");
		resto = resto % moeda;
		
		
		moeda = 0.10;
		quociente = resto / moeda;
		cast = (int) quociente;
		System.out.println(cast + " moeda(s) de R$ 0.10");
		resto = resto % moeda;
		
		
		moeda = 0.05;
		quociente = resto / moeda;
		cast = (int) quociente;
		System.out.println(cast + " moeda(s) de R$ 0.05");
		resto = resto % moeda;
		
		
		moeda = 0.01;
		quociente = resto / moeda;
		cast = (int) quociente;
		System.out.println(cast + " moeda(s) de R$ 0.01");
		sc.close();
	}
}
