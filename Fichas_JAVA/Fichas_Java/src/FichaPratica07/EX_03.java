package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

public class EX_03 {
    public static void main(String[] args) throws FileNotFoundException {

        File ficheiro = new File("Ficheiros/exercicio_03.txt");
        Scanner sc = new Scanner(ficheiro);
       String alt = sc.nextLine();

       File novo = new File("Ficheiros/exercicio03_novo.txt");
        Formatter writee = new Formatter(novo);

       while(sc.hasNextLine()){
           alt = sc.nextLine();
           writee.format(alt);
       }
       writee.close();
    }
}
