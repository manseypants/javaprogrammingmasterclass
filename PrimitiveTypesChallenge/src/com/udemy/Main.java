package com.udemy;

public class Main {

    public static void main(String[] args) {

        byte anyByte = 10;
        short anyShort = 20;
        int anyInt = 50;

        long longTotal = 50000L + (10 * (anyByte + anyShort + anyInt));

        System.out.println(longTotal);

        short shortTotal = (short) (1000 + (10 * (anyByte + anyShort + anyInt))); //it defaults to an int so we have to cast it as a short

        System.out.println(shortTotal);

    }
}
