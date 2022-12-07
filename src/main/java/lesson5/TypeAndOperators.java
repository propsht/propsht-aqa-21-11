package lesson5;

import java.util.Arrays;

public class TypeAndOperators {
    public static void main(String[] args) {
        int operand1 = 8;
        double operand2 = 12.6;

        // целое число
        //int result = (int) operand2 / operand1;

        // залишок від ділення
        //int result = (int)  operand2 % operand1;

        //
        double result =  operand2 % operand1;

        System.out.println(result);

        operand1++;

        operand1 = operand1 + 1;

        System.out.println(operand1);

        operand1--;

        System.out.println(operand1);

        operand1+=3;
        operand1 = operand1+3;

        System.out.println(operand1);

        // ! инверсия значения логичная операция
        boolean boolVar = true;
        System.out.println(!boolVar);

        boolean boolVar1 = false;

        System.out.println(boolVar || boolVar1);
        System.out.println(boolVar && boolVar1);

        System.out.println(operand1 < operand2);
        System.out.println(operand1 < operand2 || boolVar1);
        System.out.println(operand1 != operand2 || boolVar1);

        int ternar = operand1 > operand2?1:0;

        //????
        // double ternar = operand1 > operand2?1.0:2.0;

        // не пройде
        // char ternar = operand1 > operand2?1:'c';
        System.out.println(ternar);

        long l = 123_234_234_342L;
        //double l = 123_234_234_342.234d;

        System.out.println(l);

        String st = "Hello world";
        String st2 = "Hello world";

        //st = st + " Some world!!!";

        //порівняння ссілки где лежат данній
        System.out.println(st == st2);
        // сравниваем содержимое
        System.out.println(st.equals(st2));

//        st.formatted();
//        st.getBytes();
//        st.toLowerCase();
//        st.toUpperCase();
//        st.replaceAll();
//        st.replace();
//        st.charAt();
 //       st.compareTo();
//        st.concat();
//        st.trim();
//        st.toString();
//        st.substring();



        int i = st.compareTo(st2);

        System.out.println(i);
        System.out.println((int) 'O');
        System.out.println((int) 'o');

        System.out.println(st2.compareToIgnoreCase(st));

        //System.out.println(st.substring(be));
        System.out.println();



    }
}
