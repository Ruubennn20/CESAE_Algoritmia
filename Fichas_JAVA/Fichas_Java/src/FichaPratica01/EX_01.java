package FichaPratica01;

import java.util.Scanner;

public class EX_01 {

    public static  void main(String[] args) {
    //Import do Scanner - Habilitar a escrita por parte do user
    Scanner input = new Scanner(System.in);

    //Declarar variaveis
    int num1, num2, soma;

    //ler num1
    System.out.print("Intruduza um numero: ");
    num1 = input.nextInt();

    //ler num2
    System.out.print("Intruduzir outro numero: ");
    num2 = input.nextInt();

    //calcular a soma
    soma = num1 + num2;

    //Apresentar a soma
    System.out.println("Soma: "+ soma);


    }

}
