package Ficha_Extra_Ciclos;

import java.util.Scanner;

public class EX_04_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 1, num2 = 1;

        while(num1 <= 4){
            while(num2 <= num1){
                System.out.print("**********");
                num2++;
            }
            System.out.println(" ");
            num1++;
        }
    }
}
