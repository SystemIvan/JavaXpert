import java.util.Scanner;
public class DecisaoEncadeada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade;

        System.out.println("Por favor, digite sua idade: ");
        idade = leitor.nextInt();
        //Decisão encadeada executa multiplas decisoes encadeadas
        // sintaxe: if (condicao)
        //condicao => variável opRelacional variável/valor
        // resultado => boolean ( V ou F )
        if (idade < 16 )
            System.out.println("Não pode votar!");
        else if (idade >= 18) {
            System.out.println("Você é obrigado a votar!");
        }
        else {
            System.out.println("Você pode votar, mas não é obrigatório :) ");
        }
    }
}
