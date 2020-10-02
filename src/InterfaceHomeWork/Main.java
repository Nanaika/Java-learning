package InterfaceHomeWork;

import java.util.Arrays;

public class Main {

public static void main (String[] args) {

    FieldParser fieldParser = new FieldParser();
    fieldParser.setNames("aaa,uuu,ttt");

    PersonParser personParser = new PersonParser(fieldParser);
    personParser.createPersonArray("","","");

    ParserOperations parserOperations;
    parserOperations = fieldParser;
    String[] asd = parserOperations.createFemArray();
    System.out.println(Arrays.toString(asd));
    parserOperations = personParser;
    asd = parserOperations.createFemArray();
    System.out.println(Arrays.toString(asd));





        //    FieldParser fieldParser = new FieldParser();
//    fieldParser.setArrayNames("Aaa,uuu,fff");
//    String[] array = fieldParser.getArrayNames();
//    System.out.println(Arrays.toString(array));
//
//    PersonParser personParser = new PersonParser();
//    personParser.createPersonArray("","","");
//    String[] arr3 = personParser.createFemArray();
//    System.out.println(Arrays.toString(arr3));
//
//
//
//
//    String[] array1 = fieldParser.createFemArray();
//    System.out.println(Arrays.toString(array1));
//
//
//
//    ManifestParser manifestParser = fieldParser;
//    String[] arr23 = manifestParser.createFemArray();
//    System.out.println(Arrays.toString(arr23));
//
//    manifestParser = personParser;
//    System.out.println(Arrays.toString(manifestParser.createFemArray()));
//

}



}
