package aulasantigas;

public class CotacaoCondicao {

	public static void main(String[] args) {
		
		double real = 100.0;
		double dollar = 5.0;
		double valorCotacao = real * dollar;
		
		while(valorCotacao <= 3000) {
			System.out.println("Entrou no While!!");
			dollar = dollar - 0.5;
			valorCotacao = real/dollar;
			break;
		}
		
		System.out.println("O novo valor em doletas é: " + dollar);
		
		for(int i=0; i<100; i++) {
			valorCotacao = real / dollar;
			if(valorCotacao > 3000) {
				break;
			}
			dollar -= 0.5;
		}
		
		System.out.println("O novo valor em doletas é: " + dollar);
		
	}
}