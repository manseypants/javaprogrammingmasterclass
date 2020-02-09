package com.udemy;

public class Main {

    public static void main(String[] args) {
//        System.out.println(hasTeen2(9,99,19));
//        System.out.println(hasTeen2(0,0,20));
//        System.out.println(hasTeen2(18,18,18));
//        System.out.println(hasTeen2(23,15,42));
//        System.out.println(hasTeen2(22,23,34));
//        hasTeen2(12,14,24);

        calculateScore("Ryan", 100);
        System.out.println("New score is " + calculateScore("John", 200));

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

    }

    public static boolean hasTeen(int a, int b, int c) {

        if (a <= 19 || b <= 19 || c <= 19) {

            if (a >= 13 || b >= 13 || c >= 13) {

                return true;

            }else {

                return false;

            }

        }

        return false;

    }

    public static boolean isTeen(int x) {

        if(x >= 13 && x <= 19) {

            return true;

        }

        return false;

    }

    public static boolean hasTeen2(int a, int b, int c) {

        if(a >= 13 && a <= 19) {

            return true;
        }

        else if(b >= 13 && b <= 19) {

            return true;

        }

        else if(c >= 13 && c <= 19) {

            return true;

        }

        return false;

    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;

    }


}
