package org.brit.lesson8;

public class Task2 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10, -15, 15);
        ArrayUtils.printArray(array);
        int maxIndex = minElementIndex(array);
        System.out.println(maxIndex);
    }

    public static int minElementIndex(int[] array) {
        int index = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

}
