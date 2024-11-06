package FichaPratica06;

public class EX_03 {

    public static boolean par(int num) {
        if (num % 2 == 1) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean positivo(int num) {
        if (num < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean primo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

   public static boolean perfeito(int num) {
        if (num <= 1) {
            return false;
        }
        int somaDivisores = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == num;
    }

    static boolean triangular(int num) {
        int somar = 0;
        for (int i = 1; i <= num; i++) {
            somar += i;

            if (somar == num) {
                return false;
            }
        }
        return true;
    }
}
