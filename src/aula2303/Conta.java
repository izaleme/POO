package aula2303;

public class Conta {

	double saldo = 0.0; // Atributos ficam geralmente no come�o da classe
	
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
		System.out.println("Depositando... Seu saldo atual �: " + saldo);
	}
	
	public void sacar(double valorSaque) {
		saldo -= valorSaque;
		System.out.println("Sacando... Seu saldo atual �: " + saldo);
	}
}
