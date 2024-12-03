package FichaPratica01;

import java.util.Scanner;

public class EX_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int comp,larg,area,per;

        System.out.println("Intruduz o comprimento do retangulo: ");
        comp = input.nextInt();
        System.out.print("Intruduz a largura do retangulo: ");
        larg = input.nextInt();

        area = comp * larg;
        per = (comp + larg) * 2;

        System.out.println("A Area do retangulo é: "+ area);
        System.out.println("O Perimetro do retangulo é: "+ per);
    }
}
