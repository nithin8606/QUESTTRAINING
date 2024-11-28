package com.quest.oops.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {

    // throw exceptions
    public static void Excs() throws ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException {
        Scanner scanner = new Scanner(System.in);

        try {
//            ArithmeticException
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("Division result: " + result);
            //ArrayIndexOutOfBoundsException
            int[] array = {56, 40, 32, 16, 8};
            System.out.print("Enter an index (0-4): ");
            int index = scanner.nextInt();
            System.out.println("Array value at index " + index + ": " + array[index]);
            // NullPointerException
            String str = null;
            System.out.println("String length: " + str.length());

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a null value.");
        } finally {
            System.out.println("Exception handling is complete.");
        }
    }
    public static void main(String[] args) {

        Excs();
    }
}
//throw keyword is used to explicitly throw an exception in Java.
//        throws keyword is used in a method declaration to indicate that the method may throw exceptions during execution
// finally block is part of Java’s exception handling mechanism. It is used to execute a block of code regardless of whether an exception occurs or not.
//final keyword is used to define constants or to enforce non-modifiability in Java. It can be applied to:
//
//a) Variables
//A final variable’s value cannot be changed after it is initialized.
//A final class cannot be extended.
//Aspect	Checked Exception	Unchecked Exception
//Declaration Needed?	Yes	No
//        Examples	IOException, SQLException	NullPointerException, ArithmeticException
//Mandatory Handling?	Yes (use try-catch or throws)	No
//try: Contains the code that might throw an exception.
//        catch: Catches and handles the exception.
//finally: Contains cleanup code that executes regardless of whether an exception occurs.
//throw: Used to explicitly throw an exception.
//        throws: Declares exceptions that a method might throw.
//Abstraction is used to hide the implementation details of the operations (Addition, Subtraction, Division) behind the Operation interface.
//Polymorphism allows the same method (performOperation) to perform different behaviors depending on the class (addition, subtraction, or division).
//Inheritance is used by having concrete classes implement the Operation interface, effectively inheriting the method signatures.
//Encapsulation is demonstrated by grouping the logic of each operation into its respective class, hiding internal implementation details.
//Exception Handling ensures that potential runtime errors like division by zero and null reference access are caught and handled appropriately.
//Interface is used to define a contract for operations, enabling polymorphic behavior and loose coupling in the design.