
import Parser.Parser;
import Parser.ParsedData;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Parser parser = new Parser();

        ParsedData parsedData = parser.createArrayFemNames("Anna,Timur,Ada,Tom");
        String[] array = parsedData.getArrayFemale();
        System.out.println(Arrays.toString(array));
    }



//        Parser.Parser parser = new Parser.Parser();
//        Parser.ParsedData parsedData = parser.createArrayFemNames(" Alina, Tom, Sabina, Jack, Pavel");
//        int num = parsedData.getNumDeleted();
//        System.out.println(num);
//        String[] array = parsedData.getArrayFemale();
//        System.out.println(Arrays.toString(array));


//        System.out.println(Arrays.toString(a));
        //        String[] array = parser.createArrayOfNames(args[0]);
//        for (String s : array) {
//            System.out.println(s);
//        }


    }
