package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX_09 {

    public static void generoMusicas(String caminhoFicheiro) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insere o genero da musica para descobrires quantas musicas(Pop, Rock, Heavy Metal, Grunge)");
        String genero = input.nextLine();

        Scanner musica = new Scanner(new File(caminhoFicheiro));

        while (musica.hasNextLine()) {
            String linhaMusica = musica.nextLine();
            String[] musicas = linhaMusica.split(",");
            String nomeMusica = musicas[0];
            String genMusic = musicas[2];
            if (genero.equals(genMusic)){
                System.out.println(nomeMusica);
            }
        }
    }

    public static void artistaMusicas(String caminhoFicheiro) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insere o artista da musica para descobrires quantas musicas tens desse artista:");
        System.out.println("Michael Jackson, Queen, Led Zeppelin, Guns N Roses, AC/DC, Pink Floyd");
        String artista = input.nextLine();

        Scanner musica = new Scanner(new File(caminhoFicheiro));


        while(musica.hasNextLine()){
            String linhaMusica = musica.nextLine();
            String[] musicas = linhaMusica.split(",");
            String nomeMusica = musicas[0];
            String artMusic = musicas[1];

            if (artista.equals(artMusic)){
                System.out.println(nomeMusica );
            }
        }

    }

    public static void musicaMaiorDuracao(String caminhoFicheiro) throws FileNotFoundException {

        int maiorMinuto= 0;
        int maiorSegundo= 0;
        String nomeArtista = "bla";
        String nomeDaMusica = "bla";
        Scanner musica = new Scanner(new File(caminhoFicheiro));

        String linhaMusica = musica.nextLine();

        while(musica.hasNextLine()) {
           linhaMusica = musica.nextLine();
            String[] musicas = linhaMusica.split(",");
            String nomeMusica = musicas[0];
            String nomeArtist = musicas[1];
            String[] minutosAndsegundos = musicas[3].split(":");
            int minutoMusica = Integer.parseInt(minutosAndsegundos[0]);
            int segundosMusica = Integer.parseInt(minutosAndsegundos[1]);

            if (minutoMusica > maiorMinuto && segundosMusica > maiorSegundo){
                maiorMinuto = minutoMusica;
                maiorSegundo = segundosMusica;
                nomeArtista = nomeArtist;
                nomeDaMusica = nomeMusica;
            }


        }
        System.out.println("A musica com maior duraçao é a "+nomeDaMusica+" de "+nomeArtista+" com o tempo de "+maiorMinuto + ":"+ maiorSegundo );
    }

    public static void musicasDuracaoEspecifico(String caminhoFicheiro) throws FileNotFoundException {

        Scanner input = new Scanner (System.in);
        System.out.println("Insere um numero para pesquisar musicas com a duração desse numero");
        int numero = input.nextInt();

        Scanner musica = new Scanner(new File(caminhoFicheiro));

        String linhaMusica = musica.nextLine();

        while(musica.hasNextLine()) {
            linhaMusica = musica.nextLine();
            String[] musicas = linhaMusica.split(",");
            String nomeMusica = musicas[0];
            String nomeArtist = musicas[1];
            String[] minutosAndsegundos = musicas[3].split(":");
            int minutoMusica = Integer.parseInt(minutosAndsegundos[0]);
            int segundosMusica = Integer.parseInt(minutosAndsegundos[1]);

            if (numero <= minutoMusica){
                System.out.println(nomeMusica + " de " + nomeArtist);
            }
        }
    }

    public static void totalMusicas (String caminhoFicheiro) throws FileNotFoundException {

        int contador = 0;
        Scanner musica = new Scanner(new File(caminhoFicheiro));
        String linhaMusica = musica.nextLine();

        while (musica.hasNextLine()){
            linhaMusica = musica.nextLine();
            contador++;
        }
        System.out.println("Existem "+contador+" musicas");
    }


    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\n\n********** Menu das Músicas **********\n");

            System.out.println("\n\n1. Pesquisa o genero da musica");
            System.out.println("2. Pesquisa o artista da musica");
            System.out.println("3. Pesquisa a musica com maior duração");
            System.out.println("4. Pesquisa musicas com duração acima do valor especificado");
            System.out.println("5. Pesquisa o numero de musicas");
            System.out.println("0. Sair");
            System.out.print("Insira a opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1: //genero da musica
                    generoMusicas("Ficheiros/exercicio_09.csv");
                    break;
                case 2: //artista da musica
                    artistaMusicas("Ficheiros/exercicio_09.csv");
                    break;
                case 3://musica com maior duração
                    musicaMaiorDuracao("Ficheiros/exercicio_09.csv");
                    break;
                case 4://musicas com duração maior que a especificada
                    musicasDuracaoEspecifico("Ficheiros/exercicio_09.csv");
                    break;
                case 5://numero total de musicas
                    totalMusicas("Ficheiros/exercicio_09.csv");
                    break;
                case 0: // Sair
                    System.out.println("\n\n\uD83E\uDD13 OBRIGADO! ATÉ À PRÓXIMA! \uD83E\uDD13");
                    break;
                default: // Opção Inválida
                    System.out.println("❌ Opção Inválida ❌");
            }

            System.out.println("____________________________________________________");
        } while (opcao != 0);
    }
}
