package NewHomeWork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


//        FieldParser fieldParser = new FieldParser("sss,iii,iii");
//        String[] asd = fieldParser.createFemArray();
//        System.out.println(Arrays.toString(asd));

        FieldParser fieldParser = new FieldParser("aaa,uuu");
        String[] array = fieldParser.createFemArray();
        System.out.println(Arrays.toString(array));
//        PersonParser personParser = new PersonParser("yyy,eee");


//        personParser.createPersonArray("" , "" , "");
//
//        String[] aa = personParser.createFemArray();
//        for (String a : aa) {
//            System.out.println(a);
//
//        }


    }
}

