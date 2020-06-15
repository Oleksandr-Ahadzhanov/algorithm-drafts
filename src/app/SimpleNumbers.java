package app;

import java.util.ArrayList;

public class SimpleNumbers {

    public static boolean checkIfPrime(int number) {
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

        int max = 10000;
        int flag = 0;

        for (int j = 2; j <= max; j++) {
            if(flag!=quantity) {
                if (checkIfPrime(j)) {
                    System.out.print(j + ",  ");
                    flag++;
                }
            }
        }
    }
}


