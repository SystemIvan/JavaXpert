import java.util.Scanner;

public class CalculadoraMenuSwitch {
    public static void main(String[] args) {
        int valor1;
        int valor2, opcaoMenu;
        int soma, subtracao, multiplicacao;
        double divisao;
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n CALCULADORA");
        System.out.println("Esse programa vai somar, subtrair, multiplicar e dividir os valores que você digitar!");
        System.out.println("\nDigite o primeiro valor que deseja calcular:");
        valor1 = leitor.nextInt();
        System.out.println("Digite o segundo valor que deseja calcular:");
        valor2 = leitor.nextInt();

        System.out.println("OPÇÕES DO MENU: " +
                "\n1 - Soma" +
                "\n2 - Subtração" +
                "\n3 - Multiplicação" +
                "\n4 - Divisão" +
                "\nDigite a opção desejada.");
        opcaoMenu = leitor.nextInt();

        //Calculos -> Processamento

        switch (opcaoMenu){
            case 1:
                soma = valor1 + valor2;
                System.out.println("A soma entre os dois valores foi de: " + soma);
                break;
            case 2:
                subtracao = valor1 - valor2;
                System.out.println("A subtracao entre os dois valores foi de: " + subtracao);
                break;
            case 3:
                multiplicacao = valor1 * valor2;
                System.out.println("A multiplicacao entre os dois valores foi de: " + multiplicacao);
                break;
            case 4:
                if (valor2 == 0) {
                    System.out.println("Não é possível dividir por 0!");
                } else {
                    divisao = valor1 / (double) valor2;
                    if (divisao % 1 == 0) {
                        System.out.println("A divisao entre os dois valores foi de: " + (int) divisao);
                    } else {
                        System.out.println("A divisao entre os dois valores foi de: " + divisao);
                    }
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
