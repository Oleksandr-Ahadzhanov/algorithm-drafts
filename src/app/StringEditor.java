package app;

public class StringEditor {

    private static String result = "";
    private static String resultReverted = "";

    public static String stringReverse(String string) {
        char arrStart[] = string.toCharArray();
        for (int i = arrStart.length - 1; i >= 0; i--) {
            result = result + arrStart[i];
        }
        return result;
    }

    public static String stringPartsReverse(String string) {
//        String revertedString = "";
        String[] parsedStrings = string.split(" ");
        for (int i = 0; i < parsedStrings.length; i++) {
            if (i != 0) {
                resultReverted = stringReverse(parsedStrings[i] + " ");
            } else {
                resultReverted = stringReverse(parsedStrings[i]);
            }
        }
        return resultReverted;
    }

    public static String capitalLetterString(String string) {
        String stringWithCapitalLetters = "";
//        String[] parsedStrings = string.split(" ");
        char separateCharacters[] = string.toCharArray();
        for (int i = 0; i < separateCharacters.length; i++) {
            if (i==0 || separateCharacters[i-1] == ' '){
                separateCharacters[i] = Character.toUpperCase(separateCharacters[i]);
            }
        }
        return new String (separateCharacters);
    }
}

