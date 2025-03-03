import java.sql.SQLOutput;
import java.util.Scanner;

public class Loja {

    public static String email = ""; // variable global
    public static String senha = "";
    public static String apelido = "";

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

    public static boolean validarLogin(String emailLogin, String senhaLogin) {
        if (emailLogin.equalsIgnoreCase(email) && senhaLogin.equals(senha)) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int opcao;
        do{
            System.out.println("\n---SYSTEM IVAN---");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Efetuar Login ");
            System.out.println("3 - Sair");
            opcao = input.nextInt();
            if (opcao == 1){
                registrarUsuario();
            } else if (opcao == 2) {
                System.out.println("\n---LOGIN---");
                System.out.println("Digite seu email: ");
                String emailDigitado = inputText.nextLine();
                System.out.println("Digite sua senha: ");
                String senhaDigitada = inputText.nextLine();
                if (validarLogin(emailDigitado,senhaDigitada)){
                    System.out.println("\n---Bem vindo ao Sistema do Ivan " + apelido);
                    int opcaoSubMenu = 0;
                    do {
                        subMenu();
                        opcaoSubMenu = input.nextInt();
                        switch (opcaoSubMenu) {
                            case 1:
                                System.out.println("Registrar Produto");
                                break;
                            case 2:
                                System.out.println("Mostrar Produto");
                                break;
                            case 3:
                                System.out.println("Avaliar Produto");
                                break;
                            case 0:
                                System.out.println("Voltando ao Menu Principal...");
                                break;
                        }
                    }while(opcaoSubMenu != 0);
                }else {
                    System.out.println("Usuário e/ou senha inválidos");
                }
            }// opcao 2
            else {
                System.out.println("Obrigado por utilizar nosso sistema!");
            }
        }while(opcao != 3);

    }

    private static void subMenu() {
        System.out.println("\nUsuário logado com Sucesso!!");
        System.out.println("Digite 1 para registrar um produto");
        System.out.println("Digite 2 para mostrar um produto");
        System.out.println("Digite 3 para avaliar um produto");
        System.out.println("Digite 0 para retornar ao menu principal");
        System.out.println("Digite a opção desejada: ");
    }
}
