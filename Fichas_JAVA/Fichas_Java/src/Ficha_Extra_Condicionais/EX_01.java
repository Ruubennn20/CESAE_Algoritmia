package Ficha_Extra_Condicionais;

import java.util.Scanner;

public class EX_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.print("Introduz uma idade: ");
        idade = input.nextInt();

        if(idade < 18){
            System.out.print("É menor de idade");
        }else{
            System.out.println("É maior de idade");
        }
    }
}
