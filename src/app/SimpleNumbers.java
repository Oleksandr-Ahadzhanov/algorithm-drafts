package app;

public class SimpleNumbers {

    private static boolean checkIfPrime(int number) {
        int sqrtNumber = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrtNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void showIfPrime(int number) {
        if (checkIfPrime(number)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void showSimpleNumbers(int quantity) {

        int max = 100000;
        int flag = 0;

        if (quantity > max) {
            System.out.println("Сорянчик но это уже перебор");
        } else {
            for (int j = 2; j <= max; j++) {
                if (flag != quantity) {
                    if (checkIfPrime(j)) {
                        System.out.print(j + " ");
                        flag++;
                    }
                }
            }
            System.out.println();
        }
    }
}


