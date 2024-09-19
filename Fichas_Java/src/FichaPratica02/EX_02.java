package FichaPratica02;

import java.util.Scanner;

public class EX_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario,taxa;

        System.out.print("Intruduz o salario: ");
        salario = input.nextInt();

        if (salario <= 15000) {
            taxa = salario * 0.2;
            System.out.println("A taxa de 20% é: " + taxa);
        }else {
            taxa = salario * 0.3;
            System.out.println("A taxa de 30% é:  " + taxa);
        }

    }
}
