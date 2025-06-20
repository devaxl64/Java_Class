public class M2A15ConversaoDoubleParaInt {

	public static void main(String[] args) {
		// double (64bits), int (32bits)
		double largura = 100.37;
		// int tamanho = largura; // não compila
		int tamanho = (int) largura; // faz casting normal, mas perde o decimal
		
		System.out.println(tamanho);
	}
}