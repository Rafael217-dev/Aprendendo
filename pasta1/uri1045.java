import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, A, B, C;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		
		if (n1 > n2 && n1 > n3) {/*Testa se o N1 é o maior número. Se 
		sim, ele será atribuído a variavel A. E depois há uma comparação
		para saber qual é o segundo maior número. Se n2 foi maior que n3, então
		ele será atribuido a variavel B por ser o 2º maior numero e n3 para
		a variavel C por ser o menor numero. MAS, se n2 não for maior que n3
		então B recebe o valor da variavel n3 por ser maior que n2. Resumindo
		o maior valor sempre deverá ser o A, esse encadeamento verifica
		e garante isso, o segundo valor sempre deve ser o B. Ou seja, 
		o proximo valor que for maior, independente da variavel que esteja
		sera verificado e passará a pertencer a variavel B. E o menor valor
		sobrara para a variavel C.*/
			A = n1;
			if (n2 > n3) {
				B = n2;
				C = n3;
			}
			else {
				B = n3;
				C = n2;
			}
		}
		else if (n2 > n3) {/*Aqui já é presumido que a primeira condiçao deu false
		ou seja, n1 não era maior que n2 ou n3, o que a descartar como
		maior numero. Então é verificado se n2 é maior que n3, se sim,
		a variavel A passa a receber o valor de n2, e após isso é verificado
		se n1 é maior que n3.*/
			A = n2;
			if (n1 > n3) {/* Se sim, B passa a receber o valor de n1
		sobrando apenas n3 para C.*/
				B = n1;
				C = n3;
			}
			else {/*Se não. Significa que n3 é maior que n2, então, B
			passa a receber o valor de n3, restando apenas n1 para C.*/
				B = n3;
				C = n1;
			}
		}
		else {/*Por fim, após as verificações anteriores, se nem n1, nem n2
		forem maior que n3, logo, A recebera o valor de n3.*/
			A = n3;
			if (n1 > n2) {/*apos A receber o n3 que é o maior valor, é 
			verificado se n1 é maior que n2. Se sim, B passará a receber
			o valor de n1 e C ficara com n2 que seria o menor numero. */
				B = n1;
				C = n2;
			}
			else {/*Se não, significa que n2 é maior que n1 e B passa a receber
			o valor de n2, sobrando apenas n1 para C que é o menor valor.*/
				B = n2;
				C = n1;
			}
		}
		
		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else {
			if (A*A == B*B + C*C) {
				System.out.println("TRIANGULO RETANGULO");
			}
			else if (A*A > B*B + C*C) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			else {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			
			if(A == B && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			else if (A == B || A == C || B == C ) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		
		sc.close();
	}
}
