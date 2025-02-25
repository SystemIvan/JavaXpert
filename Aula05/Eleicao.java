import java.util.Scanner;

public class Eleicao {
    /*
    Em uma cidade haverá uma eleição. Existem 3 candidatos:
    1 – Huguinho
    2 – Zezinho
    3 – Luizinho

    Diversos eleitores votarão; por não sabermos a quantidade a eleição será encerrada
com a digitação de 0(zero) no voto. Implemente as seguintes rotinas neste
programa:
     a)ler os votos, acumular os votos de cada candidato e exibir a apuração.
     b) Caso seja digitado um voto inválido (diferente de 0, 1, 2 e 3) acumular o
        voto como nulo, exibindo a apuração.
     c) Sabendo-se o total de votos, calcular a porcentagem atingida por cada
        candidato e exibir.
     d) Ao finalizar o algoritmo, exibir os candidatos – e as informações
respectivas da apuração

    APURAÇÃO
    1.o –> 2 – Zezinho - 25 votos – 50%
    2.o –> 1 – Huguinho - 20 votos – 40%
    3.o –> 3 – Luizinho - 5 votos – 10%  * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdvotos, zezinho = 0, huguinho = 0, luizinho = 0, nulos = 0, voto;

        do {
            System.out.println(" --ELEIÇÃO--" + "\n URNA ELETRÔNICA" + "\n Escolha o candidato que deseja votar de acordo com os números abaixo: " +
                    "\n 1 – Huguinho" + "\n 2 – Zezinho" + "\n 3 – Luizinho" + "\n 0 - Encerrar eleição");
            voto = input.nextInt();
            switch (voto){
                case 1: huguinho++; break;
                case 2: zezinho++; break;
                case 3: luizinho++; break;
                case 0: System.out.println("\n Eleiçao encerrada!"); break;
                default: nulos++; break;
            }
        }while(voto!= 0);
        qtdvotos = huguinho+zezinho+luizinho+nulos;
        double percentHuguinho = (double) huguinho / qtdvotos * 100, percentZezinho = (double) zezinho /qtdvotos*100;
        double percentLuizinho = (double) luizinho /qtdvotos*100, percentNulos = (double) nulos /qtdvotos*100;

        System.out.println("\n    APURAÇÃO"+
                            "\n 1 - Huguinho - "+ huguinho +" votos - "+ percentHuguinho +"%"+
                            "\n 2 - Zezinho  - "+ zezinho + " votos - "+ percentZezinho +"%"+
                            "\n 3 - Luizinho - "+ luizinho +" votos - "+ percentLuizinho +"%"+
                            "\n # - Nulos    - "+ nulos +   " votos - "+ percentNulos+"%");
    }
}
