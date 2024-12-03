package FichaPratica01;

import java.util.Scanner;

public class EX_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.print("Indique o Valor 1: ");
        valor1 = input.nextInt();
        System.out.print("Indique o Valor 2: ");
        valor2 = input.nextInt();

        System.out.println("O valor 1 é: "+valor1);
        System.out.println("O valor 2 é: "+valor2);

        //valor1=valor2;
        //valor2=valor1;

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        System.out.println("O valor ao contrario 1: " +valor1);
        System.out.print("O valor ao contrario 2: " +valor2);
    }
}
