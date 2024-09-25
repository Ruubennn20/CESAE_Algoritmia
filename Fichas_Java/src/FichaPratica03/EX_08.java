package FichaPratica03;

import java.util.Scanner;

public class EX_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador=0, num1;

        System.out.println("Insere o Numero: ");
        num1 = input.nextInt();
        num1= num1 - 5;
        while (contador<5) {
            System.out.println(num1);
            num1++;
            contador++;
        }
        while (contador >= 5 && contador <10){
            num1++;
            System.out.println(num1);
            contador++;
        }
    }
}