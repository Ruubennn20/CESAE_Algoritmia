package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX_08 {

    public static void main(String[] args) throws FileNotFoundException {

        File produtos = new File("Ficheiros/exercicio_08.csv");
        Scanner yaya = new Scanner(produtos);

        double totalVendas = 0;
        String linha = yaya.nextLine();

        while (yaya.hasNextLine()) {
            linha = yaya.nextLine();

            String[] partes = linha.split(",");
            double precos = Double.parseDouble(partes[3].trim());
            int quant = Integer.parseInt(partes[2].trim());

            totalVendas += precos * quant;
        }
        System.out.println(totalVendas);
    }
}