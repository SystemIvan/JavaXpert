import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        //10 alunos - altura
        double[] altura = new double[10]; /// indice max do vetor é tamanho -1, ex tamanho[6] -> indice max = 5
        double media = 0, soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a altura do " + (i + 1) + " aluno: ");
            altura[i] = input.nextDouble();
            soma += altura[i];
        }
        System.out.println("A média de altura da sala é: " + df.format(media = soma / 10) + "m");
    }
}
