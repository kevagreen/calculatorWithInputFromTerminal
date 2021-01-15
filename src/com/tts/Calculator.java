package com.tts;


public class Calculator {
    public double numOne;
    public double numTwo;

    public Calculator() { }


    public double add(double numOne, double numTwo) { return numOne + numTwo; }

    public double subtract(double numOne, double numTwo) { return numOne - numTwo; }

    public double multiply(double numOne, double numTwo) { return numOne * numTwo; }

    public double divide(double numOne, double numTwo) { return Math.floorDiv((int) numOne, (int) numTwo); }

    public double square(double numOne) { return Math.pow(numOne, 2); }
}

