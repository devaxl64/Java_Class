public class M2A12ByteShort {

	public static void main(String[] args) {
		byte quantidadeEstoque = 127; // limite byte: 127 (2 elevado a 7 -1)
		// byte quantidadeEstoque = 128; // não compila
		
		short quantidadeEstoque2 = 32767; // limite short: 32767 (2 elevado a 15 -1)
		// short quantidadeEstoque = 32768; // não compila
		
		System.out.println("Limite byte: " + quantidadeEstoque);
		System.out.println("Limite short: " + quantidadeEstoque2);
	}
}