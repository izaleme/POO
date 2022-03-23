public class Vetor {

	public static void main(String[] args) {
		double[] valorMoedas = {5.01,4.03};
		double valorReal = 1000.0;
		
		for(int i = 0; i < 2; i++) {
			double resultado = valorMoedas[i] * valorReal;
			System.out.println("Resultado: " + resultado);
		}
	}
}
