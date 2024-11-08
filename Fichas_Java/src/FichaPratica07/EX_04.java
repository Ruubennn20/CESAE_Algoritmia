package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX_04 {
    public static void main(String[] args) throws FileNotFoundException {

        File ex04 = new File("Ficheiros/exercicio_04.csv");
        Scanner yaya = new Scanner(ex04);

        while (yaya.hasNextLine()) {
            System.out.println(yaya.nextLine());
        }
    }
}
