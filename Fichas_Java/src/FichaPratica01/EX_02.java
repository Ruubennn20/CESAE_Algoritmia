package FichaPratica01;

import java.util.Scanner;

public class EX_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, soma, sub, multi, div;

        System.out.print("Intruduza um numero: ");
        num1 = input.nextInt();
        System.out.print("Intruduza outro numero: ");
        num2 = input.nextInt();

        soma = num1 + num2;
        sub = num1 - num2;
        multi = num1 * num2;
        div = num1 / num2;

        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+sub);
        System.out.println("Multiplicação: "+multi);
        System.out.println("Divisão: "+div);
    }


}
