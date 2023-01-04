package org.brit.lesson8;

public class Task1 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10, -10, 40);
        ArrayUtils.printArray(array);
        changeArray(array);
        ArrayUtils.printArray(array);
    }

    public static void changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
    }


}
