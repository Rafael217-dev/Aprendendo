import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String palavra1, palavra2, palavra3;
		palavra1 = sc.nextLine();
		palavra2 = sc.nextLine();
		palavra3 = sc.nextLine();
		
		/*O método equals é um método em java, herdado da classe Object (classe base 
		 * para todos os objetos) para comparar se duas refêrencias apontam para o mesmo objeto
		 * na memória. O modo que ele funciona é parecido com o == que também verifica se 2 referencias
		 * apontam para o mesmo objeto. MAS, o equals verifica também o conteudo dos objetos, sendo um
		 * comparador mais completo.
		 * 
		 * equals é o método que usamos para definir a igualdade de conteúdo entre objetos.
		   == compara referências (ou seja, se os objetos são exatamente o mesmo em memória) 
		   enquanto equals (quando bem implementado) compara os valores internos.
		   A peculiaridade do equals é que ele pode (e deve, quando necessário) ser sobrescrito para adaptar 
		   a comparação de igualdade ao que faz sentido para a sua classe.
		 * */
		
		
		//Verificação dos animais vertebrados.
		//Verificação das aves.
		if (palavra1.equals("vertebrado")) {
			if (palavra2.equals("ave")) {
				if (palavra3.equals("carnivoro")) {
					System.out.println("aguia");
				}
				else if (palavra3.equals("onivoro")) {
					System.out.println("pomba");
					}
				}
		//Verificação dos mamíferos.
			else if (palavra2.equals("mamifero"))  {
					if (palavra3.equals("onivoro")) {
						System.out.println("homem");
					
				}
					else if (palavra3.equals("herbivoro")) {
							System.out.println("vaca");
				}
			}
			
			
			
		//Verificação dos animais invertebrados.
		//Verificação dos insetos.
		}
		else if (palavra1.equals("invertebrado")) {
				if (palavra2.equals("inseto")) {
					if (palavra3.equals("hematofago")) {
						System.out.println("pulga");
				}
				else if (palavra3.equals("herbivoro")) {
						System.out.println("lagarta");
				}
			}
			
		//Verificação dos anelideos.		
		else if (palavra2.equals("anelideo")) {
				if (palavra3.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
				else if (palavra3.equals("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}
	
		sc.close();
	}
}
