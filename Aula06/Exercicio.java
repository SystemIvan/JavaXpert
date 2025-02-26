import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio {
    //1. Criar um vetor com qtdNumeros posições;
    //2. Preencher o vetor;
    //3. Exibam o maior valor;
    //4. Média dos valores.

    //CONSTANTE
    public static final int qtdNumeros = 4;

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        double[] vetor = new double[qtdNumeros]; //1. Criar um vetor com qtdNumeros posições;
        double media = 0, soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + " valor:"); //2. Preencher o vetor;
            vetor[i] = input.nextDouble();
            soma += vetor[i];
        }
        double maior = vetor[0];
        for (double v : vetor) {
            if (v > maior) {  //3. Exibam o maior valor;
                maior = v;
            }
        }
        System.out.println("\nO maior valor é " + maior +
                "\nA média dos valores é: " + df.format(media = soma / qtdNumeros)); //4. Média dos valores.
    }
}
