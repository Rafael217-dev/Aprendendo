import java.util.Locale;
import java.util.Scanner;//Importando a classe scanner do pacote java.util do Java para que ela funcione.

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);//Criando a classe scanner para entrada de dados.
		
		double raio, area, n, base, expoente;
		
		n = 3.14159;//Padronizando o valor para n.
		
		base = sc.nextDouble();//Criando variável do tipo double para ser a o número base que será elevado.
		
		expoente = sc.nextDouble();//Criando variável expoente para fazer o cáculo de potência.
		
		raio = Math.pow(base, expoente);//Utilizando o método Math.pow para realizar o cálculo da potência.
		//E atribuindo o resultado desse cálculo a variável raio.
		
		area = n * raio;//Atribuindo o resultado da multiplicação de n * raio para a variável área.
		
		System.out.printf("A= %.4f\n", area);//Mostrando o resultado que a variável área recebeu
		//Com 4 casas após o ponto.
		
		sc.close();//Fechando a classe scanner.
	}

}
		
