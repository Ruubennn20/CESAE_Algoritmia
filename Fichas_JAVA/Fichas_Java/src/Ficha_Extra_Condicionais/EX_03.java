package Ficha_Extra_Condicionais;

import java.util.Scanner;

public class EX_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int preco;
        double discount = 0.90, precoDiscount;

        System.out.print("Insere o preço: ");
        preco = input.nextInt();

        if(preco > 100){
            precoDiscount = preco * discount;
            System.out.println("O preço com 10 % desconto é: "+precoDiscount);
        }else{
            System.out.println("O preço é: "+preco);
        }
    }
}
