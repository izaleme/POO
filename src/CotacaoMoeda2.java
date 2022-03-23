public class CotacaoMoeda2 {

	public static void main(String[] args) {
		double real = 1000.0;
		double dollar = 5.0;
		double valorCotacao = real * dollar;
		
		System.out.println("Valor da Cotação: " + valorCotacao);
		
		if(valorCotacao > 1000) {
			valorCotacao = valorCotacao + valorCotacao * 0.2;
			System.out.println("O valor é maior que 1000. Novo valor: " + valorCotacao);
		} else {
			System.out.println("O valor é menor que 1000");
		}
	}
}