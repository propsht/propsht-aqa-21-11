package Lesson7;

import java.time.DayOfWeek;

public class MyEnum {
    public static void main(String[] args) {
        // тип данніх переменная = присваиваем значение
        DayOfWeek daOfWeek = DayOfWeek.SUNDAY;

        switch (daOfWeek){
            case SATURDAY:
            case SUNDAY:{
                System.out.println("This is weekend");
            }
            case TUESDAY:{
                System.out.println("This is fish day");
            }

            case WEDNESDAY:{
                System.out.println("This is week day");
                break;
            }

            case FRIDAY:
            case MONDAY:

            case THURSDAY:
            default:{
                System.out.println("home day");
            }

        }

        DayOfWeek [] values = DayOfWeek.values();
        for (DayOfWeek day: values){
            System.out.println(day.name() + "==>" + day.ordinal());
        }



        enum DayOfWeek {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SANDAY,


        }


    }
}
