package aula3003;

public class Conta {

	private double saldo = 0.0;
	
	public boolean depositar(double valor) {
		if(valor >= 0) {
			setSaldo(getSaldo() + valor);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean sacar(double valor) {
		if(valor > 0 && valor <= getSaldo() && getSaldo() > 0) {
			setSaldo(getSaldo() - valor);
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

	// Setando o getter e setter da variável private saldo para conseguir usar na classe teste
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
