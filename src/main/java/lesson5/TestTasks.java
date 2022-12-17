package lesson5;

public class TestTasks {
    public static void main(String[] args) {

        int x = 20;
        int y = 18;
        int rez = 0;
//        int i = 0;

        if (x > y) {
            System.out.println("x is greater than y");
        } else if (x == y) {
            System.out.println(" x equal y ");
        } else {
            System.out.println(" y is greater than x");

        }


        // оператор вібора
        if (x <= -100) {
            rez = 0;
        } else if ((x > -100) && (x < -50)) {
            rez = 1;
        } else if ((x >= -50) && (x <= 0)) {
            rez = 2;
        } else if ((x > 0) && (x < 10)) {
            rez = 3;
        } else if ((x >= 10) && (x < 115)) {
            rez = 4;
        } else {
            rez = 5;
        }
        System.out.println("rez = " + rez);

        switch (x) {
            case 0: {
                rez = 0;
                break;
            }

            case 5: {
                rez = 1;
                break;
            }
            case 10: {
                rez = 2;
                break;
            }

            case 20: {
                rez = 3;
                break;
            }

            case 50: {
                rez = 4;
                break;
            }

            default: {
                rez = 5;
            }
        }
        System.out.println("rez = " + rez);

        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println();


        for (int i = 0; i <= 100; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 0; i <= 100; i+=4){
                System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 100; i != 0; i--) {
                System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 100; i != 0; i-- ){
            if (i == 70){
                break;
            } else if ( i == 90) {
                continue;
            }
            System.out.print(i + " ");
        }


    }
}

