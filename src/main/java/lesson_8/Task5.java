package org.brit.lesson8;

public class Task5 {
    public static void main(String[] args) {
        String[][] array = new String[3][6];
        String[] letters = {"a", "b", "c"};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = letters[i] + (j + 1);
            }
        }

        ArrayUtils.printArray(array);

    }
}
