package lessons_6;

public class MyString {
    public static void main(String[] args) {
//       var string  = "Hello world!";
        String string  = "Hello world!";
//выводим в столбец все символы фор контролируем шаг


//        //выводим в столбец все символы c заду наперед
//        for (int i = string.length()-1; i>=0; i--) {
//            char c = string.charAt(i);
//            System.out.println(c);
//        }
////когда у нас есть точка выхода пока ждем что-то сделается не знаем сколько раз делать
//        int j = 0;
//        while(j < string.length()) {
//            char c = string.charAt(j);
//            System.out.println(c);
//            j++;
//        }


            for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(string.length() - 1 - i);
            System.out.println(c);
        }
//            бесконечные циклы
//            for (;;){
//
//            }
//            while (thue){
//
//            }

            Integer integer = 5;
            int intVar;
            Double doubleVal;
            Character character;

            intVar = integer;
            intVar++;
            integer = intVar;




    }
}
