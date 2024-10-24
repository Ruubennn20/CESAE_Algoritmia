package FichaPratica05;

import java.util.Scanner;

public class EX_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int pergunta, total = 0;

        System.out.print("Insere o numero a pesquisar: ");
        pergunta = input.nextInt();
        System.out.println();

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]:");
                matriz[linha][coluna] = input.nextInt();

            }
        }
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "  ");
            }
            System.out.println();
        }
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if (pergunta == matriz[linha][coluna]) {
                    total++;
                }
            }

        }
        System.out.println("Existe " + total + " posiçoes com o numero " + pergunta);
    }
}