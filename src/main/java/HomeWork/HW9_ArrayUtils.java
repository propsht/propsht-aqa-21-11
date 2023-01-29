package HomeWork;

import static HomeWork.ArrayUtils.*;


public class HW9_ArrayUtils {
    public static void main(String[] args) {

// ARRAY INT ___________________________________________________________________
//
        int[] array = generateArray(10, -10, 10);
        int element = 33;
        int position = 1;

// _____________________________________________________________________________


// ARRAY DOUBLE ________________________________________________________________

//        double[] array = generateArray((int) 10.3, -10.3, 10);
//        double element = 33.3;
//        int position = 4;
//______________________________________________________________________________

// STRING  ______________________________________________________________________
        String string = "random1234567890";
        Character ch = '?';




// END STRING ___________________________________________________________________



// print the original array

//        System.out.print("Original Array = ");
//        printArray(array);

//        System.out.println("Element = " + element);
//        System.out.println("Position = " + position);
//        System.out.println("Chart = " + ch);



 //Add Element to Array in the end

//        addElementToArray(array, element);
//        System.out.print("Element " + element + " added at the end of array " + "new array = ");
//        printArray(addElementToArray(array, element));


// Add Element to Array on beginning

//        addElementToArrayBeginning(array, element);
//        System.out.print("Element " + element + " added at the beginning of array " + "new array = ");
//        printArray(addElementToArrayBeginning(array, element));


// Insert Element to Array on position

//        insertElementInArray(array, element, position);
//        System.out.print("Element " + element + " added at the array on position " + position + " new array = ");
//        printArray(insertElementInArray(array, element, position));
//        System.out.println();

// Print the original string

        System.out.print("Original String = ");
        printString(string);



// Add Element to String in the end


        System.out.print("Chart " + ch + " added at the end of string " + "new string = ");
        addElementToString(string, ch);
        printString(addElementToString(string, ch));


// Add Element to String on beginning


        System.out.print("Chart " + ch + " added at the beginning of string " + "new string = ");
        addElementToStringBeginning(string, ch);
        printString(addElementToStringBeginning(string, ch));

// Insert Element to String on position


        System.out.print("Chart " + ch + " added at the string on position " + position + " new string = ");
        insertElementInString(string, ch, position);
        printString(insertElementInString(string, ch, position));



    }


}
