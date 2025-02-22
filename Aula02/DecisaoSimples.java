import java.util.Scanner;
public class DecisaoSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade;

        System.out.println("Por favor, digite sua idade: ");
        idade = leitor.nextInt();
        //Decisão simples só executa o lado verdadeiro
        // sintaxe: if (condicao)
        //condicao => variável opRelacional variável/valor
        // resultado => boolean ( V ou F )
        if (idade < 16 )
            System.out.println("Não pode votar!");
    }
}
