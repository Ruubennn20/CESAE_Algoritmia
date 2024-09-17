package FichaPratica02;

import java.util.Scanner;

public class EX_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;

        System.out.println("Intruduz um numero: ");
        num1 = input.nextInt();

        if (num1 % 2==0){
            System.out.println("O numero é par");
        }else {
            System.out.println("O numero é impar");
        }
    }
}
