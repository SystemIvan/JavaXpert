import java.util.Scanner;

public class SomarComFor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Diminuir o número de variáveis
        int soma = 0; // É necessário uma variável para sair do loop
        //LAÇO CONTADO
        // Quando uma variavel é declarada dentro de um comando, ela só pode ser usada dentro do mesmo
        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("Informe o número " + contador + ":");
            soma += leitor.nextInt(); // É possível colocar o input do usuário direto na operação lógica
        }
        System.out.println("A soma é " + soma);
    }
}
