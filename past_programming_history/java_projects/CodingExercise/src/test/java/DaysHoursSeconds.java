//package com.jaguar;
//
//public class DaysHoursSeconds {
//
//    /*
//    Objective for this class.. Input a amount of hrs and minutes convert to all minutes to change back to days
//    hours and minutes.
//     */
//    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
//
//    public static void main(String[] args) {
//
//        System.out.println(getDurationString(47,61));
//       // System.out.println(getDurationString(10));
//
//
//        //converts hours to days nothing else yet.. removed other stuff because i was getting confused
//    }
//
//    public static String getDurationString(long hours, long minutes) {
//
//        if (hours < 0 || minutes < 0) {
//            return INVALID_VALUE_MESSAGE;
//        }
//
//        long days = hours / 24; // converts the amount of hours given to days
//        long remainingHrs = hours % 24; //and if the amount given is say uneven (25hrs) then it gets put as hours
//
//        long hours1 = minutes / 60;
//        long convertToHours1 = minutes % 60;
//
//
//
//        return (days + "d " + remainingHrs + "h ");
//    }
//
//    private static String getDurationString(long minutes) {
//
//        if (minutes < 0) {
//            return INVALID_VALUE_MESSAGE;
//        }
//
//
//
//        return "s";
//    }
//}

/*
So you first wanna get the whole minutes by doing minutes % 60. Then you want to get hours from
minutes by doing minutes / 60.  Then you continue doing hours % 60. Now you have two types of hours.
 The remaining hours from the total hours and the hours from the minutes. Now you're gonna add those
 together and then do newHours % 60 to get the days. Then you have minutes, hours (in newHours) and days lef
 */

/*
Convert all to minutes then convert to mins hours days
 */