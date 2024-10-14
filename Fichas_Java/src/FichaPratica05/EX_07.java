package FichaPratica05;

import java.util.Scanner;

public class EX_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[12];
        int numMaiorPar = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Insere os numeros na lista " + i + ": ");
            numeros[i] = input.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numMaiorPar) {
                if (numeros[i] % 2 == 0) {
                    numMaiorPar = numeros[i];
                }
            }
        }
        System.out.println(numMaiorPar);
    }
}