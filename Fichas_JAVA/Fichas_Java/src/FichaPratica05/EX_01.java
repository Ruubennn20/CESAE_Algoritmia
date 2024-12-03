package FichaPratica05;

import java.util.Scanner;

public class EX_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.print("Insira no vetor ["+ i +"]: ");
            vetor[i]= input.nextInt();
        }
        for(int i = 0; i < 10; i++){
            System.out.println(vetor[i]);
        }
        }
    }
