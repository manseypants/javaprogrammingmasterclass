package com.udemy;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-222));
        System.out.println(isPalindrome(12321));

    }

    public static boolean isPalindrome(int number) {

        number = Math.abs(number);
        int reverse = 0;
        int originalNumber = number;
        int lastDigit;

        while(number > 0) {

            lastDigit = number % 10;

            reverse = (reverse * 10) + lastDigit;

            number = number / 10;

        }

        System.out.println(reverse);

        if(reverse == originalNumber) {

            return true;

        }else {

            return false;

        }


    }


}
