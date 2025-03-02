import java.util.Scanner;

public class CarrinhoCompras {

    public static double somarCarrinho(double[] produtos){
        double soma = 0;
        for(double i : produtos){
            soma += i;
        }
        return soma;
    }
    public static double[] adicionarItens(double[] produtos){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o valor do item: ");
            produtos[i] = input.nextDouble();
        }
        return produtos;
    }

    public static void exibirMenu(){
        System.out.println("LOJINHA");
        System.out.println("1 - Adicionar valor do produto no carrinho ");
        System.out.println("2 - Exibir o total do carrinho");
        System.out.println("3 - Sair");
        System.out.println("Digite a opção desejada: ");
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] valoresItens = new double[5];
        int op;

        do {
            exibirMenu();
            op = input.nextInt();
            switch (op) {
                //adicionar itens no vetor
                case 1:
                    /*for (int i = 0; i < valoresItens.length; i++) {
                        System.out.println("Digite o valor do item: ");
                        valoresItens[i] = input.nextDouble();
                    }*/
                    valoresItens = adicionarItens(valoresItens);
                    break;
                case 2:
                    System.out.println("O total do carrinho é R$ " + somarCarrinho(valoresItens));
                    break;
                case 3:
                    System.out.println("Sistema finalizado!");
                    break;
            }
        }while( op != 3);
    }
}
