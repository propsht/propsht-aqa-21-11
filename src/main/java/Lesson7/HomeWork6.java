package Lesson7;
public class HomeWork6 {
    static int[][] sourse;
    int i = 0;
    int j = 0;

    //инициализация и вывод массива
    public static void main(String[] args) {
        int[][] sourse = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 5}
        };

        for (int i = 0; i < sourse.length; i++) {
            for (int j = 0; j < sourse[i].length; j++) {
                System.out.print(sourse[i][j] + " ");
            }
            System.out.println();
        }
        sumsInRows(sourse);
    }

//вычисление сумм
        public static int[] sumsInRows (int[][] sourse) {
        int sumsInRows;

        for (int i = 0; i < sourse.length; i++) {
            sumsInRows = 0;
            for (int j = 0; j < sourse[i].length; j++) {
                sumsInRows = sumsInRows + sourse[i][j];
            }
            System.out.println("Summ in  row " + i + " is " + sumsInRows);
        }

        return new int[0];
        }


}







