package FichaPratica03;

import java.util.Scanner;

public class EX_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numInteiro, contador=2;

        System.out.println("Insere um Numero inteiro maior que 2: ");
        numInteiro= input.nextInt();

        while (contador <= numInteiro){
            if (contador % 2 == 0){
                System.out.println(contador);
            }
            contador++;
        }
    }
}
