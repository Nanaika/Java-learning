package InterfaceHomeWork;

import Parser.Parser;
import Parser.ParsedData;

public class FieldParser implements ParserOperations {

    private String[] arrayNames;

    public void setNames(String names) {
        Parser parser = new Parser();
        String[] arrayNames = parser.createArrayNames(names);
        this.arrayNames = arrayNames;
    }

    public String[] getArrayNames() {
        return this.arrayNames;
    }

    public String[] createFemArray() {
            Parser parser = new Parser();
            String temp = String.join("," , arrayNames);
            ParsedData parsedData = parser.createArrayFemNames(temp);
            String[] femArray = parsedData.getArrayFemale();
            return femArray;
        }


    }
