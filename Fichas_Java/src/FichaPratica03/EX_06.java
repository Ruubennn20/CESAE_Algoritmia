package FichaPratica03;

import java.util.Scanner;

public class EX_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Insere o primeiro numero: ");
        num1 = input.nextInt();
        System.out.println("Insere o segundo numero: ");
        num2 = input.nextInt();

        while(num1 != num2){
            System.out.println(num1);
            num1++;
            System.out.println(num2);
        }
    }
}
