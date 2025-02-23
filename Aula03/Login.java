import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // user = admin - password = admin123
        // ordem: ! - && - ||
        String user, password;
        System.out.println("Informe seu usuário: ");
        user = leitor.nextLine();
        System.out.println("Informe sua senha: ");
        password = leitor.nextLine();

        if(user.equalsIgnoreCase("admin") && password.equals("admin123")){
            System.out.println(user + ", Seja bem vindo ao sistema!");
        }
        else {
            System.out.println("Usuário e/ou senha incorretos, por favor digitar novamente.");
        }
    }
}
