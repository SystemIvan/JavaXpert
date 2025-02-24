import java.util.Scanner;

public class WhileString {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorText = new Scanner(System.in);
        // Diminuir o número de variáveis
        int soma, contador, qtdNumeros; // É necessário uma variável para sair do loop
        String continuar = "S";

        // continuar.equalsIgnoreCase("S") || continuar.equal("sim") || continuar.equals("yes")
        while ( continuar.equalsIgnoreCase("S")) {
            soma = 0;
            contador = 1;
            System.out.println("Informe a quantidade de números que deseja somar: ");
            qtdNumeros = leitor.nextInt();
            //while(condição)
            while (contador <= qtdNumeros) {  // quando a variável contador atingir 6 o loop se encerra
                System.out.println("Informe o número " + contador + ":");
                soma = soma + leitor.nextInt(); // É possível colocar o input do usuário direto na operação lógica
                contador++; // contador = contador + 1; | contador + = 1;
            }
            System.out.println("A soma é " + soma);
            System.out.println("A média é " + soma / qtdNumeros);
            System.out.println("Deseja realizar outra soma? [S] - Sim || [N] - Não");
            continuar = leitorText.nextLine(); // LEITURA DETERMINA A MUDANÇA  DA CONDIÇÃO
        }
    }
}
