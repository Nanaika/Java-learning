public class test1 {

    private String names;

    public void inputStringOfNames(String names) {
        this.names = names;
        createArrayOfNames();
    }

    private void createArrayOfNames() {

        int count = 0;
        int index = 0;
        String name = "";
        int numbOfWords = 0;

        for (int i = 0, j = 0; i < names.length(); i++ , j++) {
            if (names.charAt(i) == ',') {
                numbOfWords++;
            }
        }

        String[] arrayOfNames = new String[numbOfWords + 1];

        for (int x = count; x < names.length(); x++) {
            if (names.charAt(x) != ',') {
                name += names.charAt(x);
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






