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
		
		double n;
		int nota, quociente, resto, moeda;
		
		n = sc.nextDouble();
		
		//Explicação do professor abaixo:
		
		// Vamos multiplicar N por 100 e forçar a conversão para int.
		// Desse modo, por exemplo, 576.73 vai se tornar 57673

		// Vamos tambem somar 0.5 antes de converter, para assegurar 
		// que o numero seja devidamente arredondado, pois o tipo double
		// as vezes da problema de arredondamento (por exemplo: se digitarmos
		// 576.81 e multiplicarmos por 100, o resultado sera 57680.99999999,
		// dai o casting resultaria em 57680 e nao 57681 como desejado)
		
		/*Como funciona o arredondamento?? 
		 *Da seguinte forma: se o valor da parte fracionária for menor
		 *que 5, então o arredondamento será feito para baixo. Se o valor
		 *da parte fracionária for igual ou maior que 5, então
		 *o arredondamento do valor será feito para cima. Exemplos:
		 *N = 5.7 + 0.5 = 6.2 - Como a parte fracionária desse número é
		 *0.7 ou seja, maior que 5, o resultado seria para cima,
		 *arredondando o valor para 6
		 *N = 5.4 + 0.5 = 5.9 - Como o valor da parte fracionária é 0.4
		 *ou seja, menor que 5, o valor será arredondado para baixo
		 *ou seja, 5.*/
		
		resto = (int)(n * 100.0 + 0.5);
		
		System.out.println("NOTAS:");
		/*Os cálculos para notas em quociente são o resultado de resto
		 *dividido por nota * 100. Por que?? Porque o valor de n que é
		 *uma entrada em double é convertido para um número inteiro
		 *esse valor inteiro é a representação do valor total em moedas
		 *então, é necessário multiplicar o valor da nota * 100.
		 *Por que multiplicar por 100?
		 *O multiplicador 100 foi necessário porque:
		 *O valor inicial foi convertido para centavos no início para evitar problemas 
		 *de precisão ao lidar com casas decimais.
		 *Como as variáveis nota e moeda representam valores em reais, elas precisam ser 
		 *multiplicadas por 100 para se alinharem com o formato do cálculo, que está 
		 *em centavos.*/

		nota = 100;
		quociente = resto /(nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		nota = 50;
		quociente = resto /(nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		nota = 20;
		quociente = resto /(nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		nota = 10;
		quociente = resto /(nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		nota = 5;
		quociente = resto /(nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		nota = 2;
		quociente = resto /(nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);
		
		System.out.println("MOEDAS:");
		
		moeda = 100;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 1.00");
		resto = resto % moeda;
		
		moeda = 50;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.50");
		resto = resto % moeda;
		
		moeda = 25;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.25");
		resto = resto % moeda;
		
		moeda = 10;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.10");
		resto = resto % moeda;
		
		moeda = 5;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.05");
		resto = resto % moeda;
		
		moeda = 1;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.01");
		resto = resto % moeda;
	}
}
