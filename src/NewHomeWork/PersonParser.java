package NewHomeWork;


import Parser.ParsedData;
import Parser.Parser;

public class PersonParser extends FieldParser {

    private Person[] personArray = new Person[3];


    public PersonParser(String names) {
        super(names);
    }


    public void createPersonArray(String name1 , String name2 , String name3) {
        personArray[0] = new Person(name1);
        personArray[1] = new Person(name2);
        personArray[2] = new Person(name3);

    }


    public String[] createFemArray() {

        Parser parser = new Parser();
        ParsedData parsedData = new ParsedData();

        int num = 0;
        for (Person a : this.personArray) {
            if (a.name.equals("")) {
                num++;
            }
        }

        if (num == this.personArray.length) {
            String[] femArray = super.createFemArray();
            return femArray;
        }

        String temp = "";
        for (Person name : this.personArray) {
            temp += name.name + ",";
        }

        String clearTemp = "";
        for (int i = 0; i < temp.length() - 1; i++) {
            clearTemp += temp.charAt(i);
        }

        parsedData = parser.createArrayFemNames(clearTemp);
        String[] tempArray = parsedData.getArrayFemale();
        return tempArray;


    }

}

