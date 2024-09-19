package FichaPratica02;

import java.util.Scanner;

public class EX_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Intruduz o primeiro numero: ");
        num1 = input.nextInt();
        System.out.print("Intruduz o primeiro numero: ");
        num2 = input.nextInt();

        if(num1 < num2) {
            System.out.println("o menor é: "+num1+"o maior é "+ num2);
        }else{
            System.out.println("o menor é: "+num2+" o maior é "+ num1);

            }
        }
}
