package FichaPratica02;

import java.util.Scanner;

public class EX_08 {
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

        mVariavel = (valor1 * 0.25)+(valor2 * 0.35)+(valor3 * 0.4);

        if(mVariavel>=9.5){
            System.out.println("Está aprovado");
        }else {
            System.out.println("Não esta aprovado");
        }
    }
}
