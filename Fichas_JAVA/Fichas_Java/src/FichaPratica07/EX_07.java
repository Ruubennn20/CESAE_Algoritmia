package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX_07 {
    public static void main(String[] args) throws  FileNotFoundException {

        File texto= new File("Ficheiros/exercicio_07.txt");
        Scanner yaya = new Scanner(texto);

        int linhas = 0, palavras = 0;

        while (yaya.hasNextLine()) {
            String linha = yaya.nextLine();
            linhas++;

            String[] palavrasDaLinha = linha.split(" ");

            palavras += palavrasDaLinha.length;
        }
        System.out.println("Existem "+linhas+" linhas");
        System.out.println("Existem "+palavras+" palavras");

    }
}
