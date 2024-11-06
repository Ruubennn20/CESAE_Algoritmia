package FichaPratica06;

import java.util.Scanner;

public class YEYE {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int userNum;
        System.out.println("Insere o numero");
        userNum = input.nextInt();

        double mathResult = Math.sqrt(1+8*userNum);

        if (mathResult == (int) mathResult && mathResult % 2 != 0){
            System.out.println(userNum + " é um numero triangular");
        }else{
            System.out.println(userNum + " não é um número traiangular");
        }
    }
}
