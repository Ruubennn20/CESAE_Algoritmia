package FichaPratica02;

import java.util.Scanner;

public class EX_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int posicaoFinal;

        System.out.println("Insera a posicao final: ");
        posicaoFinal = input.nextInt();

        if (posicaoFinal == 1) {
            System.out.println("Ganhou 10 pontos");
        }
        if (posicaoFinal == 2){
            System.out.println("Ganhou 8 pontos");
        }
        if (posicaoFinal == 3){
            System.out.println("Ganhou 6 pontos");
        }
        if (posicaoFinal == 4){
            System.out.println("Ganhou 5 pontos");
        }
        if (posicaoFinal == 5){
            System.out.println("Ganhou 4 pontos");
        }
        if (posicaoFinal == 6){
            System.out.println("Ganhou 3 pontos");
        }
        if (posicaoFinal == 7){
            System.out.println("Ganhou 2 pontos");
        }
        if (posicaoFinal == 8){
            System.out.println("Ganhou 1 pontos");
        }
        if (posicaoFinal >=9){
            System.out.println("Nao Ganhou pontos");
        }


    }
}
