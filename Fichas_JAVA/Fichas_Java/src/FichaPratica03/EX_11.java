package FichaPratica03;

import java.util.Scanner;

public class EX_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite, salto, contador = 0;

        System.out.println("Insere o limite: ");
        limite = input.nextInt();
        System.out.println("Insere o salto: ");
        salto = input.nextInt();


        while (contador <= limite) {
            System.out.println(contador);
            contador = contador + salto;
        }
    }
}
