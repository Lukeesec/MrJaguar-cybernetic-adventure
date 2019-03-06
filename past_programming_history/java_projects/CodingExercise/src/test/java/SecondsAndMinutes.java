//package com.jaguar;
//
//public class SecondsAndMinutes {
//
//    /*
//    private static final is a constant.. It get declared outside of any methods..
//    Good use if u are doing a certain thing many times.. Like outputting invalid value more then once.
//
//    A constant cant change from what it has been set to. example
//
//    INVALID_VALUE_MESSAGE = "123"; That wont change and it wont work
//    Constants are typed in uppercase so its easily identifiable by other coders
//     */
//
//    private static final String INVAILD_VALUE_MESSAGE = "Invaild value";
//
//    public static void main(String[] args) {
//
//        System.out.println(getDurationString(120,50));
//        System.out.println(getDurationString(120,50)); //kinda confused on this aspect..
//
//    }
//
//    public static String getDurationString(long minutes, long seconds) {
//
//        if ((minutes < 0) || (seconds < 0 || (seconds > 59))) {
//            return INVAILD_VALUE_MESSAGE;
//        }
//
//        long hrs = minutes / 60; // equals 1 hour
//        long remainingMins = minutes % 60; // remaining minutes
//
//      /*
//    Whats going on here with the if statements and everything.
//    When we print what we have without theses statements it will print
//    1hr 1min 1sec but when we add this statement and the value we want to convert is
//    less then 10 it would look like 01hr 01min 01sec
//    If hrs is less then 10 then add 0 to the string same with the rest.
//       */
//
//        String hrsString = hrs + "h";
//        if (hrs < 10) {
//            hrsString = "0" + hrsString;
//        }
//        String minsString = remainingMins + "m";
//        if (remainingMins < 10) {
//            minsString = "0" + minsString;
//        }
//        String secsString = seconds + "s";
//        if (seconds < 10) {
//            secsString = "0" + secsString;
//        }
//
//        return hrsString + " " + minsString + " " + secsString + "";
//    }
//
//    private static String getDurationString(long seconds) {
//
//        if (seconds < 0) {
//            return INVAILD_VALUE_MESSAGE;
//        }
//
//        long minutes = seconds / 60;
//        long remainingSec = seconds % 60;
//
//        return getDurationString(minutes, remainingSec);
//    }
//}
//
////1 Minute = 60 Seconds
////1 Hour = 3600 Seconds ( 60 * 60 )
////1 Day = 86400 Second ( 24 * 3600 )