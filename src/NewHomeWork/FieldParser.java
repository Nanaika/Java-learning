package NewHomeWork;

import Parser.Parser;
import Parser.ParsedData;


public class FieldParser {
    private String[] arrayNames;


    public FieldParser(String names) {
        Parser parser = new Parser();
        String[] arrayNames = parser.createArrayNames(names);
        this.arrayNames = arrayNames;

    }


    public String[] createFemArray() {
        Parser parser = new Parser();
        String temp = String.join("," , this.arrayNames);
        ParsedData parsedData = parser.createArrayFemNames(temp);
        String[] femArray = parsedData.getArrayFemale();
        return femArray;
    }


}
