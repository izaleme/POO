package aula2303;

public class Teste {

	public static void main(String[] args) {
		
		Conta conta = new Conta(); // Referenciando o objeto Conta na vari�vel conta
		// Referenciamos uma vari�vel para conseguir chamar seus atributos e m�todos
		
		conta.saldo = 100;
		conta.depositar(3);
		conta.sacar(2);
		
	}
}
