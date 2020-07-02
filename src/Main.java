import static app.ArrayCalculator.arrayCalculate;
import static app.DNAalgorithm.makeComplement;
import static app.Fibonacci.*;
import static app.PlayingWithDigits.digPow;
import static app.SimpleNumbers.showSimpleNumbers;
import static app.Sorting.*;
import static app.StringEditor.capitalLetterString;
import static app.StringEditor.stringPartsReverse;
import static app.StringEditor.stringReverse;

public class Main {

    public static void main(String[] args) {
        String myString = "my name is nastya";
        String myStringExtended = "my,name.is nastya";
        String myDNA = "ATTGC";
        int[] myArray = {1,2,3,4,5};
        int[] arrayFoSort = {15, 3, 0, 100,7,10,4,1};

//        System.out.println(stringReverse(myStringExtended));
//        System.out.println(stringPartsReverse(myStringExtended));
//        System.out.println(capitalLetterString(myStringExtended));
//
//        System.out.println(arrayCalculate(myArray));
//
//        showSimpleNumbers(10);

//        printFibNumbersByLoop(10);
//        printFibonacciByRecursion(10);

//        printArray(sortLikeBubble(arrayFoSort));
//        printArray(sortLikeSelection(arrayFoSort));
//        printArray(sortLikeInsertion(arrayFoSort));

//        System.out.println(makeComplement(myDNA));

        System.out.println(digPow(46288,3));




    }
}
