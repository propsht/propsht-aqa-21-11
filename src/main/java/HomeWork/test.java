package HomeWork;

import java.util.Random;

public class test {

    public static int[] generateArray(int size, int min, int max) {
        int[] result = new int[size];
        Random random = new Random();

        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(min, max + 1);
        }
        return result;
    }

    public static void printArray(int[] array) {
        for (int arrayElement : array) {
            System.out.print(arrayElement + " ");
        }
        System.out.println();
    }

    public static int[] addElementToArray(int[] array, int element) {
        int n = array.length;
        int newArray[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            newArray[i] = array[i];
            newArray[n] = element;
        }
        return newArray;
    }

    public static int[] addElementToArrayBeginning(int[] array, int element) {
        int n = array.length;
        int newArray[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            newArray[0] = element;
            newArray[i + 1] = array[i];
        }
        return newArray;
    }

    public static int[] insertElementInArray(int[] array, int element, int position) {
        int i = 0;
        int n = array.length;
        int[] newArray = new int[n];
        ;

        for (i = 0; i < n; i++) {
            if (i == position) {
                newArray[i] = element;
            } else {
                newArray[i] = array[i];
            }

        }

        return newArray;
    }


}
