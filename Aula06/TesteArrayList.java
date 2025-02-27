import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TesteArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        List<String> listaNomes = new ArrayList<>();
        List<Integer> listaNumeros = new ArrayList<>();

        listaNomes.add("Ivan");

        System.out.println("Digite o nome do aluno: ");
        listaNomes.add(input.nextLine());
        System.out.println("Digite o nome do aluno: ");
        listaNomes.add(input.nextLine());
        listaNomes.add(1, "Marcelo");

        System.out.println("\nLista conforme entrada de dados");
        //Percorrendo a lista e exibindo os elementos pelo indice
        //for(inicialização; condição; incremento)
        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println(listaNomes.get(i));
        }

        System.out.println("\nLista Ordenada");
        Collections.sort(listaNomes);
        //foreach(Tipo variavel: lista)
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        System.out.println(listaNomes);

        listaNumeros.add(92);
        listaNumeros.add(1);
        listaNumeros.add(21);
        listaNumeros.add(45);
        listaNumeros.add(32);
        int soma = 0;

        for (Integer i : listaNumeros) {
            soma += i;
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
