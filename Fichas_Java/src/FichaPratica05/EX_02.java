package FichaPratica05;

import java.util.Scanner;

public class EX_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] comissao = new int[12];
        int anual = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Insere as comissões mensais: ");
            comissao[i] = input.nextInt();
        }
        for (int i = 0; i < 12; i++) {
            anual = anual + comissao[i];
        }
        System.out.println(anual);
    }
}
