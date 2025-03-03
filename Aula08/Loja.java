import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {

    public static String email = ""; // variable global
    public static String senha = "";
    public static String apelido = "";

    public static List<String> listaProdutos = new ArrayList<>();

    public static void registrarProduto() {
        Scanner inputText = new Scanner(System.in);
        System.out.println("Digite o nome do produto que deseja registrar: ");
        String nomeProduto = inputText.nextLine();
        listaProdutos.add(nomeProduto);
        System.out.println("O produto " + nomeProduto + " foi registrado com sucesso! ");

    }

    public static String mostrarProdutos() {
        String mensagem = "\nProdutos: \n";
        for (String produto : listaProdutos){
            mensagem += produto + "\n";
        }
        return mensagem;
    }

    public static void registrarUsuario() {
        String nome, telefone;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite seu telefone: ");
        telefone = input.nextLine();
        System.out.println("Digite seu email: ");
        email = input.nextLine();
        System.out.println("Digite seu senha: ");
        senha = input.nextLine();
        System.out.println("Digite seu apelido: ");
        apelido = input.nextLine();
    }

    private static void subMenu() {
        System.out.println("\nUsuário logado com Sucesso!!");
        System.out.println("Digite 1 para registrar um produto");
        System.out.println("Digite 2 para mostrar produtos");
        System.out.println("Digite 3 para avaliar um produto");
        System.out.println("Digite 0 para retornar ao menu principal");
        System.out.println("Digite a opção desejada: ");
    }


    public static boolean validarLogin(String emailLogin, String senhaLogin) {
        return emailLogin.equalsIgnoreCase(email) && senhaLogin.equals(senha);
    }

    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n---SYSTEM IVAN---");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Efetuar Login ");
            System.out.println("3 - Sair");
            opcao = input.nextInt();
            if (opcao == 1) {
                registrarUsuario();
            } else if (opcao == 2) {
                System.out.println("\n---LOGIN---");
                System.out.println("Digite seu email: ");
                String emailDigitado = inputText.nextLine();
                System.out.println("Digite sua senha: ");
                String senhaDigitada = inputText.nextLine();
                if (validarLogin(emailDigitado, senhaDigitada)) {
                    System.out.println("\n---Bem vindo ao Sistema do Ivan " + apelido);
                    int opcaoSubMenu;
                    do {
                        subMenu();
                        opcaoSubMenu = input.nextInt();
                        switch (opcaoSubMenu) {
                            case 1:
                                registrarProduto();
                                break;
                            case 2:
                                System.out.println(mostrarProdutos());
                                break;
                            case 3:
                                System.out.println("Avaliar Produto");
                                break;
                            case 0:
                                System.out.println("Voltando ao Menu Principal...");
                                break;
                        }
                    } while (opcaoSubMenu != 0);
                } else {
                    System.out.println("Usuário e/ou senha inválidos");
                }
            }// opcao 2
            else {
                System.out.println("Obrigado por utilizar nosso sistema!");
            }
        } while (opcao != 3);

    }
}