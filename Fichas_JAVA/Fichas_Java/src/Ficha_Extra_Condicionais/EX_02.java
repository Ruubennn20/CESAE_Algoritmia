package Ficha_Extra_Condicionais;

import java.util.Scanner;

public class EX_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int peso;
        double lua;

        System.out.print("Insere o teu peso: ");
        peso = input.nextInt();

        if(peso > 0 ){
            lua = peso * 0.16;
            System.out.println("O peso na lua é: "+lua);
        }else{
            System.out.println("Insere um peso em condições");
        }
    }
}
