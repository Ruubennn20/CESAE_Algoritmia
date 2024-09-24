package FichaPratica03;

import java.util.Scanner;

public class EX_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador=0,num1;

        System.out.print("Insere um numero: ");
        num1=input.nextInt();

        while(contador <= num1){
            System.out.println(contador);
            contador = contador+1;

        }
    }
}
