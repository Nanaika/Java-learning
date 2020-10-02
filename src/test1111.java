//import java.util.Arrays;
//public class test1111 {
//
//
//
//
//        /**
//         * A service method that removes all whitespace from the resulting string
//         *
//         * @param names String
//         * @return String without whitespaces
//         */
//        private String clear(String names) {
//
//            String temp = "";
//            for (int i = 0; i < names.length(); i++) {
//                if (names.charAt(i) != ' ') {
//                    temp += names.charAt(i);
//                }
//
//            }
//
//            names = temp;
//            return names;
//        }
//
//        /**
//         * A service method that returns the number of female names from the received string
//         *
//         * @param names String of names
//         * @return Number of female names in string
//         */
//        private int numbFemWords(String names) {
//            String[] tempArray = createArrayNames(names);
//            String tempName;
//            int numbWords = 0;
//
//            for (String s : tempArray) {
//                tempName = s;
//                if (tempName.charAt(tempName.length() - 1) == 'a' ||
//                        tempName.charAt(tempName.length() - 1) == 'e' ||
//                        tempName.charAt(tempName.length() - 1) == 'y' ||
//                        tempName.charAt(tempName.length() - 1) == 'u' ||
//                        tempName.charAt(tempName.length() - 1) == 'i' ||
//                        tempName.charAt(tempName.length() - 1) == 'o') {
//                    numbWords++;
//                }
//            }
//
//            return numbWords;
//        }
//
//        /**
//         * The service method returns the number of words in a string.
//         *
//         * @param names string of names
//         * @return number of words in string
//         */
//        private int numbWords(String names) {
//            int numbWords = 0;
//            for (int i = 0; i < names.length(); i++) {
//                if (names.charAt(i) == ',') {
//                    numbWords++;
//                }
//            }
//            return numbWords;
//        }
//
//        /**
//         * A method that takes a string as an parameter
//         * and returns array.
//         *
//         * @param names string of names
//         * @return array of names
//         */
//        public String[] createArrayNames(String names) {
//            names = clear(names);
//            int count = 0;
//            int index = 0;
//            String name = "";
//            int numbWords = numbWords(names);
//
//            String[] arrayOfNames = new String[numbWords + 1];
//
//            for (int x = count; x < names.length(); x++) {
//                if (names.charAt(x) != ',') {
//                    name += names.charAt(x);
//                } else {
//                    arrayOfNames[index] = name;
//                    index++;
//                    count = x + 1;
//                    name = "";
//                }
//            }
//            arrayOfNames[index] = name;
//            return arrayOfNames;
//
//        }
//
//        /**
//         * A method that takes a string as an parameter and returns array.
//         *
//         * @param names String of names
//         * @return Jagged array with number of deleted names and array of female names
//         */
//        public String[][] createArrayFemNames(String names) {
//            names = clear(names);
//            String[] tempArray = createArrayNames(names);
//            int numbWords = numbFemWords(names);
//
//            String[] arrayFemNames = new String[numbWords];
//            int numDeleted = 0;
//            int index = 0;
//            for (int i = 0; i < tempArray.length; i++) {
//                if (tempArray[i].charAt(tempArray[i].length() - 1) == 'a' ||
//                        tempArray[i].charAt(tempArray[i].length() - 1) == 'e' ||
//                        tempArray[i].charAt(tempArray[i].length() - 1) == 'y' ||
//                        tempArray[i].charAt(tempArray[i].length() - 1) == 'u' ||
//                        tempArray[i].charAt(tempArray[i].length() - 1) == 'i' ||
//                        tempArray[i].charAt(tempArray[i].length() - 1) == 'o') {
//                    arrayFemNames[index] = tempArray[i];
//                    index++;
//                } else {
//                    numDeleted++;
//                }
//            }
//
//
//            String[][] multiArray = new String[2][];
//            multiArray[0] = new String[]{Integer.toString(numDeleted)};
//            multiArray[1] = new String[arrayFemNames.length];
//
//            for (int i = 0, j = 0; i < arrayFemNames.length; i++ , j++) {
//                multiArray[1][i] = arrayFemNames[j];
//
//            }
//            return multiArray;
//        }
//
//
//    }
//
