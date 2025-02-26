import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio {
    //1. Criar um vetor com 6 posições;
    //1. Preencher o vetor;
    //1. Exibam o maior valor
    //1. Média dos valores
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        double[] vetor = new double[6];
        double media = 0, soma = 0, maior = -1;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite o " + (i + 1)+ " valor:");
            vetor[i] = input.nextDouble();
            soma += vetor[i];
        }
        for (int i = 0; i < 6; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println("\nO maior valor é " + maior +
                "\nA média dos valores é: " + df.format(media = soma / 6));
    }
}
