public class M2A21FormatandoComPrintf {

    public static void main(String[] args) {
        String nome1 = "Thiago";
        System.out.println("Olá " + nome1);
        System.out.printf("Olá, %s%n", nome1); //%s = string %n - quebra de linha

        int qtd = 48;
        System.out.printf("Quantidade: %d itens%n", qtd);

        double peso = 938.22;
        System.out.printf("Peso %20f%n", peso); // %f = double ou float | %.2f = duas casas decimais | %20f espaço de caracteres para a variável
    }
}