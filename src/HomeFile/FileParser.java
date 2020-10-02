package HomeFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileParser {


    private String[] createStringArray() {

        String strFromFile = readFile();
        String[] tempArray = new String[lengthArray(strFromFile)];
        char[] charArray = createCharArray();

        String temp = "";
        int index = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '\n' && charArray[i] != '\r') {
                temp += charArray[i];

            } else if (charArray[i] == '\n') {
                tempArray[index] = temp;
                index++;
                temp = "";
                continue;

            } else if (charArray[i] == '\r') {
                continue;
            }
            tempArray[index] = temp;

        }


        return tempArray;
    }


    private char[] createCharArray() {

        String strFromFile = readFile();
        StringBuilder stringBuilder = new StringBuilder(strFromFile);

        char[] charArray = new char[stringBuilder.toString().length()];
        stringBuilder.getChars(0 , stringBuilder.toString().length() , charArray , 0);

        return charArray;
    }


    private int lengthArray(String str) {

        str = readFile();
        int num = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ':') {
                num++;

            }
        }
        return num;
    }


    private String readFile() {

        String temp = "";

        try {
            FileInputStream fin = new FileInputStream("Andromeda.data");
            int sym;
            do {
                sym = fin.read();
                temp += (char) sym;
            } while (sym != -1);
            fin.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!" + "\n" + "Check directory!");

        } catch (IOException e) {
            System.out.println("I/O error");
        }

        return temp;
    }


    public String[] createArrayLogin() {

        String strFromFile = readFile();
        String[] tempArray = createStringArray();


        String[] tempArrayLogin = new String[lengthArray(strFromFile) / 2];
        String cut = "";
        int indexLogin = 0;

        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i].startsWith("Login")) {
                cut = tempArray[i].substring(6);
                tempArrayLogin[indexLogin] = cut;
                indexLogin++;
            }
        }
        return tempArrayLogin;

    }


    public String[] createArrayPass() {

        String strFromFile = readFile();
        String[] tempArray = createStringArray();


        String[] tempArrayPass = new String[lengthArray(strFromFile) / 2];
        String cut = "";
        int indexLogin = 0;

        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i].startsWith("Pass")) {
                cut = tempArray[i].substring(5);
                tempArrayPass[indexLogin] = cut;
                indexLogin++;
            }
        }


        return tempArrayPass;
    }


}