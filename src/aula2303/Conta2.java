package aula2303;

// Classe conta mais simples (com valores fixos nos m�todos)
public class Conta2 {

	double saldo = 200.0;
		
	public void depositar() {
		saldo = saldo + 100; 
		System.out.println("Depositando... Seu saldo atual �: " + saldo);
	}
	
	public void sacar() {
		saldo = saldo - 100;
		System.out.println("Sacando... Seu saldo atual �: " + saldo);
	}
	
}