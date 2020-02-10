package com.udemy;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; //assumed to be a double by java (you can cast it by putting (double) in front of the expression
        double myDoubleValue = 5d / 3d; //assumed to be the default, you don't need to specify the "d" because it's a literal
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double numberOfPounds = 3;
        double numberOfKilograms = 0.45359237;
        double totalConvertedToKilograms = numberOfPounds * numberOfKilograms;

        System.out.println("Converted kilograms = " + totalConvertedToKilograms);

        double pi = 3.1415927d;

    }
}
