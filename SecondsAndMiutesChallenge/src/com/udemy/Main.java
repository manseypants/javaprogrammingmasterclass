package com.udemy;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(65L, 45L));

        System.out.println(getDurationString(3945L));

        System.out.println(getDurationString(-41));

        System.out.println(getDurationString(65, 9));

    }

    public static String getDurationString(long minutes, long seconds) {

        if(minutes < 0L || seconds < 0L || seconds > 59L) {

            return INVALID_VALUE_MESSAGE;

        }

        long hours = minutes / 60L;

        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";

        if(hours < 10) {

            hoursString =  "0" + hoursString;

        }

        String minutesString = minutes + "m";

        if(remainingMinutes < 10) {

            minutesString =  "0" + minutesString;

        }

        String secondsString = seconds + "s";

        if(seconds < 10) {

            secondsString =  "0" + secondsString;

        }

        return hoursString + " " + minutesString + " " + secondsString;

    }

    public static String getDurationString(long seconds) {

        if(seconds < 0L) {

            return INVALID_VALUE_MESSAGE;

        }

        long minutes = seconds / 60L;

        long remainingSeconds = seconds % 60L;

        return getDurationString(minutes, remainingSeconds);

    }


}
