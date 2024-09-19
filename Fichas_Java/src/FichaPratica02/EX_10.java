package FichaPratica02;

import java.util.Scanner;

public class EX_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,num2;
        System.out.print("Intruduz o primeiro numero: ");
        num1= input.nextInt();
        System.out.print("Intruduz o segundo numero: ");
        num2= input.nextInt();

        String opeAritmetica;
        System.out.print("Intruduz a operaçao desejada: ");
        opeAritmetica = input.next();

        switch (opeAritmetica) {
            case "+":
                System.out.println("O resultado da soma é: " + (num1 + num2));
                break;
            case "-":
                System.out.println("o resuldado da subtraçao é: " + (num1 - num2));
                break;
            case "*":
                System.out.println("o resuldado da multiplicaçao é: " + (num1 * num2));
                break;
            case "/":
                System.out.println("o resuldado da divisao é: " + (num1 / num2));
                break;

            default:
                System.out.println("Nao inserir a operaçao aritmetica correta.");
        }
        }
}
