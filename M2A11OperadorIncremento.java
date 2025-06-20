public class M2A11OperadorIncremento {

	public static void main(String[] args) {
		int totalDownloads = 10;
		
		// totalDownloads = totalDownloads + 1;
		// totalDownloads += 1;
		
		// Pós-fixada:
		// totalDownloads++;
		// int novoTotalDownloads = totalDownloads++;
		// Pré-fixada:
		int novoTotalDownloads = ++totalDownloads;
		
		
		System.out.println("Total de downloads: " + totalDownloads);
		System.out.println("Novo total de downloads: " + novoTotalDownloads);
	}
}
