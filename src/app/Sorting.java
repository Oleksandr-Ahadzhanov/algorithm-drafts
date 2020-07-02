package app;

public class Sorting {

    private static void swap(int[] inputArray, int first, int second) {
        int temp = inputArray[first];
        inputArray[first] = inputArray[second];
        inputArray[second] = temp;
    }

    public static void printArray (int[] inputArray) {
        
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]+ " ");
        }
    }

    public static int[] sortLikeBubble(int[] inputArray) {
        int[] resultArray = inputArray;
        for (int i = 0 ; i < inputArray.length-1; i++) {
            for (int j = 0; j < inputArray.length-1-i; j++) {
                if(inputArray[j]>inputArray[j+1]) {
                    swap(inputArray, j, j+1);
                }
            }
        }
        return resultArray;
    }

    public static int[] sortLikeSelection(int[] inputArray) {
        int[] resultArray = inputArray;
        for (int i = 0; i < inputArray.length; i++) {
            int minIndex = i;
            for (int j = minIndex; j < inputArray.length; j++) {
                if (inputArray[j]>inputArray[minIndex]){
                    minIndex = j;
                }
                swap(inputArray, j,minIndex);
            }
        }
        return resultArray;
    }

    public static int[] sortLikeInsertion(int[] inputArray) {
        int[] resultArray = inputArray;
        for (int i = 0; i < inputArray.length; i++) {
            int maxValue = inputArray[i];
            int j = i-1;
            for (; j >=0; j--) {
                if(inputArray[j]>maxValue) {
                    inputArray[j+1]=inputArray[j];
                } else {
                    break;
                }
            }
            inputArray[j+1] = maxValue;
        }
        return resultArray;
    }
}
