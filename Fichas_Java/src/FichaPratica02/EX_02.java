package FichaPratica02;

import java.util.Scanner;

public class EX_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salario;
        double taxa1=0.20, taxa2=0.30,taxa20,taxa30;

        System.out.print("Intruduz o salario: ");
        salario = input.nextInt();

        if (salario <= 15000) {
            taxa20 = salario * taxa1;
            System.out.println("A taxa de 20% é: " + taxa20);
        }else {
            taxa30 = salario * taxa2;
            System.out.println("A taxa de 30% é:  " + taxa30);
        }

    }
}
