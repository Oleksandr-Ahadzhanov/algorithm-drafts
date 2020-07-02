package app;

public class DNAalgorithm {
        public static String makeComplement(String dna) {
            String result = "";
            char[] resultArray = dna.toCharArray();
            Character symbolA = 'A';
            Character symbolT = 'T';
            Character symbolG = 'G';
            Character symbolC = 'C';
            for (int i = 0; i < resultArray.length; i++) {
                if(resultArray[i] == symbolA) {
                    result += "T";
                } else if (resultArray[i] == symbolT) {
                    result += "A";
                } else if (resultArray[i] == symbolG) {
                    result += "C";
                } else if (resultArray[i] == symbolC) {
                    result += "G";
                } else {
                    System.out.println("Wrong symbol");
                }
            }
            return result;
        }
}

