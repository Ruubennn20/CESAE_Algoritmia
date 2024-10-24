package FichaPratica05;

import java.util.Scanner;

public class EX_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int soma = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]:");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print(matriz[linha][coluna]+"  ");
            }
            System.out.println();
        }
        for (int i=0 ; i < matriz.length; i++) {
            soma = soma + matriz[i][i];
        }
        System.out.println(soma);
    }

}