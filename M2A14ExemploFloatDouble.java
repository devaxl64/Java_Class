public class M2A13ExemploFloatDouble {

	public static void main(String[] args) {
		
		// O compilador converte numeros reais avulsos para 'double' automaticamente:
		double peso = 66.6d; // 'd' é opcional
		System.out.println("Exemplo double: " + peso);
		
		// float taxa2 = 1_294.93f; // não compila
		float taxa = 1_294.93f; // float tem que ser sinalizado.
		System.out.println("Exemplo float: " + taxa);
	}
}