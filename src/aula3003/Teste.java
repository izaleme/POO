package aula3003;

public class Teste {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		Conta conta2 = new Conta();
		
		conta.depositar(1000);
		conta.transferir(600, conta2);
		
		System.out.println("Saldo da conta 1: " + conta.getSaldo());
		System.out.println("Saldo da conta 2: " + conta2.getSaldo());
	}
}