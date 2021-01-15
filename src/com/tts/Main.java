package com.tts;

import java.util.Scanner;

public class Main {
    //global variables
    private static final Scanner input = new Scanner(System.in);
    private static double numOne;
    private static double numTwo;
    private static final Calculator mainCalculator = new Calculator();
    private static final MagicCalculator magicCalculator = new MagicCalculator();

    public static void main(String[] args) { print(); }

    public static void print() {
        String operator;
        System.out.println("Select an operator +,-,*,/, !, enter 2 to square a number, enter t for tangent, enter s to get the sine, enter c to get cosine");
        System.out.println(", p to get the pi to the nth power, or enter a to get absolute value");
        operator = input.next();

        switch (operator) {
            case "+":
                System.out.println("Enter two numbers");
                numOne = input.nextDouble();
                numTwo = input.nextDouble();
                System.out.println("Your numbers added equals " + mainCalculator.add(numOne, numTwo));
                break;
            case "-":
                System.out.println("Enter two numbers");
                numOne = input.nextDouble();
                numTwo = input.nextDouble();
                System.out.println("Your numbers subtracted equals " + mainCalculator.subtract(numOne, numTwo));
                break;
            case "*":
                System.out.println("Enter two numbers");
                numOne = input.nextDouble();
                numTwo = input.nextDouble();
                System.out.println("Your numbers multiplied equals " + mainCalculator.multiply(numOne, numTwo));
                break;
            case "/":
                System.out.println("Enter two numbers");
                numOne = input.nextLong();
                numTwo = input.nextLong();
                System.out.println("Your numbers divided equals " + mainCalculator.divide(numOne, numTwo));
                break;
            case "!":
                System.out.println("Enter a number greater than 20");
                numOne = input.nextLong();
                System.out.println("The factorial of your number is " + magicCalculator.factorial((int) numOne));
                break;
            case "2":
                System.out.println("Enter one number to square");
                numOne = input.nextLong();
                System.out.println("Your number squared equals " + mainCalculator.square(numOne));
                break;
            case "s":
                System.out.println("Enter one number");
                numOne = input.nextLong();
                System.out.println("The sine of your number is " + magicCalculator.sine(numOne));
                break;
            case "c":
                System.out.println("Enter one number");
                numOne = input.nextLong();
                System.out.println("The cosine of your number is " + magicCalculator.cosine(numOne));
                break;
            case "t":
                System.out.println("Enter one number");
                numOne = input.nextLong();
                System.out.println("The tangent of your number is " + magicCalculator.tangent(numOne));
                break;
            case "p":
            System.out.println("Enter one number");
            numOne = input.nextLong();
            System.out.println("pi raised to the power of " + (int)numOne + " is " + magicCalculator.getPi(numOne));
            break;
            case "a":
                System.out.println("Enter a negative number");
                numOne = input.nextDouble();
                System.out.println("The absolute value of your number is " + magicCalculator.absolute(numOne));
                break;
        }
    }


}//end main
