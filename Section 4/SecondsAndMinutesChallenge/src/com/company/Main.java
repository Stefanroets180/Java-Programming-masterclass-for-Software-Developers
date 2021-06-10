package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(500, 42));
        System.out.println(getDurationString(8000));
        System.out.println(getDurationString(9,20));
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return "Invalid value";
        }
        int hours = minutes/60;
        int remMinutes = minutes%60;

        //Formatting the time
        if (hours < 10 && remMinutes < 10 && seconds < 10) {
            return ("0" + hours + "h " + "0" + remMinutes + "m " + "0" + seconds + "s");
        } else if (hours < 10 && remMinutes < 10) {
            return ("0" + hours + "h " + "0" + remMinutes + "m " + seconds + "s");
        } else if (hours < 10) {
            return ("0" + hours + "h " + remMinutes + "m " + seconds + "s");
        }
        return (hours + "h " + remMinutes + "m " + seconds + "s");
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value!";
        }

        int minutes = seconds/60;
        int remSeconds = seconds%60;
        System.out.println(seconds + "sec = " + minutes + "min, " + remSeconds + "sec");
        return getDurationString(minutes, remSeconds);
    }
}
