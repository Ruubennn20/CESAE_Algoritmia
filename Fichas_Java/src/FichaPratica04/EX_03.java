package FichaPratica04;

import java.util.Scanner;

public class EX_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jogador1, jogador2, numJogadas = 1;
        System.out.print("Numero jogador 1 até 100: ");
        jogador1 = input.nextInt();
        do {

            System.out.print("Numero jogador 2 até 100: ");
            jogador2 = input.nextInt();

            if (jogador1 != jogador2) {
                numJogadas++;
                if (jogador2 < jogador1) {
                    System.out.println("Incorreto o numero do jogador 2 é menor que o do jogador 1");
                }
                if (jogador2 > jogador1) {
                    System.out.println("Incorreto o numero do jogador 2 é maior que o do jogador 1");
                }
            }
        } while (jogador1 != jogador2);
            System.out.println("Yay Adivinhou, com "+numJogadas+" tentativas");
    }

}
