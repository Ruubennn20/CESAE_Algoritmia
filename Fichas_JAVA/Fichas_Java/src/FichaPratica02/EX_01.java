package FichaPratica02;

import java.util.Scanner;

public class EX_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Intruduz o primeiro numero: ");
        num1 = input.nextInt();

        System.out.print("Intruduz o segundo numero: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("O maior é: " + num1);
        }else{
            System.out.println("O maior é: " + num2);
        }
        }

}
