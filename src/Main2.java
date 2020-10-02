import java.util.Arrays;

public class Main2 {


    public static void main(String[] args) {

        for (String option : args) {
            if (option.equals("-help")) {
                System.out.println("Help\n" +
                        "--------------------------------\n" +
                        "         .:'\n" +
                        "      __ :'__\n" +
                        "   .'`__`-'__``.\n" +
                        "  :__________.-'\n" +
                        "  :_________:\n" +
                        "   :_________`-;\n" +
                        "    `.__.-.__.'\n" +
                        "Author: Timur\n" +
                        "Version: 1.0 Betta.");

            } else if (option.equals("-c")) {
                System.out.println("Option -c has been worked");
            } else if (option.equals("-d")) {
                System.out.println("Option -d has been worked");
            }
        }
    }










//        int argC =  Arrays.binarySearch(args, "-c");
//        int argD =  Arrays.binarySearch(args, "-d");
//        int argHelp =  Arrays.binarySearch(args, "-help");
//        int argProgram =  Arrays.binarySearch(args, "program");
//
//
//        String comC = args[argC];
//        String comD = args[argD];
//        String comHelp = args[argHelp];
//        String comProgram = args[argProgram];



//        switch (args[2]){
//            case "-c":
//                break;
//            case "-d":
//                break;
//            case "-help":
//                System.out.println("Help\n" +
//                        "--------------------------------\n" +
//                        "         .:'\n" +
//                        "      __ :'__\n" +
//                        "   .'`__`-'__``.\n" +
//                        "  :__________.-'\n" +
//                        "  :_________:\n" +
//                        "   :_________`-;\n" +
//                        "    `.__.-.__.'\n" +
//                        "Author: Timur\n" +
//                        "Version: 1.0 Betta.");
//                break;
//            case "command":
//                break;
//            default:
//                break;
//        }







    public void main22() {

//        String[] namesRus = new String[5];
//        namesRus[0] = "Тимур";
//        namesRus[1] = "Петя";
//        namesRus[2] = "Вася";
//        namesRus[3] = "Павел";
//        namesRus[4] = "Руслан";
//
//
//        String[] namesEng = new String[5];
//        namesEng[0] = "John";
//        namesEng[1] = "Max";
//        namesEng[2] = "Leon";
//        namesEng[3] = "Chris";
//        namesEng[4] = "Ada";


        /*
        TODO Exchange the content of arrays
        */
//        String[] tempRus = Arrays.copyOf(namesRus , namesRus.length);
//        namesRus = Arrays.copyOf(namesEng , namesEng.length);
//        namesEng = Arrays.copyOf(tempRus , tempRus.length);





        /*
        TODO copy of first and last programm args in new array
        * */
//        String[] progArgs = new String[args.length];
//        progArgs[0] = args[0];
//        progArgs[progArgs.length - 1] = args[args.length - 1];





    }
}




