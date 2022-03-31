package aulasantigas;

public class TesteProduto2 extends Produto {

	public static void main(String[] args) {
		Produto notebook = new Produto();
		notebook.nome = "Acer";
		notebook.preco = 10000.0;
		notebook.descricao = "Notebook gaymer";
		
		Produto livro = new Produto();
		livro.nome = "Percy Jackson e o Ladrão de Raios";
		livro.preco = 35.0;
		livro.descricao = "Livro infantojuvenil";
		
		System.out.println(notebook.nome);
		System.out.println(livro.nome);
	}
	
}