package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class EX_06 {
    public static void main(String[] args) throws FileNotFoundException {

        File idades= new File("Ficheiros/exercicio_06.txt");
        Scanner yaya = new Scanner(idades);

        double maiorIdade = 0;
        String nomeMaisVelho = "";


        while (yaya.hasNextLine()) {
            String linha = yaya.nextLine();


            String[] partes = linha.split(",");
            String nome = partes[0].trim();
            int idade = Integer.parseInt(partes[1].trim());

            if (idade > maiorIdade) {
                maiorIdade = idade;
                nomeMaisVelho = nome;
            }
        }

        System.out.println("A pessoa mais velha é " + nomeMaisVelho + " com " + maiorIdade + " anos.");
        yaya.close();
    }
}
