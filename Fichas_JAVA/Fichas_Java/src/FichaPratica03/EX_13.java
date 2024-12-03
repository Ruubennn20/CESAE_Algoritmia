package FichaPratica03;

import java.util.Scanner;

public class EX_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num2, contador;

        System.out.print("Insere o primeiro numero: ");
        contador= input.nextInt();
        System.out.print("Insere o segundo numero: ");
        num2= input.nextInt();

        while (contador <= num2) {
            if(contador % 5 ==0){
                System.out.println(contador);
            }
            contador++;
        }
    }
}
