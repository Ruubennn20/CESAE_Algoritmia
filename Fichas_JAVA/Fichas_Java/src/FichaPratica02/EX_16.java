package FichaPratica02;

import java.util.Scanner;

public class EX_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor, notas;

        System.out.println("Insira o valor em €: ");
        valor= input.nextInt();

        //Notas 200
        notas = valor / 200;
        System.out.println(notas+" notas de 200€");
        valor = valor % 200;

        //Notas 100
        notas = valor / 100;
        System.out.println(notas+" notas de 100€");
        valor = valor % 100;

        //Notas 50
        notas = valor / 50;
        System.out.println(notas+" notas de 50€");
        valor = valor % 50;

        //Notas 20
        notas = valor / 20;
        System.out.println(notas+" notas de 20€");
        valor = valor % 20;

        //Notas 10
        notas = valor / 10;
        System.out.println(notas+" notas de 10€");
        valor = valor % 10;

        //Notas 5
        notas = valor / 5;
        System.out.println(notas+"notas de 5€");
        valor = valor % 5;

    }
}
