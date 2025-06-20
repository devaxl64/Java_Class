public class M2A15ConversaoDoubleParaFloat {

	public static void main(String[] args) {
		// double (64bits), float (32bits)
		double peso1 = 20.5;
		float peso2 = (float) peso1;
		
		System.out.println("Exemplo double -> float: " + peso2);
		System.out.println("Exemplo double: " + peso1);
		System.out.println();
		
		float taxa1 = 934.5f;
		// double taxa2 = taxa1; // converte automaticamente
		double taxa2 = (double) taxa1;// instrução de casting é opcional
		
		System.out.println("Exemplo float -> double: " + taxa2);
		System.out.println("Exemplo float: " + taxa1);
		
	}
}