package com.udemy;

//"if the years REMAINDER of x equals 0"
public class Main {

    public static void main(String[] args) {

//        System.out.println(isLeapYear(-1600));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2017));
//        System.out.println(isLeapYear(2000));
//        System.out.println(isLeapYear(1924));
//        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(2020));

    }

    public static boolean isLeapYear(int year) {

        if (year <= 1 || year >= 9999) {

            return false;

        } if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {

            return true;

        } if (year % 4 == 0 && year % 100 == 0 && year % 400 !=  0) {

            return false;

        } if (year % 4 == 0) {

            return true;

        }

        return false;

    }


}
