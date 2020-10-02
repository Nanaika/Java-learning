package Parser;

public class ParsedData {


    private int numDeleted;
    private String[] arrayFemale;

    /**
     * method initializing field num
     *
     * @param numDeleted
     */
    public void setNumDeleted(int numDeleted) {
        this.numDeleted = numDeleted;
    }

    /**
     * method returns field num
     *
     * @return field numDeleted
     */
    public int getNumDeleted() {
        return numDeleted;
    }


    /**
     * method initializing field array
     *
     * @param arrayFemale
     */
    public void setArrayFemale(String[] arrayFemale) {
        this.arrayFemale = arrayFemale;
    }

    /**
     * method returns field array
     *
     * @return field arrayFemale
     */
    public String[] getArrayFemale() {
        return arrayFemale;
    }
}
