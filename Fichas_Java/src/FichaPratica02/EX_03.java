package FichaPratica02;

import java.util.Scanner;

public class EX_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double taxa, salario;

        System.out.print("Intruduz o salario: ");
        salario = input.nextInt();

        if (salario <= 15000) {
            taxa = salario * 0.2;
            System.out.println("A taxa de 20% é: " + taxa);
        }

        if (salario >15000 && salario <=20000){
            taxa = salario * 0.3;
            System.out.println("A taxa de 30% é: "+taxa);
        }

        if (salario >20000 && salario <=25000){
            taxa = salario * 0.35;
            System.out.println("A taxa de 35% é: "+taxa);
        }

        if (salario > 25000){
            taxa = salario * 0.4;
            System.out.println("A taxa de 40% é: "+taxa);
        }

    }
}
