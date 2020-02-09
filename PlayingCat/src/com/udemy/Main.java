package com.udemy;

public class Main {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(false,45));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false,35));

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if(((summer) && (temperature >= 25) && (temperature <= 45)) || ((!summer) && (temperature >= 25) && (temperature <= 35))) {

            return true;

        }

        return false;

    }

}


//((summer = false) && (temperature >= 25) && (temperature <= 35)))