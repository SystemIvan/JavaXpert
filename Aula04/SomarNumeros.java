import java.util.Scanner;

public class SomarNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2, n3, n4, n5, soma;
        System.out.println("Informe o número: ");
        n1 = leitor.nextInt();
        System.out.println("Informe o número: ");
        n2 = leitor.nextInt();
        System.out.println("Informe o número: ");
        n3 = leitor.nextInt();
        System.out.println("Informe o número: ");
        n4 = leitor.nextInt();
        System.out.println("Informe o número: ");
        n5 = leitor.nextInt();
        soma = n1 + n2 + n3 + n4 + n5;
        System.out.println("Soma é " + soma);
    }
}
