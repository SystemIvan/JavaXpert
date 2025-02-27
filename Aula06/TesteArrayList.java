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

        //Percorrendo a lista e exibindo os elementos pelo indice
        for (int i = 0; i < listaNomes.size(); i++){
            System.out.println(listaNomes.get(i));
        }
        //for(inicialização; condição; incremento)
        //foreach(Tipo variavel: lista)
        for (String nome : listaNomes){
            System.out.println(nome);
        }




        System.out.println(listaNomes);




    }
}
