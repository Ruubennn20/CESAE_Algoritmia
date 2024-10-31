package FichaPratica06;

import java.util.Scanner;

public class EX_01 {

    static void fazerbarulho(String animal) {

        switch (animal) {
            case "gato":
                System.out.println("Miau");
                break;

            case "cao":
                System.out.println("au au au");
                break;

            case "peixe":
                System.out.println("glub glub");
                break;

            case "vaca":
                System.out.println("Muuuu");
                break;

            case "porco":
                System.out.println("oinc oinc");
                break;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String animalEscolhido;

        System.out.println("Escolha um animal: ");
        animalEscolhido = input.next();

        fazerbarulho(animalEscolhido);
    }
}