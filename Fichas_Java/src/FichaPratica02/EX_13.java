package FichaPratica02;

import java.util.Scanner;

//

public class EX_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hora, minuto;

        System.out.print("Insere a hora: ");
        hora = input.nextInt();
        System.out.print("Insere o Minuto: ");
        minuto = input.nextInt();

        if (hora <= 12) {
            if(hora == 0) {
                hora = hora + 12;}
            System.out.println("Sao: "+hora+":"+minuto+"am");
        }else{
            switch (hora){
                case (13), (14), (16), (17), (18), (19), (20), (21), (22), (23):
                    hora = hora-12;
                    System.out.println("Sao: "+hora+":"+minuto+"pm");
                    break;
            }
        }
    }
}
