package FichaPratica03;

import java.util.Scanner;

public class EX_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite,contador=0, nums=0;


        System.out.print("Insere o limite: ");
        limite= input.nextInt();

        while(contador < limite){
            contador++;
            System.out.print("Intruduza um número: ");
            nums = input.nextInt();

        }
        System.out.println(nums);
    }
}
