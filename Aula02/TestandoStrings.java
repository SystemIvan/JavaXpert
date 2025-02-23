import java.util.Scanner;
public class TestandoStrings {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "Teste";
        String seuNome;

        System.out.println("Digite o que você deseja comparar: ");
        seuNome = leitor.nextLine();

        if (nome.equals(seuNome))
            System.out.println("São iguais!");
        else if (nome.equalsIgnoreCase(seuNome)){
            System.out.println("São iguais, independentemente se são maiusculas ou minisculas");
        } else {
            System.out.println("Não são iguais!");
        }

        if (seuNome.contentEquals("F")) {
            System.out.println("O Char é correspondente!");
        }

        String nomeJedi1 = "Luke Skywalker";
        System.out.println("Resultado do 1º teste com o .equals:");
        System.out.println(nomeJedi1.equals("Luke SKYWALKER"));
        System.out.println("Resultado do 2º teste com o .equals:");
        System.out.println(nomeJedi1.equals("Luke Skywalker"));
        System.out.println("Resultado do 1º teste com o .equalsIgnoreCase:");
        System.out.println(nomeJedi1.equalsIgnoreCase("Luke SKYWALKER"));
        System.out.println("Resultado do 2º teste com o .equalsIgnoreCase:");
        System.out.println(nomeJedi1.equalsIgnoreCase("Luke Skywalker"));
        System.out.println("Resultado do 1º teste com o .contentEquals:");
        System.out.println(nomeJedi1.contentEquals("Luke SKYWALKER"));
        System.out.println("Resultado do 2º teste com o .contentEquals:");
        System.out.println(nomeJedi1.contentEquals("Luke Skywalker"));


    }
}
