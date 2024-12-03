package FichaPratica05;

import java.util.Scanner;

public class EX_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int menor, maior;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]:");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
        menor = matriz[0][0];
        maior = matriz[0][0];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (matriz[linha][coluna] < menor) {
                    menor = matriz[linha][coluna];
                }
                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }
            }
        }
        System.out.println("O menor numero da matriz é: " + menor);
        System.out.println("O maior numero da matriz é: " + maior);
    }
}
