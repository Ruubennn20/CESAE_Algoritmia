package FichaPratica02;

import java.util.Scanner;

public class EX_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Insere o Primeiro Numero: ");
        num1 = input.nextInt();
        System.out.print("Insere o Segundo Numero: ");
        num2 = input.nextInt();
        System.out.print("Insere o Terceiro Numero: ");
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.println("A ordem crescente é: " + num1 + " " + num2 + " " + num3);
        } else {
            if (num1 > num2 && num1 > num3 & num3 > num2) {
                System.out.println("A ordem crescente é: " + num1 + " " + num3 + " " + num2);
            } else {
                if (num2 > num1 && num2 > num3 && num1 > num3) {
                    System.out.println("A Ordem crescente é: " + num2 +" "+ num1 +" "+ num3);
                } else {
                    if (num2 > num1 && num2 > num3 && num3 > num1) {
                        System.out.println("A ordem crescente é: " + num2 +" "+ num3 +" "+ num1);
                    } else {
                        if (num3 > num1 && num3 > num2 && num1 > num2) {
                            System.out.println("A ordem crescente é: " + num3 +" "+ num1 +" "+ num2);
                        } else {
                            if (num3 > num1 && num3 > num2 && num2 > num1) {
                                System.out.println("A ordem crescente é: " + num3 +" "+ num2 +" "+ num1);
                            }
                        }
                    }
                }
            }
        }
    }
}