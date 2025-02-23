import java.util.Scanner;

public class SomarNumeros2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Diminuir o número de variáveis
        int n, soma = 0;
        System.out.println("Informe o número: ");
        n = leitor.nextInt();
        soma = soma + n;
        System.out.println("Informe o número: ");
        n = leitor.nextInt();
        soma = soma + n;
        System.out.println("Informe o número: ");
        n = leitor.nextInt();
        soma = soma + n;
        System.out.println("Informe o número: ");
        n = leitor.nextInt();
        soma = soma + n;
        System.out.println("Informe o número: ");
        n = leitor.nextInt();
        soma = soma + n;
        System.out.println("Soma é " + soma);
    }
}