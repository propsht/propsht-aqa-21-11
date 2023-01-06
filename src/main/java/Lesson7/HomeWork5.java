package Lesson7;

public class HomeWork5 {
 public static void main(String[] args) {
        int i = 0, j = 0;
        int[][] array = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        System.out.print("Major Diagonal in Matrix= ");
        for (i = 0; i < array.length; i++) {
            System.out.print( + array[i] [i] + " ");

        }

        System.out.println();
        System.out.print("Minor Diagonal in Matrix= ");

        for (i = 0, j = array.length-1; i < array.length && j >= 0; i++, j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

    }





}
