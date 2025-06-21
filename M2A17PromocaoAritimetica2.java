public class M2A17PromocaoAritimetica2 {

	public static void main(String[] args) {		
		// float (32bits), long (64bits)
		long x = 10;
		float y = 9.34f;
		// long z2 = x * y; // não compila (só com casting)
		float z = x * y; // a prioridade é o float por ser um ponto flutuante (número real)
		
		System.out.println(z);
	}
}