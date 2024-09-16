package FichaPratica02;

import java.util.Scanner;

public class EX_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salario;
        double taxa20=0.20, taxa30=0.30, taxa35=0.35, taxa40=0.40;
        double taxa1, taxa2, taxa3, taxa4;

        System.out.print("Intruduz o salario: ");
        salario = input.nextInt();

        if (salario <= 15000) {
            taxa1 = salario * taxa20;
            System.out.println("A taxa de 20% é: " + taxa1);
        }if (salario >=15000 && salario <=20000){
            taxa2 = salario * taxa30;
            System.out.println("A taxa de 30% é: "+taxa2);
        }if (salario >=20000 && salario <=25000){
            taxa3 = salario * taxa35;
            System.out.println("A taxa de 35% é: "+taxa3);
        }if (salario > 25000){
            taxa4 = salario * taxa40;
            System.out.println("A taxa de 40% é: "+taxa4);
        }


    }
}
