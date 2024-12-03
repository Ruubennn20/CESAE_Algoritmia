package FichaPratica04;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, calculo = 0;
        String op;
        String cont;

        do {
            System.out.print("Insere o primeiro valor: ");
            num1 = input.nextInt();
            System.out.print("Insere o segundo valor: ");
            num2 = input.nextInt();
            System.out.print("Insere a operaçao aritmemtica: ");
            op = input.next();

            switch(op){
                case ("+"):
                    calculo = num1 +num2;
                    break;
                case("-"):
                    calculo = num1 - num2;
                    break;
                case("*"):
                    calculo = num1 * num2;
                    break;
                case("/"):
                    calculo = num1 / num2;
                default:
                    System.out.println("INVALIDO");
            }
            System.out.println(calculo);
            System.out.print("Deseja continuar? s/n");
            cont = input.next();
        }while(cont.equals("s"));
    }
}
