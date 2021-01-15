package com.tts;


import java.math.BigInteger;

public class MagicCalculator extends Calculator {
    //used to declare datatype of MagicCalculator
    public MagicCalculator() {

    }

    //sine
    public double sine(double num) {
        num = Math.toRadians(num);
        return Math.sin(num);
    }

    //cosine
    public double cosine(double num) {
        num = Math.toRadians(num);
        return Math.cos(num);
    }

    //tangent
    public double tangent(double num) {
        num = Math.toRadians(num);
        return Math.tan(num);
    }

    //factorial
    public BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= number; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    //pi
    public double getPi(double num){ return num = Math.pow(Math.PI, num); }

    //absolute value
    public double absolute(double num){ return  num = Math.abs(num); }
}
