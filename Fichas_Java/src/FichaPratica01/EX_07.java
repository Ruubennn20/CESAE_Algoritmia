package FichaPratica01;

import java.util.Scanner;

public class EX_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p1,p2,p3,total;
        double resultado,desconto;

        System.out.print("Intruduzir o preço do produto 1: ");
        p1 = input.nextInt();

        System.out.print("Intruduzir o preço do produto 2: ");
        p2 = input.nextInt();

        System.out.print("Intruduzir o preço do produto 3: ");
        p3 = input.nextInt();

        desconto = 0.90;
        total = p1+p2+p3;
        System.out.println("O valor total é: "+total);
        resultado = total*desconto;
        System.out.println("O valor a pagar com 10% de desconto é: "+resultado);
    }
}
