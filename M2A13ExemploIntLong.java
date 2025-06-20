public class M2A13ExemploIntLong {

	public static void main(String[] args) {
		int limiteInteiro = 2_147_483_647; // (32bits) 2 elevado a 31 - 1
		// int limiteInteiro2 = 2_147_483_648; // não compila
		
		// tem que colocar o 'L' no final para o compilador não interpretar como tipo 'int'
		long limiteLong = 9_223_372_036_854_775_807L; //(64bits) 2 elevado a 63 -1
		// long limiteLong2 = 9_223_372_036_854_775_808L; // não compila
		
		System.out.println(limiteInteiro);
		System.out.println(limiteLong);
		
		// limite do 'int': 2 elevado a 31 - 1 (32bits)
		// O compilador converte numeros inteiros avulsos para 'int' automaticamente:
		System.out.println("Limite valor inteiro: " + 2_147_483_647); // numero avulso (int)
		// System.out.println(2_147_483_648); // não compila. 
	}
}