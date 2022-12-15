package lessons_6;

public class MyArrays {
    public static void main(String[] args) {
//      массив -   проиндексированная последовательность однотипных элементов с известным количеством элементов
        // одномерный массив типа инт
        // cразу с значениями
        int [] array = {1,4,6,7,8,2,10};
        // тут только  сколько ячеек
        int [] array1 = new int [10];

// фор и
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }



        // фор ич
        // arrayElement = (int i = 0; i < array.length; i++)
        for (int arrayElement : array){
            System.out.println(arrayElement + " ");
        }

    }
        // додати 2 элемента в конец массива

        //функция = процедура = метод

        private static int[] addElementsToArray(int[] array, int a, int b){
            int arrayLen = array.length;

            int[] rez = new int[array.length + 2];

            for (int i = 0; i<array.length; i++){
                rez[i] = array[i];
            }

            int rezLen = rez.length;


            rez[rezLen - 2] = a;
            rez[rezLen - 1] = b;
            return rez;

            // int[] rez = addElementToArray(array, a:2, b:66);



        }












}
