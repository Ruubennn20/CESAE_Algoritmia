package FichaPratica06;

import java.util.Scanner;

public class EX_02 {


    static void numero(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numValido;
        do {
            System.out.println("Insira um número válido : ");
            numValido = input.nextInt();
        } while (numValido <= 0);
            numero(numValido);
        }
    }

