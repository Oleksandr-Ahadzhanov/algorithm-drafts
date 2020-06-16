package app;

public class StringEditor {

    public static String stringReverse(String string) {
        String result = "";
        char arrStart[] = string.toCharArray();
        for (int i = arrStart.length - 1; i >= 0; i--) {
            result = result + arrStart[i];
        }
        return result;
    }

    public static String stringPartsReverse(String string) {
        String resultReverted = "";
        String regex = "\\s|,|\\.";
        String[] parsedStrings = string.split(regex);
        for (int i = 0; i < parsedStrings.length; i++) {
            if (i != 0) {
                resultReverted += stringReverse(parsedStrings[i] + " ");
            } else {
                resultReverted += stringReverse(parsedStrings[i]);
            }
        }
        return resultReverted;
    }

    public static String capitalLetterString(String string) {
        char separateCharacters[] = string.toCharArray();
        for (int i = 0; i < separateCharacters.length; i++) {
            if (i==0 ||separateCharacters[i-1] == (' ')
                     ||separateCharacters[i-1] == (',')
                     ||separateCharacters[i-1] == ('.')){
                separateCharacters[i] = Character.toUpperCase(separateCharacters[i]);
            }
        }
        return new String (separateCharacters);
    }
}

