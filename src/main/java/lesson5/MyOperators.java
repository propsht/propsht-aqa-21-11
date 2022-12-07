package lesson5;

public class MyOperators {
    public static void main(String[] args) {


    String st = "Hello world";
    String st2 = "Hello world";

    //st = st + " Some world!!!";

    //порівняння ссілки где лежат данній
        System.out.println(st == st2);
    // сравниваем содержимое
        System.out.println(st.equals(st2));

//       st.formatted();
//        st.getBytes();
//        st.toLowerCase();
//        st.toUpperCase();
//        st.replaceAll();
//        st.replace();
//        st.charAt();
    int i = st.compareTo(st2);
        System.out.println(i);
        System.out.println((int) 'O');
        System.out.println((int) 'o');
    }
}
