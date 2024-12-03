package FichaPratica02;

import java.util.Scanner;

public class EX_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int saldo, saldoMovimentar, aux;

        System.out.print("Intruza o saldo que tem: ");
        saldo = input.nextInt();
        System.out.print("Intruza o saldo que tem: ");
        saldoMovimentar = input.nextInt();

        aux = saldo + saldoMovimentar;

        if (aux >= 0) {
            System.out.println("O Saldo fica: " + aux);
        } else {
            System.out.println("Operacao Invalida: Saldo insuficiente");
            System.out.println("Saldo Atual: " + saldo);

        }
    }
}

