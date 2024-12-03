package FichaPratica01;

import java.util.Scanner;

public class EX_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min1,min2,min3,min4,min5;
        int seg1,seg2,seg3,seg4,seg5;
        int totalsegundos,totalminutos;
        int restoSeg,segundos,restoMin,minutos,horas;


        System.out.print("Intruduza minutos da musica 1: ");
        min1 = input.nextInt();
        System.out.print("Intruduza segundos da musica 1: ");
        seg1 = input.nextInt();
        System.out.print("Intruduza minutos da musica 2: ");
        min2 = input.nextInt();
        System.out.print("Intruduza segundos da musica 2: ");
        seg2 = input.nextInt();
        System.out.print("Intruduza minutos da musica 3: ");
        min3 = input.nextInt();
        System.out.print("Intruduza segundos da musica 3: ");
        seg3 = input.nextInt();
        System.out.print("Intruduza minutos da musica 4: ");
        min4 = input.nextInt();
        System.out.print("Intruduza segundos da musica 4: ");
        seg4 = input.nextInt();
        System.out.print("Intruduza minutos da musica 5: ");
        min5 = input.nextInt();
        System.out.print("Intruduza segundos da musica 5: ");
        seg5 = input.nextInt();

        totalsegundos= seg1+seg2+seg3+seg4+seg5;
        totalminutos= min1+min2+min3+min4+min5;

        restoSeg= totalsegundos % 60;
        //segundos= totalsegundos / 60;
        restoMin= totalminutos % 60;
        horas= totalminutos / 60;

        System.out.println("teste: "+horas+":"+restoMin+":"+restoSeg);

    }
}
