import java.util.Scanner;

public class Rodizio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //solicite a placa do carro EXH-8694
        //VERIFIQUEM E INFORME O DIA DO RODIZIO
        // 1-2: SEGUNDA | 3-4: TERÇA | 5-6: QUARTA | 7-8: QUINTA | 9-0: SEXTA
        int placa;
        System.out.println("Digite os números da placa do seu automóvel:");
        placa = leitor.nextInt();

        switch (placa % 10) {
            case 1:
            case 2:
                System.out.println("Seu rodizio é Segunda-feira!");
                break;
            case 3:
            case 4:
                System.out.println("Seu rodizio é Terça-feira!");
                break;
            case 5:
            case 6:
                System.out.println("Seu rodizio é Quarta-feira!");
                break;
            case 7:
            case 8:
                System.out.println("Seu rodizio é Quinta-feira!");
                break;
            case 9:
            case 0:
                System.out.println("Seu rodizio é Sexta-feira!");
                break;
        }
    }
}
