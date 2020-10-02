public class Printer {

    private String names = "";
    private String[] arrayOfNames = new String[5];
    private char[] symbOfNames = new char[28];

    public Printer(String names) {
        this.names = names;
        ConvertToArray();
    }

    private void ConvertToArray() {
        for (int i = 0, j = 0; i < names.length(); i++ , j++) {
            this.symbOfNames[j] = names.charAt(i);
        }
        createNames();
    }

    private void createNames() {

        int count = 0;
        int index = 0;
        String name = "";

        for (int i = count; i < symbOfNames.length; i++) {
            if (symbOfNames[i] != ',') {
                name += symbOfNames[i];
            } else {
                this.arrayOfNames[index] = name;
                index++;
                count = i + 1;
                name = "";
                continue;
            }
        }
        this.arrayOfNames[index] = name;
        PrintArrayOfNames();
    }


    private void PrintArrayOfNames() {

        for (String index : arrayOfNames) {
            System.out.println(index);
        }
    }
}
