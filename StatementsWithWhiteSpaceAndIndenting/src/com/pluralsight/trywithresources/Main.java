package com.pluralsight.trywithresources;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50; //the entire line is a "statement"
        myVariable++;
        myVariable--;
        System.out.println("This is a test."); //this is also a statement

        System.out.println("This is" +
                "another" +
                "way to break up a sentence");

        int anotherVariable = 5;
        myVariable--; //recommend not putting it on the same line
        System.out.println("This is another one");
    }
}
