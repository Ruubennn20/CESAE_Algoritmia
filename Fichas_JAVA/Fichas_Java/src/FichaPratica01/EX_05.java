package FichaPratica01;

import java.util.Scanner;

public class EX_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2, valor3, mAritmetica;
        double mVariavel;

        System.out.print("Indique o primeiro valor: ");
        valor1 = input.nextInt();
        System.out.print("Indique o segundo valor: ");
        valor2 = input.nextInt();
        System.out.print("Indique o terceiro valor: ");
        valor3 = input.nextInt();

        mAritmetica = (valor1 + valor2 + valor3)/3;

        System.out.println("valor: "+mAritmetica);

        mVariavel = (valor1 * 0.2)+(valor2 * 0.3)+(valor3 * 0.5);
        System.out.print("Media Aritmetica: "+ mVariavel);

    }
}
