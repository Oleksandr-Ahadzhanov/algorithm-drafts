package app;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.*;

public class PlayingWithDigits {
    public static long digPow(int n, int p) {

        ArrayList<Integer> numbersArray = new ArrayList<>();
        for (Integer i = n; i > 0; i = i / 10) {
            numbersArray.add(i%10);
        }
        Collections.reverse(numbersArray);

        long finalValue = 0;

        for (Integer index = 0; index < numbersArray.size(); index++) {
            finalValue = finalValue + (long) pow(numbersArray.get(index),p+index);
        }

        if(finalValue % n == 0) {
            long result = finalValue/n;
            return  result;
        } else return -1;
    }
}
