package lesson5;

public class Hw4Calculator {
    public static void main(String[] args) {
        String operation = "/";
        int operand1 = 3;
        int operand2 = 0;

        System.out.println("operand1 = " + operand1);
        System.out.println("operand2 = " + operand2);
        System.out.println("operation = \" " + operation + " \"");


        switch (operation) {

            case "+": {
                System.out.println("result = " + (operand1 + operand2));
                break;
            }

            case "-": {
                System.out.println("result = " + (operand1 - operand2));
                break;
            }

            case "/": {
                if (operand2 == 0) {
                    System.out.println("небезпечна операція ");
                } else {
                    System.out.println("result = " + (operand1 / operand2));
                }
                break;
            }

            case "*": {
                System.out.println("result = " + (operand1 * operand2));
                break;
            }

            case "%": {
                System.out.println("result = " + (operand1 % operand2));
                break;
            }

            default: {
                System.out.println("Error!!!");
            }

        }


    }

}

