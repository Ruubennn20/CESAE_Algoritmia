package FichaPratica04;

import java.util.Scanner;

public class EX_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        boolean primo = true;

        System.out.print("Insere um numero primo: ");
        numero = input.nextInt();

        for (int i = 2; i <= numero/2; ++i) {
            if (numero % i == 0) {
                primo = false;
            }
        }
        if (primo){
            System.out.println("O numero é primo");
        }else{
            System.out.println("O numero nao é primo");
        }
    }
}
