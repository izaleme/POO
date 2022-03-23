import java.util.Scanner;

public class TesteProduto extends Produto{

	public static void main(String[] args) {
		String nome;
		String preco;
		String descricao;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);	// Scanner só funciona com Strings
		
		System.out.printf("Digite o nome do produto: ");
		nome = ler.next();
		System.out.printf("Digite o preço do produto: ");
		preco = ler.next();
		double precod = Double.valueOf(preco).doubleValue();	// Convertendo a String para double
		System.out.printf("Digite a descrição do produto: ");
		descricao = ler.next();
		
		System.out.println("\nNome do Produto: " + nome);
		System.out.println("Preço do Produto: " + precod);
		System.out.println("Descrição do Produto: " + descricao);
	}
}
