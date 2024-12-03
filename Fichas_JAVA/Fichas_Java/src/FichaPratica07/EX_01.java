package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX_01 {
    public static void main(String[] args) throws FileNotFoundException {

        File ex01 = new File("Ficheiros/exercicio_01.txt");
        Scanner sc = new Scanner(ex01);

        System.out.println(sc.nextLine());


    }
}
