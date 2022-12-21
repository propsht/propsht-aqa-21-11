package lessons_6;

public class Hw3Polindome {
    public static void main(String[] args) {
        String initialData = "кит на морі романтик";
        String firstRow = "";
        String secondRow = "";

        System.out.println("Original Data= " + initialData);
        String newData = initialData.replaceAll(" ", "");
        System.out.println("Without space= " + newData);

        for (int i = 0; i <= (newData.length() / 2); i++) {
            char c = newData.charAt(i);
            firstRow +=  c;
        }
        System.out.println("First part = " + firstRow);

        for (int i = newData.length() -1; i >= (newData.length() / 2); i--) {
            char c = newData.charAt(i);
            secondRow +=  c;
        }
        System.out.println("Second part = " + secondRow);

        System.out.println();

        if (firstRow.equals(secondRow)){
            System.out.println("String Palindrome");
        } else {
            System.out.println("String  NOT Palindrome");
        }

    }
}