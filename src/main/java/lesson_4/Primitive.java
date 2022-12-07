package lesson_4;

public class Primitive {
    public static void main(String[] args) {
        //int integer;
        int integer = 50;
        double doubleVar = 45.8;

        //long rez = integer + doubleVar;
        //long rez = integer + (long)doubleVar;
        double rez = integer + doubleVar;
        System.out.println(rez);

        char ch = 'y';
        System.out.println(ch);
        System.out.println((int)ch);
    }
}
