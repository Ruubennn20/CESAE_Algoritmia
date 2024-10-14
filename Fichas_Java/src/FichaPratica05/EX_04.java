package FichaPratica05;

import java.util.Scanner;

public class EX_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int [10];
        int numMenor = 0;

        for (int i=0;i<numeros.length; i++){
            System.out.print("Insere os numeros na lista " + i + ": ");
            numeros[i] = input.nextInt();
        }
        numMenor = numeros[4];
        for (int i=0 ; i<numeros.length ; i++) {
            if (numMenor < numeros[i]) {
                numMenor = numeros[i];
            }
        }
        System.out.println(numMenor);
    }
}
