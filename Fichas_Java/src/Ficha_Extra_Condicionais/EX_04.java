package Ficha_Extra_Condicionais;

import java.util.Scanner;

public class EX_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String letra;

        System.out.println("Insere uma letra para verificar se é vogal ou consoante.");
        letra = input.next();

        if(letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u"))     {
            System.out.println("é uma volgal");
        }else{
            System.out.println("é uma consoante");
        }
    }
}
