package FichaPratica03;

import java.util.Scanner;

public class EX_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,contador=1;
        String mensagem;

        System.out.print("Insere o numero: ");
        num1 = input.nextInt();
        System.out.print("Insera a Mensagem: ");
        mensagem = input.next();

        while(contador <= num1){
            System.out.println(mensagem);
            contador = contador + 1;
        }
    }
}
