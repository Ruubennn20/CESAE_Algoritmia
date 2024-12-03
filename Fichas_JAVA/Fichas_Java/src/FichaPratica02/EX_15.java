package FichaPratica02;

import java.util.Scanner;

public class EX_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        String letra;
;
        System.out.print("Insere o Primeiro Numero: ");
        num1 = input.nextInt();
        System.out.print("Insere o Segundo Numero: ");
        num2 = input.nextInt();
        System.out.print("Insere o Terceiro Numero: ");
        num3 = input.nextInt();
        System.out.println("Insere a letra C ou D para crescente ou decrescente: ");
        letra = input.next();

        switch (letra) {
            case ("D"):
                if (num1 > num2 && num1 > num3 && num2 > num3) {
                    System.out.println("A ordem decrescente é: " + num1 + " " + num2 + " " + num3);
                } else {
                    if (num1 > num2 && num1 > num3 & num3 > num2) {
                        System.out.println("A ordem decrescente é: " + num1 + " " + num3 + " " + num2);
                    } else {
                        if (num2 > num1 && num2 > num3 && num1 > num3) {
                            System.out.println("A Ordem decrescente é: " + num2 + " " + num1 + " " + num3);
                        } else {
                            if (num2 > num1 && num2 > num3 && num3 > num1) {
                                System.out.println("A ordem decrescente é: " + num2 + " " + num3 + " " + num1);
                            } else {
                                if (num3 > num1 && num3 > num2 && num1 > num2) {
                                    System.out.println("A ordem decrescente é: " + num3 + " " + num1 + " " + num2);
                                } else {
                                    if (num3 > num1 && num3 > num2 && num2 > num1) {
                                        System.out.println("A ordem decrescente é: " + num3 + " " + num2 + " " + num1);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case("C"):
                if (num1 < num2 && num1 < num3 && num2 < num3) {
                    System.out.println("A ordem crescente é: " + num1 + " " + num2 + " " + num3);
                } else {
                    if (num1 < num2 && num1 < num3 & num3 < num2) {
                        System.out.println("A ordem crescente é: " + num1 + " " + num3 + " " + num2);
                    } else {
                        if (num2 < num1 && num2 < num3 && num1 < num3) {
                            System.out.println("A Ordem crescente é: " + num2 + " " + num1 + " " + num3);
                        } else {
                            if (num2 < num1 && num2 < num3 && num3 < num1) {
                                System.out.println("A ordem crescente é: " + num2 + " " + num3 + " " + num1);
                            } else {
                                if (num3 < num1 && num3 < num2 && num1 < num2) {
                                    System.out.println("A ordem crescente é: " + num3 + " " + num1 + " " + num2);
                                } else {
                                    if (num3 < num1 && num3 < num2 && num2 < num1) {
                                        System.out.println("A ordem crescente é: " + num3 + " " + num2 + " " + num1);
                                    }
                                }
                            }
                        }
                    }
               break;
                }
        }
    }
}