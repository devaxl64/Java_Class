public class M2A15ConversaoParaLong {

	public static void main(String[] args) {
		// long (64bits), int (32bits)
		// int cabe no long.
		// faz conversão automática:
		int y = 102344;
		
		// long x = y; // converte automaticamente
		long x = (long) y; // instrução de casting é opcional
		
		System.out.println(y);
		System.out.println(x);
	}
}