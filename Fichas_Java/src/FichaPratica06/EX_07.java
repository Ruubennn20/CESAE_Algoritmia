package FichaPratica06;

public class EX_07 {
    public static void  desenharRetangulo (String caracter, int linhas, int colunas) {

        //linha de cima
        for (int i = 0; i < colunas; i++) {
            System.out.print(caracter);
        }

        //linhas do meio
        for (int h = 0; h < linhas; h++) {
            for (int i = 0; i < colunas; i++) {
                if (i == 0) {
                    System.out.print(caracter);
                } else { //espaços do meio
                    System.out.println(" ");
                }

            }


        }

    }

}
