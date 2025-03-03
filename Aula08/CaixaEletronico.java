import java.util.Scanner;

public class CaixaEletronico {
    public static void menu() {
        System.out.println("\n--Bem vindo ao Banco FIAP--");

        System.out.println("\nOperações disponíveis neste caixa:" +
                "\n\n1 - Depósito\t\t2 - Saque" +
                "\n3 - Consultar Saldo\t4 - Sair");
        System.out.println("Opção: ");
    }

    public static double deposit(double saldo){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n-Depósito-");
        System.out.println("Informe o valor a ser depositado: ");
        double valor = leitor.nextDouble();
        return saldo + valor;
    }

    public static double withdraw (double saldo){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n-Saque-");
        System.out.println("Informe o valor a ser sacado: ");
        double valor = leitor.nextDouble();
        if (saldo < valor){
            System.out.println("Você não possui o saldo suficiente para esse saque!");
            return saldo;
        }else{
            return saldo - valor;
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        double saldo = 0, valor;
        do {
            menu();
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    saldo = deposit(saldo);
                    System.out.println("O depósito foi de: R$ " + String.format("%.2f", saldo));
                    break;
                case 2:
                    saldo = withdraw(saldo);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
                    break;
                case 4:
                    System.out.println("Obrigada por utilizar nosso banco!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);
    }
}