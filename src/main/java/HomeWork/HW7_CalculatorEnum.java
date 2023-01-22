package HomeWork;

import lesson5.Operator1;

import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.List;


public class HW7_CalculatorEnum {

    public static void main(String[] args) {

        List<String> inputData = new ArrayList<String>();
        inputData.add("20");
        inputData.add("PLUS");
        inputData.add("-4");
        Float result = calculate(inputData);

        String s = prepareResults(inputData, result);
        System.out.println(s);

    }

    public static String prepareResults(List<String> inputData, Float result) {
        Float operand1 = Float.valueOf(inputData.get(0));
        Float operand2 = Float.valueOf(inputData.get(2));
        Operations operation = Operations.valueOf(inputData.get(1));
        String symbol = "";

        switch (operation) {

            case PLUS: {
                symbol = "+";
                break;
            }
            case MINUS: {
                symbol = "-";
                break;
            }
            case DIV: {
                symbol = "/";
                break;
            }
            case MULT: {
                symbol = "*";
                break;
            }
        }

        return operand1 + " " + symbol + " " + operand2 + " = " + result;

    }

    public static Float calculate(List<String> inputData) {
        Float operand1 = Float.valueOf(inputData.get(0));
        Float operand2 = Float.valueOf(inputData.get(2));
        Operations operation = Operations.valueOf(inputData.get(1));

        Float result;
        switch (operation) {
            case PLUS: {
                result = operand1 + operand2;
                break;
            }
            case MINUS: {
                result = operand1 - operand2;
                break;
            }
            case DIV: {
                if (operand2 == 0) {
                    result = null;

                } else {
                    result = operand1 / operand2;
                }
                break;
            }
            case MULT: {
                result = operand1 * operand2;
                break;
            }

            default:
                result = null;

        }
        return (result);
    }


    enum Operations {
        PLUS,
        MINUS,
        DIV,
        MULT
    }
}





