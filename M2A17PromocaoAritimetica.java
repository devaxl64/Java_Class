public class M2A17PromocaoAritimetica {

	public static void main(String[] args) {
		int x = 10;
		long y = 5;
		// o resultado sempre é convertido para a variável com maior capacidade de armazenamento:
		// int z2 = x * y; // não compila (Só se fizer um casting)
		long z = x * y; // tem que ser long (64bits)
		
		System.out.println(z);
	}
}