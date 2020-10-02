package InterfaceHomeWork;

import Parser.Parser;
import Parser.ParsedData;

public class PersonParser implements ParserOperations {

    private String[] arrayNames;
    private Person[] personArray = new Person[3];


    public PersonParser(FieldParser a) {
        this.arrayNames = a.getArrayNames();
    }

    public void createPersonArray(String name1 , String name2 , String name3) {
        personArray[0] = new Person(name1);
        personArray[1] = new Person(name2);
        personArray[2] = new Person(name3);

    }


    public String[] createFemArray() {
        Parser parser = new Parser();
        ParsedData parsedData;

        int num = 0;
        for (Person a : this.personArray) {
            if (a.name.equals("")) {
                num++;
            }
        }

        if (num == this.personArray.length) {
            String temp = String.join("," , arrayNames);
            parsedData = parser.createArrayFemNames(temp);
            String[] array = parsedData.getArrayFemale();
            return array;
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

