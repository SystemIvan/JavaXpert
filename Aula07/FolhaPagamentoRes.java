import java.util.Scanner;

public class FolhaPagamentoRes {

    public static double standardHour(double valorHora) {
        Scanner leitorNumeros = new Scanner(System.in);
        int quantidade;
        System.out.println("PetShop FIAP\n\nDigite a quantidade de horas trabalhadas: ");
        quantidade = leitorNumeros.nextInt();
        return valorHora * quantidade;
    }

    public static double extraHourWeek(double valorHora) {
        Scanner leitorNumeros = new Scanner(System.in);
        double quantidadeHorasExtras;
        System.out.println("Digite a quantidade de horas extras realizadas exceto domingos e feriados: ");
        quantidadeHorasExtras = leitorNumeros.nextDouble();
        //int x = Integer.parseInt("10");
        // (valorHora + 50% de 18) x QuantidadeHorasExtras
        return ((valorHora * 0.5) + valorHora) * quantidadeHorasExtras;

    }

    public static double extraHourWeekend(double valorHora) {
        Scanner leitorNumeros = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas extras realizadas em domingos e feriados: ");
        double quantidadeHorasExtras = leitorNumeros.nextDouble();
        return valorHora * 2 * quantidadeHorasExtras;

    }

    public static double discountINSS(double salarioFinal) {
        double descontoINSS = 0;
        if (salarioFinal <= 1302) {
            //7,5%
            descontoINSS = salarioFinal * 0.075;
        } else if (salarioFinal > 1302 && salarioFinal <= 2571.29) {
            //9%
            descontoINSS = salarioFinal * 0.09;
        } else if (salarioFinal <= 3856.94) {
            //12%
            descontoINSS = salarioFinal * 0.12;
        } else if (salarioFinal <= 7507.79) {
            //14%
            descontoINSS = salarioFinal * 0.14;
        } else {
            //877,24
            descontoINSS = 877.24;
        }
        return salarioFinal -= descontoINSS;
    }

    public static void main(String[] args) {
        Scanner leitorTexto = new Scanner(System.in);
        double valorHora = 18;
        double valorHoraExtraDomingo = 0;

        double salario = standardHour(valorHora);

        double valorHorasExtras = extraHourWeek(valorHora);

        System.out.println("Realizou horas extras de domingo ou feriado? ");
        String resposta = leitorTexto.nextLine();

        if (resposta.equalsIgnoreCase("Sim") || resposta.equals("s")) {
            valorHoraExtraDomingo = extraHourWeekend(valorHora);
        }

        double salarioFinal = salario + valorHorasExtras + valorHoraExtraDomingo;

        salarioFinal = discountINSS(salarioFinal);

        System.out.println("Salario Bruto: " + salario + "\nHoras Extra: " + valorHorasExtras + "\nHoras Extra 100%: " + valorHoraExtraDomingo +
                "\nSalario Final: " + salarioFinal);

    }
}
