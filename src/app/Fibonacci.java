package app;

public class Fibonacci {

//    public int[] searchFibonacciNumbers(int quantityOfNumbers) {
//        int[] numbers = new int[quantityOfNumbers];
//        numbers[0] = 0;
//        numbers[1] = 1;
//        for (int i = 2; i <= quantityOfNumbers; i++) {
//            numbers[i] = numbers[i - 2] + numbers[i - 1];
//        }
//        return numbers;
//    }

    public static void printFibNumbersByLoop(int quantityOfNumbers) {

        int[] numbers = new int[quantityOfNumbers];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i < quantityOfNumbers; i++) {
            numbers[i] = numbers[i - 2] + numbers[i - 1];
        }

        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static int findFibNumbersByRecursion(int quantityOfNumbers) {

        if(quantityOfNumbers == 0) {return 0;}
        else
        if(quantityOfNumbers == 1) {return 1;}
        else {
            return findFibNumbersByRecursion((quantityOfNumbers-2)) + findFibNumbersByRecursion((quantityOfNumbers-1));
        }
    }
    
    public static void printFibonacciByRecursion (int quantity) {
        for (int n = 0; n < quantity; n++) {
            System.out.print(findFibNumbersByRecursion(n) + " ");
        }
    }
}