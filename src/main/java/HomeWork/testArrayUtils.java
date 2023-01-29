//package HomeWork;
//
//public class testArrayUtils {
//
//
//    // ARRAY INT ___________________________________________________________________________________________________
//
//    // Generate Array
//    public static int[] generateArray(int size, int min, int max) {
//        int[] result = new int[size];
//        Random random = new Random();
//
//        for (int i = 0; i < result.length; i++) {
//            result[i] = random.nextInt(min, max + 1);
//        }
//        return result;
//    }
//
//    // Print the original array
//     DONE А где запятые в выводе?
//    public static void printArray(int[] array) {
//        for (int arrayElement : array) {
//            System.out.print(arrayElement + " ");
//        }
//        System.out.println();
//    }
//
//    // Add Element to Array in the end
//    public static int[] addElementToArray(int[] array, int element) {
//        int n = array.length;
//        int newArray[] = new int[n + 1];
//
//        for (int i = 0; i < n; i++) {
//            newArray[i] = array[i];
//            // Тебе это нужно сделать 1 раз после цикла
//            newArray[n] = element;
//        }
//        return newArray;
//    }
//
//    // Add Element to Array on beginning
//    public static int[] addElementToArrayBeginning(int[] array, int element) {
//        int n = array.length;
//        int newArray[] = new int[n + 1];
//
//        for (int i = 0; i < n; i++) {
//            // DONE Тебе нужно сделать это раз перед циклом
//            newArray[0] = element;
//            newArray[i + 1] = array[i];
//        }
//        return newArray;
//    }
//
//    public static void main(String[] args) {
//        int[] array = generateArray(10, 0, 10);
//        Arrays.stream(array).forEach(c -> System.out.print(c + " "));
//        System.out.println();
//
//        int[] ints = insertElementInArray(array, 44, 3);
//
//        Arrays.stream(ints).forEach(c -> System.out.print(c + " "));
//    }
//
//    // Insert Element to Array on position
//    public static int[] insertElementInArray(int[] array, int element, int position) {
//        int i = 0;
//        int n = array.length;
//        int[] newArray = new int[n + 1];
//
//
//        for (i = 0; i < n + 1; i++) {
//
//            if (i < position) {
//                newArray[i] = array[i];
//            } else if (i == position) {
//                newArray[i] = element;
//            } else {
//                newArray[i] = array[i - 1];
//            }
//
//        }
//
//        return newArray;
//    }
//// END INT ______________________________________________________________________________________________________
//
//
//// ARRAY DOUBLE _________________________________________________________________________________________________
//
//    public static double[] generateArray(int size, double min, double max) {
//        double[] result = new double[size];
//        Random random = new Random();
//
//        for (int i = 0; i < result.length; i++) {
//            result[i] = random.nextDouble(min, max + 1);
//        }
//        return result;
//    }
//
//    public static void printArray(double[] array) {
//        for (double arrayElement : array) {
//            System.out.print(arrayElement + " ");
//        }
//        System.out.println();
//    }
//
//    public static double[] addElementToArray(double[] array, double element) {
//        int n = array.length;
//        double newArray[] = new double[n + 1];
//
//        for (int i = 0; i < n; i++) {
//            newArray[i] = array[i];
//            // Тоже что и для int
//            newArray[n] = element;
//        }
//        return newArray;
//    }
//
//    public static double[] addElementToArrayBeginning(double[] array, double element) {
//        int n = array.length;
//        double newArray[] = new double[n + 1];
//
//        for (int i = 0; i < n; i++) {
//            // Тоже что и для int
//            newArray[0] = element;
//            newArray[i + 1] = array[i];
//        }
//        return newArray;
//    }
//
//    public static double[] insertElementInArray(double[] array, double element, int position) {
//        int i = 0;
//        int n = array.length;
//        double[] newArray = new double[n + 1];
//
//
//        for (i = 0; i < n + 1; i++) {
//
//            if (i < position) {
//                newArray[i] = array[i];
//            } else if (i == position) {
//                newArray[i] = element;
//            } else {
//                newArray[i] = array[i - 1];
//            }
//
//        }
//
//        return newArray;
//    }
//
//// END DOUBLE ___________________________________________________________________________________________________
//
//
//// STRING  __________________________________________________________________________________________________
//
//    // Print the original string
//    public static void printString(String string) {
//        System.out.println(string);
//    }
//
//    // Add Element to String in the end
//    public static String addElementToString(String string, char ch) {
//        string = string + ch;
//        return string;
//    }
//
//    // Add Element to String on beginning
//    // предыдущий метод в принципе ничем не отличается от этого
//    // Просто нужно поменять местами слогаемые и все
//    public static String addElementToStringBeginning(String string, char ch) {
//        String newString = new String();
//
//        for (int i = 0; i < string.length(); i++) {
//            if (i == 0) {
//                newString = newString + ch;
//            }
//            newString += string.charAt(i);
//        }
//        return newString;
//    }
//
//    // Insert Element to String on position
//    // тут идея очень простая
//    // у String есть методы substring(beginningIndex) и  substring(beginningIndex, endIndex)
//    // вот их и можно использовать
//    // Решение в 1 строку, ну или если объявлять переменные - то в 3
//    public static String insertElementInString(String string, char ch, int position) {
//        int n = string.length();
//        String newString = new String();
//        String newString1 = new String();
//        String newString2 = new String();
//
//        for (int i = 0; i < n + 1; i++) {
//
//            if (i < position) {
//                newString1 += string.charAt(i);
//            } else if (i > position) {
//                newString2 += string.charAt(i - 1);
//            } else {
//                newString = newString + ch;
//            }
//
//        }
//        newString = newString1 + newString + newString2;
////        int n = string.length();
////        String newString = new String();
////
////        for (int i = 0; i < n ; i++) {
////            if (i == position) {
////                newString = newString + ch;
////            }
////            newString += string.charAt(i);
////        }
//
//        return newString;
//    }
//
//
//// END STRING ___________________________________________________________________________________________________
//}
