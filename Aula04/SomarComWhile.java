import java.util.Scanner;

public class SomarComWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Diminuir o número de variáveis
        int soma = 0, contador = 1; // É necessário uma variável para sair do loop
        //while(condição)

        //repetir a leitura e soma 5 vezes
        while (contador <= 5) {  // quando a variável contador atingir 6 o loop se encerra
            System.out.println("Informe o número " + contador + ":");
            soma = soma + leitor.nextInt(); // É possível colocar o input do usuário direto na operação lógica
            contador++; // contador = contador + 1; | contador + = 1;
        }
        System.out.println("A soma é " + soma);
    }
}
// Inicialização -> valor inicial da variável de controle
// i = 1

// Condição -> Determinar um limite
// i <= 5

// Incremento -> fazer com que em um determinado momento a minha condição seja falsa
// i++; (incrementando)
// i--; (decrementando)

