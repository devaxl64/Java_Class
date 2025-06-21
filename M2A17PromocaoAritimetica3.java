public class M2A17PromocaoAritimetica3 {

	public static void main(String[] args) {		
		// int (32bits), float (32bits)
		// não ocorre promoção aritimética:
		// int x = 3;
		// int y = 2;
		// float z = x / y;
		// a prioridade é o float por ser um ponto flutuante (número real)
		// o resultado será "1.0" porque está sendo 
		// calculado o valor de duas variáveis do tipo 'int'.
		
		// para ocorrer a promoção aritimética, é necessário que 
		// pelo menos uma das variáveis seja do tipo float: 
		// (ou faça o casting em pelo menos uma das variáveis)
		int x = 3;
		float y = 2;
		float z = x / y;
		
		System.out.println(z);
		
		//
	}
}