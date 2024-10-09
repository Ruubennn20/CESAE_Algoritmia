package Ficha_Extra_Ciclos;

import java.util.Scanner;

public class EX_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiplo,calculo;

        System.out.print("Insereo multiplo que queres ver a tabuada: ");
        multiplo = input.nextInt();

        for (int i = 1; i <= 10; i++){
            calculo = multiplo * i;
            System.out.println(multiplo+" x "+i+" = "+calculo);
        }

    }
}
