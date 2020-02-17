package com.pluralsight.trywithresources;

public class Main {

    public static void main(String[] args) { //all of the following code is within the "main" method

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Ryan", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Jessica", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Jayshree", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Tony", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Gavin", highScorePosition);
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Jessie", highScorePosition);
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { //void means don't send any value back
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1; //-1 indicates an error or an invalid/value not found
        }
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into " + playerPosition +
                " position on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if(playerScore >= 1000) {
//            return 1;
//        }else if (playerScore >= 500)
//            return 2;
//        else if (playerScore >= 100)
//            return 3;
//        else
//            return 4;

        int position = 4; //assuming that position 4 will be returned

        if (playerScore >= 1000)
            position = 1;
        else if (playerScore >= 500)
            position = 2;
        else if (playerScore >= 100)
            position = 3;

        return position;
    }
}