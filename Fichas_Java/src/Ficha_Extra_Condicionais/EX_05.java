package Ficha_Extra_Condicionais;

import java.util.Scanner;

public class EX_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroJogo = 60, numJogador2;

        System.out.print("Adivinhe o número: ");
        numJogador2 = input.nextInt();

        if (numJogador2 == numeroJogo) {
            System.out.println("Parabens Ganhaste o Jogo");
        } else if (numJogador2 > numeroJogo) {
            System.out.println("Muito Alto");
        } else {
            System.out.println("Muito Baixo");

            if (numJogador2 != numeroJogo) {
                System.out.print("Adivinhe o número: ");
                numJogador2 = input.nextInt();
            }

            if (numJogador2 == numeroJogo) {
                System.out.println("Parabens Ganhaste o Jogo");
            } else if (numJogador2 > numeroJogo) {
                System.out.println("Muito Alto");
            } else {
                System.out.println("Muito Baixo");
                System.out.println("Ficaste sem tentativas");
            }
        }
    }
}