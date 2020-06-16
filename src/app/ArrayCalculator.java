package app;

public class ArrayCalculator {

    public static int arrayCalculate (int arr[]) {
        int middle = arr.length / 2;
        int result = 0;
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                result = result + (arr[i] * arr[arr.length - 1 - i]);
            }
        } else {
            for (int i = 0; i < arr.length / 2; i++) {
                result = result + (arr[i] * arr[arr.length - 1 - i]);
            }
            result += arr[arr.length/2];
        }
        return result;

    }
}

