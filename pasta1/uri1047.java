import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int h_inicial, h_final, h_duracao, m_inicial, m_final, m_duracao;
		h_inicial = sc.nextInt();
		m_inicial = sc.nextInt();
		h_final = sc.nextInt();
		m_final = sc.nextInt();
		
		
		if (h_inicial > h_final) {
			h_duracao = h_final - h_inicial + 24;
			
		}
		else {
			h_duracao = h_final - h_inicial;
		}
		
		if (m_inicial > m_final) {
			h_duracao -= 1;
			m_duracao = m_final - m_inicial + 60;
		}
		else {
			m_duracao = m_final - m_inicial;
		}
		
		if(h_duracao <0) {
			h_duracao = 23;
		}
		
		if (h_inicial == h_final && m_inicial == m_final) {
			h_duracao = h_inicial - h_final + 24;
			m_duracao = m_inicial - m_final;
		}
		
		System.out.println("O JOGO DUROU " + h_duracao + " HORA(S) E " + m_duracao + " MINUTO(S)");
			
		sc.close();
	}
}
