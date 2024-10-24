package FichaPratica05;

import java.util.Scanner;

public class EX_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[][] matriz = new int[10][2];

        // Ler array2
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Insira no array1 [" + i + "]: ");
            array1[i] = input.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Insira no array2 [" + i + "]: ");
            array2[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            matriz[i][0] = array1[i];
            matriz[i][1] = array2[i];
        }
        
        System.out.println("\nMatriz 10x2 gerada:");
        for (int i = 0; i < 10; i++) {
            System.out.println(matriz[i][0] + " " + matriz[i][1]);
        }
    }
}