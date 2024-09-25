package FichaPratica03;

import java.util.Scanner;

public class EX_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota,contador = 0,media, soma=0;

        System.out.print("Introduza uma nota: ");
        nota= input.nextInt();

        while(nota != -1){
            soma =soma+nota;
            contador++;

            System.out.print("Introduza uma nota: ");
            nota= input.nextInt();

        }
        if(nota <= -1 ){
            media = soma / contador;
            System.out.println("A média é: "+media);
        }
    }
}
