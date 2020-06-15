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

    public static void printFibNumbers(int quantityOfNumbers) {

        int[] numbers = new int[quantityOfNumbers];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i < quantityOfNumbers; i++) {
            numbers[i] = numbers[i - 2] + numbers[i - 1];
        }

        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}