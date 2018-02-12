package com.pluralsight.typeconversion;

public class Main {

    public static void main(String[] args) {
	    float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        // incompatible types = possible loss of conversion
        // short result = longVal;
        // need to use an explicit cast
        short result1 = (short)longVal;
        // cast the result of subtraction into a short
        short result2 = (short)(byteVal - longVal);
        // need to specify the result3 is the largest option
        double result3 = longVal - doubleVal;
        long result4 = (long)(shortVal - longVal + floatVal + doubleVal);

        System.out.println("Success");
    }
}
