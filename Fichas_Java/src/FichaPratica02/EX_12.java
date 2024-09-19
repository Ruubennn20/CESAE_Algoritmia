package FichaPratica02;

import java.util.Scanner;

public class EX_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int escolha;
        System.out.println("1.Criar");
        System.out.println("2.Atualizar");
        System.out.println("3.Eliminar");
        System.out.println("4.Sair");
        System.out.print("Escolhe entre uma das opcoes: ");
        escolha = input.nextInt();

        switch (escolha){

            case  (1):
                System.out.println("Escolheu Criar Algo.");
                break;
            case  (2):
                System.out.println("Escolheu Atualizar Algo.");
                break;
            case  (3):
                System.out.println("Escolheu Eliminar Algo.");
                break;
            case  (4):
                System.out.println(" ");
                break;
            default:
                System.out.println("Insere o numero da acao correta.");
                break;
        }
    }
}
