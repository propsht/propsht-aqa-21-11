package lesson_8;

public class Task6 {
    public static void main(String[] args) {
        int[][] array = ArrayUtils.generateArray(5, 8, 0, 50);
        ArrayUtils.printArray(array);
        System.out.println();
        int[][] minMax = getMaxMinFrom2DimArray(array);
        ArrayUtils.printArray(minMax);
    }

    public static int[][] getMaxMinFrom2DimArray(int[][] array){
        int[][] result = new int[array.length][];
        for (int i = 0; i < array.length; i++){
            result[i] = getMaxAndMinFromArray(array[i]);
        }
        return result;
    }

    public static int[] getMaxAndMinFromArray(int[] array){
        int max = array[0];
        int min = array[0];

        for (int element: array){
            if (element < min){
                min = element;
            } else if (element > max){
                max = element;
            }
        }
        return new int[]{max, min};
    }
}
