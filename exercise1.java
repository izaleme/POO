package aula2;

public class exercise1 {

	public static void main(String[] args) {
		
		double gasolina = 3.79;
		double alcool = 2.74;
		double valor = gasolina * 0.77;
		
		if(valor > alcool) {
			System.out.println("�lcool � mais barato");
		} else {
			System.out.println("Gasolina � mais barata");
		}
	}
}
