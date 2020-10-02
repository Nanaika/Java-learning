public class Test {


    private String names = "";

    public Test(String names) {
        this.names = names;
        createNames();
    }


    private void createNames() {

        int count = 0;
        int index = 0;
        String name = "";
        int numbOfWords = 0;

        char[] symbOfNames = new char[names.length()];

        for (int i = 0, j = 0; i < names.length(); i++ , j++) {
            symbOfNames[j] = names.charAt(i);
            if (symbOfNames[j] == ',') {
                numbOfWords++;
            } else {
                continue;
            }
        }

        String[] arrayOfNames = new String[numbOfWords + 1];

        for (int x = count; x < symbOfNames.length; x++) {
            if (symbOfNames[x] != ',') {
                name += symbOfNames[x];

            } else {
                arrayOfNames[index] = name;
                index++;
                count = x + 1;
                name = "";

            }
        }
        arrayOfNames[index] = name;
        for (String print : arrayOfNames) {
            System.out.println(print);
        }


    }
}



