package aula2303;

// Classe conta mais simples (com valores fixos nos métodos)
public class Conta2 {

	double saldo = 200.0;
		
	public void depositar() {
		saldo = saldo + 100; 
		System.out.println("Depositando... Seu saldo atual é: " + saldo);
	}
	
	public void sacar() {
		saldo = saldo - 100;
		System.out.println("Sacando... Seu saldo atual é: " + saldo);
	}
	
}