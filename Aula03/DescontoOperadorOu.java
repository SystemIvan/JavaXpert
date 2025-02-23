import java.util.Scanner;

public class DescontoOperadorOu {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);
        //total da compra e o cupom
        double totalCompra, desconto = 0, valorFinal;
        String cupom;
        System.out.println("Informe o valor total da compra: ");
        totalCompra = leitorNum.nextDouble();
        System.out.println("Informe o cupom de desconto: ");
        cupom = leitor.nextLine();
        if (totalCompra >= 1000 || cupom.equalsIgnoreCase("DESCONTO20")) {
            desconto = totalCompra * 0.2;
        }
        valorFinal = totalCompra - desconto;
        System.out.println("\nCUPOM FISCAL" +
                "\nValor da compra: R$ " + totalCompra +
                "\nDesconto: R$ " + desconto +
                "\nValor final: R$ " + valorFinal);
    }
}
