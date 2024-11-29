package FichaPratica07;

import java.util.Scanner;

public class testetestar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int maior = vetor[0];

        for (int i = 1; i<vetor.length; i++){
            if (vetor[i] <maior ){
                maior = vetor[i];
            }
        }
        System.out.println(maior);
    }
}
