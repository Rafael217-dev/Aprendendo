import java.util.Scanner;//Importando a classe scanner do pacote java.util do Java para que ela funcione.

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//Criando a classe scanner para entrada de dados.
		
		int A, B, X;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		X = A + B;
		
		System.out.println("X = " + X);
		
		
		sc.close();//Fechando a classe scanner.
	}

}
