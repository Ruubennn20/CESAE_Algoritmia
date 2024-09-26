package FichaPratica03;

import java.util.Scanner;

public class EX_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Introduz um numero:");
        num = input.nextInt();

        while (num < 0) {
            System.out.println("Introduz um numero:");
            num = input.nextInt();
        }
    }
}
