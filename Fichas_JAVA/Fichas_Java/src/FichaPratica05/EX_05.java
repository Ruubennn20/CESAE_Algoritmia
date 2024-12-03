package FichaPratica05;

import java.util.Scanner;

public class EX_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros= new int[10];
        int soma=0, media = 0;

        for(int i=0;i< numeros.length;i++) {
            System.out.print("Insere os numeros para calcular a média [" + i + "]: ");
            numeros[i] = input.nextInt();
            soma = soma + numeros[i];
            media = soma / numeros.length;
        }
        System.out.println("A Media do Array é de: "+media);
    }
}
