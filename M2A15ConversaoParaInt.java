 public class M2A15ConversaoParaInt {
 
	public static void main(String[] args) {
		long x = 10L;
		// int y = x; // não compila
		int y = (int) x;
		
		System.out.println(x);
		System.out.println(y);
		
		long a = 9300000035L;
		int b = (int) a;
		
		System.out.println(a);
		System.out.println(b);
	}
 }