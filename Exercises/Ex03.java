import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("O número é negativo!");
        }
        System.out.println("O número é positivo! ");
    }
}
