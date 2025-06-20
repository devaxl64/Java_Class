public class M2A11OperadorDecremento {

	public static void main(String[] args) {
		int limiteTentativasLogin = 10;
		
		// Pós-fixada:
		// limiteTentativasLogin--;
		// int novoLimiteTentativasLogin = limiteTentativasLogin--;
		
		// Pré-fixada:
		int novoLimiteTentativasLogin = --limiteTentativasLogin;
		
		
		System.out.println("Limites de tentativas de login: " + limiteTentativasLogin);
		System.out.println("Limites de tentativas de login: " + novoLimiteTentativasLogin);
	}
}