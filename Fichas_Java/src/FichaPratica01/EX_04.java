package FichaPratica01;

import java.util.Scanner;

public class EX_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int raio;
        double pi,area;

        pi = 3.14;

        System.out.print("Intruduz o raio: ");
        raio = input.nextInt();

        area = pi * (raio*raio);

        System.out.print("A area da Circunferecia é: "+area);


    }
}
