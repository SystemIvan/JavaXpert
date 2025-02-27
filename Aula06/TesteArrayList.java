import java.util.ArrayList;
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

        System.out.println(listaNomes);




    }
}
