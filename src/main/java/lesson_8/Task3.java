package org.brit.lesson8;

public class Task3 {
    public static void main(String[] args) {
        String[] array = { "Каждый "," охотник "," желает "," знать "," где "," сидит "," фазан "};
        ArrayUtils.printArray(array);
        reverseArray(array);
        ArrayUtils.printArray(array);

    }

    public static void reverseArray(String[] array){
        for (int i = 0; i < array.length / 2; i++){
            String left = array[i];
            String right = array[array.length - 1 - i];
            array[array.length - 1 - i] = left;
            array[i] = right;
        }
    }
}
