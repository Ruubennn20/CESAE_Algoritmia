package FichaPratica03;

import java.util.Scanner;

public class EX_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0, cont_0_25 = 0, cont_26_50 = 0, cont_51_75 = 0, cont_76_100 = 0;

//        System.out.println("Introduz um numero:");
//        num = input.nextInt();

        while (num >= 0) {
            System.out.println("Introduz um numero:");
            num = input.nextInt();

            if (num >= 0 && num <= 25) {
                cont_0_25++;
            }
            if (num >= 26 && num <= 50) {
                cont_26_50++;
            }
            if (num >= 51 && num <= 75) {
                cont_51_75++;
            }
            if (num >= 76 && num <= 100) {
                cont_76_100++;
            }
        }
    }
}
