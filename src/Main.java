import static app.ArrayCalculator.arrayCalculate;
import static app.Fibonacci.*;
import static app.SimpleNumbers.showSimpleNumbers;
import static app.StringEditor.capitalLetterString;
import static app.StringEditor.stringPartsReverse;
import static app.StringEditor.stringReverse;

public class Main {

    public static void main(String[] args) {
        String myString = "my name is nastya";
        String myStringExtended = "my,name.is nastya";
        int[] myArray = {1,2,3,4,5};

        System.out.println(stringReverse(myStringExtended));
        System.out.println(stringPartsReverse(myStringExtended));
        System.out.println(capitalLetterString(myStringExtended));

        System.out.println(arrayCalculate(myArray));

        showSimpleNumbers(10);

//        printFibNumbersByLoop(10);
        printFibonacciByRecursion(10);




    }
}
