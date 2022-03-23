
public class TesteProdutoVetor extends Produto {

	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		Produto carro = new Produto();
		Produto caneta = new Produto();
		
		double valorTotal = 0;
		carro.preco = 10.0;
		caneta.preco = 20.0;
		
		Produto[] produtos = new Produto[2];
		produtos[0] = carro;
		produtos[1] = caneta;
		
		for (int i = 0; i < produtos.length; i++) {
			valorTotal += produtos[i].preco;
		}
		
		System.out.println(valorTotal);
	}
}
