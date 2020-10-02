package HomeFile;

import java.io.FileWriter;
import java.io.IOException;

public class FiledataRecord {

    public void recordLogin() {

        FileParser fileparser = new FileParser();
        String[] arrayLogin = fileparser.createArrayLogin();


        try {
            try {
                FileWriter fw = new FileWriter("logins5555.txt");


                for (int i = 0; i < arrayLogin.length; i++) {
                    if (arrayLogin[i].length() < 5) {
                        fw.write("");
                        fw.write("\n");

                    } else {
                        fw.write(arrayLogin[i]);
                        fw.write("\n");
                    }
                }

                fw.flush();
                fw.close();

            } catch (IOException e) {
                System.out.println("File not found!");
            }

        } catch (Exception e) {
            System.out.println("Something go wrong!");
        }


    }


    public void recordPass() {

        FileParser fileparser = new FileParser();
        String[] arrayPass = fileparser.createArrayPass();


        try {
            try {
                FileWriter fw = new FileWriter("Pass.txt");


                for (int i = 0; i < arrayPass.length; i++) {
                    if (arrayPass[i].length() < 5) {
                        fw.write("");
                        fw.write("\n");

                    } else {
                        fw.write(arrayPass[i]);
                        fw.write("\n");
                    }

                }

                fw.flush();
                fw.close();

            } catch (IOException e) {
                System.out.println("File not found!");
            }

        } catch (Exception e) {
            System.out.println("Something go wrong!");
        }


    }


}
