package HomeWork;

import lesson5.Operator1;

import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.List;


public class HW7_CalculatorEnum {

    public static void main(String[] args) {

        List<String> inputData = new ArrayList<String>();
        inputData.add("0");
        inputData.add("PLUS");
        inputData.add("-4");
        Float result = calculate(inputData);

        String s =prepareResults(inputData, result);
        System.out.println(s);

    }

    public static String prepareResults(List<String> inputData, Float result){
        Float operand1 = Float.valueOf(inputData.get(0));
        Float operand2 = Float.valueOf(inputData.get(2));
        Operations operation = Operations.valueOf(inputData.get(1));
        String operationSign = "";

        switch (operation){
            case PLUS ->  operationSign = "+";
            case MINUS -> operationSign = "-";
            case DIV -> operationSign = "/";
            case MULT -> operationSign = "*";
        }

        return  operand1 +  " " + operationSign + " " + operand2 + " = " + result;

    }

    public static Float calculate(List<String> inputData) {
        Float operand1 = Float.valueOf(inputData.get(0));
        Float operand2 = Float.valueOf(inputData.get(2));
        Operations operation = Operations.valueOf(inputData.get(1));




        switch (operation){
            case PLUS -> {
                return operand1 + operand2;

            }
            case DIV -> {
                if (operand2 == 0) {
                    System.out.println("небезпечна операція ");
                    return null;
                } else {
                    return operand1 / operand2;

                }
            }
            case MULT -> {
                return operand1 * operand2;

            }
            case MINUS -> {
                return operand1 - operand2;

            }

        }

    return null;

    }

    enum Operations{
        PLUS,
        MINUS,
        DIV,
        MULT
    }

    List<String> inputData;








//    private  void prepareResults(List<String> inputData, float result) {
//        System.out.println("Original List = " + inputData);
//        System.out.println("Operand 1 = " + inputData.get(0));
//        System.out.println("Operand 2 = " + inputData.get(1));
//        System.out.println("Operation is " + operation);
//
//    }



    //Returns the result of the calculation
//    public static Float calculate(List<String> inputData) {
//        Float operand1 = Float.valueOf(inputData.get(0));
//        Float operand2 = Float.valueOf(inputData.get(2));
//        Operations operation = inputData.get(1);
//
//
////        Double operand1 = Double.valueOf(String.valueOf(inputData.get(0)));
////        Double operand2 = Double.valueOf(String.valueOf(inputData.get(1)));
//        float result = 0;
//
//
//
//        switch (operation) {
//
//            case "+":
//                result = (float) (operand1 + operand2);
//                System.out.println("+");
//                break;
//            case "-":
//                result = (float) (operand1 - operand2);
//                System.out.println("-");
//                break;
//            case "*":
//                result = (float) (operand1 * operand2);
//                System.out.println("*");
//                break;
//
//            case "/":
//                if (operand2 == 0) {
//                    System.out.println("небезпечна операція ");
//                } else {
//                    result = (float) (operand1 / operand2);
//                    System.out.println("DIVIDE");
//                }
//                break;
//
//            case "%":
//                if (operand2 == 0) {
//                    System.out.println("небезпечна операція ");
//                } else {
//                    result = (float) (operand1 % operand2);
//                    System.out.println("%");
//                }
//                break;
//
//
//            default:
//                System.out.println("Error!!!");
//
//        }
//        return(result);
//    }





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
