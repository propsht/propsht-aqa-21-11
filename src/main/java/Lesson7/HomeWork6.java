package Lesson7;

public class HomeWork6 {
    public static void main(String[] args) {

        // i=строка j=столбец
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 5}
        };


        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array[i].length - 1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


//        int[] sumsInRows(array)




//    public static int[] sumsInRows (int[][] sourse) {
//
//            for (int i = 0; i <= array.length - 1; i++) {
//            int sumsInRows = 0;
//            for (int j = 0; j <= array[i].length - 1; j++)
//                sumsInRows = sumsInRows + array[i][j];
//            System.out.print(sumsInRows + " ");
//
//        }
//    }

   }
}

