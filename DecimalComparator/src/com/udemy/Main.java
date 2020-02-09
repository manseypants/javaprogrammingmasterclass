package com.udemy;

public class Main {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, 3.175));




    }

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {

/*        String xVal = Double.toString(Math.abs(x));
        String yVal = Double.toString(Math.abs(y));

        double xValue = Double.valueOf(String.valueOf(Math.abs(x)).substring(0,4));

        double yValue = Double.valueOf(String.valueOf(Math.abs(y)).substring(0,4));

        System.out.println(xValue);
        System.out.println(yValue);*/


        if(Math.floor(Math.abs(x)*1000)/1000 == Math.floor(Math.abs(y)*1000)/1000) {

            return true;

        } else {

            return false;

        }

    }

}
