package Calculator;

import com.sun.jdi.Bootstrap;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Timur timur1 = new Timur(2,10, "Chilanzar");
//        Timur timur2 = new Timur(5,20,"Oybek");
//        Pavel pavel1 = new Pavel(3,0, "Chilanzar");
//        Pavel pavel2 = new Pavel(14,100,"Moscow");
//
//
//
//
//        Human[] array = {timur1, timur2, pavel1, pavel2};
//        for (Human chel : array) {
//            System.out.println(chel.place() + chel.sleep() + chel.walk());
//
//        }


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String as;
//
//        do {
//            as = br.readLine();
//            System.out.println(as);
//        } while (!as.equals("q"));
//        br.close();
//
//        String greeting = "Hello World My Friend!";
//        System.err.println(greeting);
//        for (int i = 0; i < greeting.length(); i++) {
//            System.err.print("=");
//        }
//        System.out.println("\n");
//
//        FileInputStream andromeda = new FileInputStream("Andromeda.data");
//        FileReader fr = new FileReader("Andromeda.data");
//        int sym;
//        do {
//            sym = fr.read();
//            System.out.print((char) sym);
//
//        } while (sym != -1);
//        System.out.println("\n");
//        System.out.println((char) sym);
//        fr.close();


//        FileInputStream fis = new FileInputStream("Andromeda.data");
//
//        StringBuilder bufferString = new StringBuilder();
//
//
//        int buf;
//        do {
//            buf = fis.read();
//            bufferString.append((char) buf);
//            System.out.print((char) buf);
//        } while (buf != -1);
//
//        fis.close();
//        System.out.println();
//        System.out.println(buf);
//        System.out.println();
//        System.out.println(bufferString.toString());
//
//
//        FileWriter fw = null;
//
//        {
//
//            try {
//                fw = new FileWriter("login.txt");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            do {
//                fw.write(bufferString.toString());
//            } while (bufferString.equals(-1));
//
//            fw.close();
//        }
//
//
//        String maxString = "Login:Jolies\r\nPass:1sdf4324\r\nLogin:Moore\r\nPass:sdjfp33492342\r\nLogin:Joseph\r\nPass:2390\nLogin:zloy2\nPass:osd234s";
//
//        int num = 0;
//        for (int i = 0; i < maxString.length(); i++) {
//
//            if (maxString.charAt(i) == ':') {
//                num++;
//
//            }
//        }
//
//
//
//        StringBuilder stringBuilder = new StringBuilder("Login:Jolies\n" +
//                "Pass:1sdf4324\n" +
//                "Login:Moore\n" +
//                "Pass:sdjfp33492342\n" +
//                "Login:Joseph\n" +
//                "Pass:2390\n" +
//                "Login:zloy2\n" +
//                "Pass:osd234s");
//
//        char[] charArray = new char[stringBuilder.toString().length()];
//        stringBuilder.getChars(0 , stringBuilder.toString().length() , charArray , 0);
//
//
//        for (char a : charArray
//        ) {
//            System.out.print(a);
//        }
//
//
//        String temp = "";
//        int index = 0;
//
//        String[] tempArray = new String[num];
//
//        for (int i = 0; i < charArray.length; i++) {
//            if (charArray[i] != '\n') {
//                temp += charArray[i];
//
//            } else {
//                tempArray[index] = temp;
//                index++;
//
//                temp = "";
//                continue;
//            }
//            tempArray[index] = temp;
//        }
//
//        System.out.println("\n");
//        System.out.println(Arrays.toString(tempArray));
//
//
//        String[] tempArrayLogin = new String[num / 2];
//        String[] tempArrayPass = new String[num / 2];
//        String cut = "";
//        int indexLogin = 0;
//        int indexPass = 0;
//
//        for (int i = 0; i < tempArray.length; i++) {
//            if (tempArray[i].startsWith("Login")) {
//                cut = tempArray[i].substring(6);
//                tempArrayLogin[indexLogin] = cut;
//                indexLogin++;
//            }
//
//            if (tempArray[i].startsWith("Pass")) {
//                cut = tempArray[i].substring(5);
//                tempArrayPass[indexPass] = cut;
//                indexPass++;
//            }
//
//        }
//
//        System.out.println(Arrays.toString(tempArrayLogin));
//        System.out.println(Arrays.toString(tempArrayPass));
//
//

//
//        String temp = "";
//        String[] arrayLogin = new String[num / 2];
//        String[] arrayPass = new String[num / 2];
//        int indexLog = 0;
//        int indexPass = 0;
//        for (int i = 0; i < maxString.length(); i++) {


//            if (maxString.charAt(i) == '') {
//                temp += maxString.charAt(i);
//            } else {
//
//                if (temp.charAt(0) == 'L'){
//                    arrayLogin[indexLog] = temp;
//                    indexLog++;
//                }
//                if (temp.charAt(0) == 'P'){
//                    arrayPass[indexLog] = temp;
//                    indexPass++;
//                }
//
//                continue;
//            }
//
//
//        }




    }
}
//
