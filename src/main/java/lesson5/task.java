package lesson5;

public class task {
    public static void main(String[] args) {
        // .. -100] (-100..-50) [-50..0] (0 .. 10) [ 10 ..115) (115 ..

//        int x = 190;
//        int rez = 0;
//
//        // оператор вібора
//        if (x <= -100){
//            rez = 0;
//        } else if ((x > -100) && (x < -50)) {
//            rez = 1;
//        } else if ((x >=-50) && (x<=0)) {
//            rez = 2;
//        } else if ((x > 0) && (x<10)) {
//            rez = 3;
//        } else if ((x>=10) && x< 115) {
//            rez = 4;
//        } else {
//            rez = 5;
//        }
//        System.out.println(rez);



//switch operator  вібора.  проанализировать промежутки

        int x = 10;
        int rez = 0;

        if (x <= 0){
            rez = 0;
        } else if (x==5){
            rez = 1;
        } else if (x == 10){
            rez = 2;
        } else if (x == 20) {
            rez = 3;
        } else if (x==100) {
            rez = 4;
        } else {
            rez = 5;
        }
        System.out.println(rez);

        // если статические данні
        switch (x){
            case 0:{
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
            case 100: {
                rez = 4;
                break;
            }

            default:
                rez = 5;
        }
        System.out.println(rez);
        System.out.printf("Hello %s!%n", "World");


        }
    }
