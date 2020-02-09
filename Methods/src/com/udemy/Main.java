package com.udemy;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int score1 = 1500;
        int score2 = 900;
        int score3 = 400;
        int score4 = 50;

        String name;
        int position;

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
        displayHighScorePosition("Jason", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Dave", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Steve", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("James", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Hank", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Buddy", highScorePosition);



    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;

        }

        return -1;

    }

    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name + " managed to get into position " + position + " on the high score table.");

    }

    public static int calculateHighScorePosition(int score) {

//        if(score >= 1000) {
//
//            return 1;
//
//        }else if(score >= 500) {
//
//            return 2;
//
//        }else if(score >= 100) {
//
//            return 3;
//
//        }
//
//            return 4;
//
//        }

        int position = 4;

        if (score >= 1000) {

            position = 1;

        } else if (score >= 500) {

            position = 2;

        } else if (score >= 100) {

            position = 3;

        }

        return position;

    }


}
