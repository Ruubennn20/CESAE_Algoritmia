package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class EX_02 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        String fraseBonita;

        System.out.println("Insere uma Frase Bonita");
        fraseBonita = input.nextLine();

        File ex02 = new File("Ficheiros/exercicio_02.txt");
        Formatter formatador = new Formatter(ex02);

        formatador.format(fraseBonita);
        formatador.close();
    }
}
