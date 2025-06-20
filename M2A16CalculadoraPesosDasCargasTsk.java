public class M2A16CalculadoraPesosDasCargasTsk {

	public static void main(String[] args) {
		double pesoCarga1 = 1033.49;
		double pesoCarga2 = 849.88;
		
		// fórumla sugerida:
		// int pesoTotalCargas = (int) pesoCarga1 + (int) pesoCarga2; // deu 1882
		// System.out.println("Peso total das cargas: " + pesoTotalCargas);
		
		// a atividade pede o resultado no valor: 1883.
		
		// solução:
		double pesoTotalCargas = pesoCarga1 + pesoCarga2;
		System.out.println("Peso total das cargas: " + (int) pesoTotalCargas);
	}
}