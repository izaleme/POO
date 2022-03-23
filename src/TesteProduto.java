import java.util.Scanner;

public class TesteProduto extends Produto{

	public static void main(String[] args) {
		String nome;
		String preco;
		String descricao;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);	// Scanner s� funciona com Strings
		
		System.out.printf("Digite o nome do produto: ");
		nome = ler.next();
		System.out.printf("Digite o pre�o do produto: ");
		preco = ler.next();
		double precod = Double.valueOf(preco).doubleValue();	// Convertendo a String para double
		System.out.printf("Digite a descri��o do produto: ");
		descricao = ler.next();
		
		System.out.println("\nNome do Produto: " + nome);
		System.out.println("Pre�o do Produto: " + precod);
		System.out.println("Descri��o do Produto: " + descricao);
	}
}
