package lesson_8;

public class Task4 {
    public static void main(String[] args) {
        int n = 100;
        int[] array = ArrayUtils.generateArray(n, 0, n);
        ArrayUtils.printArray(array);
        int[] evenElements = getEvenElements(array);
        ArrayUtils.printArray(evenElements);

    }

    public static int[] getEvenElements(int[] array){
        int countOgEvenDigits = countOfEvenElements(array);
        int[] result = new int[countOgEvenDigits];
        int i = 0;
        for (int element: array){
            if (isEven(element)){
                result[i] = element;
                i++;
            }
        }
        return result;
    }

    public static int countOfEvenElements(int[] array){
        int count = 0;
        for (int element: array){
            if (isEven(element)){
                count++;
            }
        }
        return count;
    }

    public static boolean isEven(int digit){
        return digit % 2 == 0;
    }
}
