package app;
import static java.lang.Math.*;

public class PlayingWithDigits {
    public static long digPow(int n, int p) {
        String valueOfNumber = String.valueOf(n);
        char[] numbersArray = valueOfNumber.toCharArray();

        double finalValue = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            finalValue = finalValue + pow(numbersArray[i],p);
            p += 1;
        }

//        if(finalValue % n == 0) {
//            double result = finalValue/n;
//            return (long) result;
//        } else return -1;
        return (long)finalValue;
    }
}
