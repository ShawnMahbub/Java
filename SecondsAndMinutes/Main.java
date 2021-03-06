package com.shawn;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));
        System.out.println("Thank You!!!");
    }

    //first method
    public static String  getDurationString(long minutes, long seconds)
    {
        if (minutes<0 || (seconds<=0 && seconds>59))
        {
            return "Invalid Value";
        }
        long hours=minutes/60;
        long remaindingMinutes= minutes%60;
        return minutes+"min "+seconds+"sec= "+hours+"hr "+minutes+"min "+seconds+"sec";
    }

    //method overloading with one parameter
    public static String  getDurationString(long seconds)
    {
        if (seconds<0)
        {
            return "Invalid Input";
        }

        long minutes=seconds/60;
        long remaindingSeconds=seconds%60;
        return getDurationString(minutes,remaindingSeconds);
    }
}
