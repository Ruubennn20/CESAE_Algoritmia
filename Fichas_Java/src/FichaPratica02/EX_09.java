package FichaPratica02;

import java.util.Scanner;

public class EX_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,num2,num3;

        System.out.println("Intruduz o primero numero");
        num1 = input.nextInt();
        System.out.println("Intruduz o primero numero");
        num2 = input.nextInt();
        System.out.println("Intruduz o primero numero");
        num3 = input.nextInt();

        if(num1 < num2 && num1<num3) {
            System.out.println("O menor dos numeros é 1: " + num1);
        }
        if(num2 < num1 && num2 < num3){
            System.out.println("O menor dos numero é 2: " + num2);
        }
        if(num3 < num1 && num3 < num2){
            System.out.println("O menor dos numero é 3: " + num3);
        }
    }
}



//if(num2 < num1) {
  //      if (num2 < num3)
    //    System.out.println("O menor dos numeros é: " + num1);
      //  }
        //        if(num3 < num2){
        //if(num3 < num1)
        //System.out.println("O menor dos numeros é: "+num1);