package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class draft {


    public class HW7_CalculatorEnum {

        List<String> inputData;
        static String operation = "/";


        public static void main(String[] args) {

            List<String> inputData = new ArrayList<>();

            inputData.add("4");
            inputData.add("-1");

            System.out.println("Original List = " + inputData);
            System.out.println("Operand 1 = " + inputData.get(0));
            System.out.println("Operand 2 = " + inputData.get(1));
            System.out.println("Operation is " + operation);


            int operand1 = Integer.valueOf(inputData.get(0));
            int operand2 = Integer.valueOf(inputData.get(1));
            int result = 0;


            switch (operation) {

                case "+":
                    result = (operand1 + operand2);
                    break;
                case "-":
                    result = (operand1 - operand2);
                    break;
                case "*":
                    result = (operand1 * operand2);
                    break;

                case "/":
                    if (operand2 == 0) {
                        System.out.println("небезпечна операція ");
                    } else {
                        result = (operand1 / operand2);
                    }
                    break;

                case "%":
                    if (operand2 == 0) {
                        System.out.println("небезпечна операція ");
                    } else {
                        result = (operand1 % operand2);
                    }
                    break;


                default:
                    System.out.println("Error!!!");

            }
            System.out.println(result);
        }
    }

    //Returns the result of the calculation
//    public static Integer calculate(List<String> args) {
//
//
//
//
//        return (result);
//    }
//}

//Function that prepares a string for output (operat1 + operation + operant2 = result)
//    public String prepareResults(List<String> inputData, Float result){
//        operant1 + operation + operant2 + " = " + result


//        switch (operation) {
//
//            case "+": {
//                System.out.println("PLUS");
//                break;
//            }
//
//            case "-": {
//                System.out.println("MINUS");
//                break;
//            }
//
//            case "*": {
//                System.out.println("MULTIPLY");
//                break;
//            }
//
//            case "/": {
//                if (operand2 == 0) {
//                    System.out.println("небезпечна операція ");
//                } else {
//                    System.out.println("DIVIDE");
//                }
//                break;
//            }
//
//            case "%": {
//                if (operand2 == 0) {
//                    System.out.println("небезпечна операція ");
//                } else {
//                    System.out.println("MODULO%");
//                }
//                break;
//            }
//
//            default: {
//                System.out.println("Error!!!");
//            }
//        }

//
//        enum operation {
//            +,
//            -,
//            *,
//            /,
//            %,
//        }


//
//
//
//        switch (daOfWeek){
//            case SATURDAY:
//            case SUNDAY:{
//                System.out.println("This is weekend");
//            }
//            case TUESDAY:{
//                System.out.println("This is fish day");
//            }
//
//            case WEDNESDAY:{
//                System.out.println("This is week day");
//                break;
//            }
//
//            case FRIDAY:
//            case MONDAY:
//
//            case THURSDAY:
//            default:{
//                System.out.println("home day");
//            }
//
//        }
//
//
//
//
//
//
//
//
//
//





}
