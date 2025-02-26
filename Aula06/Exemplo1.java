import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[5];
        double[] notas = {5, 7, 9, 2.5, 4};
        double soma = 0;

        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            vetor[i] = input.nextInt();
        }

        //exibir vetor
        for (i = 0; i < 5; i++) {
            System.out.println((i + 1) + "- número: " + vetor[i]);
        }

        //somar as notas
        for (i = 0; i < 5; i++) {
            soma += notas[i];
        }
        System.out.println("Média das notas é: " + soma / 5);
     /*   System.out.println("vetor: "+ vetor[0]);
        System.out.println("notas: "+ notas[0]);*/
    }
}
