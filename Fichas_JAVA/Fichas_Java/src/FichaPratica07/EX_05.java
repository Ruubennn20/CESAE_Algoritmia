package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX_05 {
    public static void main(String[] args) throws FileNotFoundException {

        int soma = 0;

        File nums = new File("Ficheiros/exercicio_05_1999.txt");
        Scanner yaya = new Scanner(nums);

        while(yaya.hasNext()){
            soma += yaya.nextInt();
        }
        System.out.println(soma);
    }
}
