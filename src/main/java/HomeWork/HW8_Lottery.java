package HomeWork;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class HW8_Lottery {
    // we have list from 1 to 36
    // need realize a random sample of six numbers from this sequence and display it on the screen

    static int min = 1;
    static int max = 36;

    public static void main(String[] args) {

        //initialize List (form 1 to 36)
        List<Integer> list = IntStream.rangeClosed(min, max)
                .boxed().toList();
        System.out.println("Original List= "+ list);

// random number List (form 1 to 36) 6 numbers
        int randomNum = 0;
        for (int i = 0; i < 6; i++) {

            randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.print(randomNum + ", ");

        }

    }



}
