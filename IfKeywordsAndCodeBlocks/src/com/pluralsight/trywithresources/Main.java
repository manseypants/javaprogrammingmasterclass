package com.pluralsight.trywithresources;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 & score > 1000) { //code block isn't needed if you're only checking the next line
//            System.out.println("Your score less than 5000 but greater than 1000.");
//        } else if (score < 1000) {
//            System.out.println("Your score wes less that 1000.");
//        } else {
//            System.out.println("Your score is not 5000.");
//        }

        if (gameOver == true) { //scope deals with accessibility inside/outside of the code block
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //option 1 - Advantage is that it keeps the constant record of what the expressions are
        //           Disadvantage is that it doesn't use memory efficiently
        int score2 = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;

        if (gameOver == true) { //scope deals with accessibility inside/outside of the code block
            int finalScore = score2 + (levelCompleted2 * bonus2);
            System.out.println("Your final score was " + finalScore);
        }

        //option 2 - Advantage is that it uses memory more efficiently
        //           Disadvantage is that it redefined the variables and there is no backup it also means that we are
        //           duplicating code which can potentially cause errors and that you need to change things in multiple
        //           places
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver == true) { //scope deals with accessibility inside/outside of the code block
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
