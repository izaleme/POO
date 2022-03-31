package aula3003;

public class Conta {

	private double saldo = 0.0;
	
	public boolean depositar(double valor) {
		if(valor >= 0) {
			saldo += valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean sacar(double valor) {
		if(valor > 0 && valor <= saldo && saldo > 0) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Conta conta) {
		if(sacar(valor)) {
			conta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
}
