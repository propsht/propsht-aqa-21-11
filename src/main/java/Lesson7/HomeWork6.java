package Lesson7;
public class HomeWork6 {
    static int[][] sourse;
    int i = 0;
    int j = 0;
    static int[] sumsInRows;



    //вычисление сумм
    public static int[] sumsInRows (int[][] sourse) {

        int[] sumsInRows = new int[sourse.length];


        for (int i = 0; i < sourse.length; i++) {
            sumsInRows[i] = 0;
            for (int j = 0; j < sourse[i].length; j++) {
                sumsInRows[i] = sumsInRows[i] + sourse[i][j];
            }
           System.out.print(sumsInRows[i] + ", " );


        }

        //return new int[]{sumsInRows[i]};
        return sumsInRows;


    }



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
        System.out.print("Sums in  rows  are = ");
        sumsInRows(sourse);

    }
}








