package lesson5;

public class Loops {
    public static void main(String[] args) {
        //for для обхода значений
        //  в консоль вівести от 1 до 100

        //int i = 0;

//        for (int i = 1; i <= 100; i++){
//            System.out.println(i + " ");
//        }
//        for ( i <= 100; i++){
//            System.out.println(i + " ");
//       }

        // каждій 4 єлемент
        for (int i = 1; i <=100; i+=4)
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        System.out.println();

        for (int i = 1; i <=100; i+=4){
                System.out.print(i + " ");
            }


        for (int i = 100; i >= 1; i --){
            System.out.print(i + " ");
        }

        for (int i = 100; i >= 1; i-=4){
            System.out.print(i + " ");
        }

        for (int i = 100; i >= 1; i-=4){
            if (i == 52){
                break;
            } else if (i == 64){
                continue;
            }
            System.out.print(i + " ");

        }













    }
}
