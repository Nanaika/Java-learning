package Parser;

import Parser.Parser;

public class AdvancedParser extends Parser {
    /**
     * Service method counting the number of names in the array starting with the letter A
     *
     * @param names String of names
     * @return Number of names starting with A
     */
    private int numFemByA(String[] names) {
        int number = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].charAt(0) == 'A') {
                number++;
            }
        }
        return number;
    }

    /**
     * The method selects female names starting with the letter A and creates a new array from them
     *
     * @param names String of names
     * @return Array of names starting with A
     */
    public String[] separateFemaleByA(String names) {
        ParsedData parsedData = createArrayFemNames(names);
        String[] tempArray = parsedData.getArrayFemale();
        String[] arrayNamesByA = new String[numFemByA(tempArray)];

        int index = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i].charAt(0) == 'A') {
                arrayNamesByA[index] = tempArray[i];
                index++;
            }

        }
        return arrayNamesByA;
    }
}
