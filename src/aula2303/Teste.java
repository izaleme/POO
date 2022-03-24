package aula2303;

public class Teste {

	public static void main(String[] args) {
		
		Conta conta = new Conta(); // Referenciando o objeto Conta na variável conta
		// Referenciamos uma variável para conseguir chamar seus atributos e métodos
		
		conta.saldo = 100;
		conta.depositar(3);
		conta.sacar(2);
		
	}
}
