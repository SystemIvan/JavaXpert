import java.util.Scanner;
public class Comparacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "Ivan Gomes";
        String seuNome;

        System.out.println("Informe seu nome: ");
        seuNome = leitor.nextLine();

        if (nome.equals(seuNome))
            System.out.println("Homonimos");
        else
            System.out.println("Nomes diferentes");
    }
}
