import java.util.Scanner;

public class SomarXNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Diminuir o número de variáveis
        int soma = 0, contador = 1, qtdNumeros; // É necessário uma variável para sair do loop
        System.out.println("Informe a quantidade de números que deseja somar: ");
        qtdNumeros = leitor.nextInt();
        //while(condição)
        while (contador <= qtdNumeros) {  // quando a variável contador atingir 6 o loop se encerra
            System.out.println("Informe o número " + contador + ":");
            soma = soma + leitor.nextInt(); // É possível colocar o input do usuário direto na operação lógica
            contador++; // contador = contador + 1; | contador + = 1;
        }
        System.out.println("A soma é " + soma);
    }
}
