package FichaPratica01;

import java.util.Scanner;

public class EX_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,area,per;

        System.out.print("Intruduz um numero: ");
        num1 = input.nextInt();

        area = num1*num1;
        per = num1*2;

        System.out.println("A Area do retangulo é: "+ area);
        System.out.println("O Perimetro do retangulo é: "+ per);
    }
}
