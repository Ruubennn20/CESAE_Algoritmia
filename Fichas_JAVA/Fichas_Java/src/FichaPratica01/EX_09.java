package FichaPratica01;

import java.util.Scanner;

public class EX_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coFuncionario,numDias, vaIliquido, subAlimentacao;
        double retIRS,segSocial,enFunc, enPatrao, valLiquido;

        System.out.print("Intruduzir o codigo do funcionario: ");
        coFuncionario = input.nextInt();

        System.out.print("Intruduzir os dias que trabalhou: ");
        numDias = input.nextInt();

        vaIliquido = numDias*40;
        subAlimentacao = numDias*5;
        retIRS = vaIliquido * 0.10;
        enFunc = 0.11;
        enPatrao = 0.2375;
        segSocial = vaIliquido * (0.11 + 0.2375);
        valLiquido = vaIliquido + subAlimentacao - retIRS - segSocial;

        System.out.println("O salario iliquido é: "+vaIliquido);
        System.out.println("O subsidio de alimentçao é: "+subAlimentacao);
        System.out.println("A retençao de IRS é: "+retIRS);
        System.out.println("A segurança social fica com: "+segSocial);
        System.out.println("O valor liquido é: "+valLiquido);

    }
}
