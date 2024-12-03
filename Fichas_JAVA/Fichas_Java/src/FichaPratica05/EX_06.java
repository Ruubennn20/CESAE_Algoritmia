package FichaPratica05;

import java.util.Scanner;

public class EX_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        boolean auxiliar = true;

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Insere os numeros na lista ["+i+"]: ");
            numeros[i] = input.nextInt();
        }
        for(int i = 0 ; i < numeros.length - 1; i++){
            if(numeros[i]>numeros[i+1]){
                auxiliar = false;
            }
        }
        if (auxiliar){
            System.out.println("Esta em ordem crescente");
        }else{
            System.out.println("Não esta em ordem crescente");
        }
    }
}
