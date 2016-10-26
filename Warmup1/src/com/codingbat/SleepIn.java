package com.codingbat;

/**
 * Created by ana on 26/10/16.
 */
public class SleepIn {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday|vacation) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        SleepIn sleepIn=new SleepIn();
        System.out.println("Expected true -> returned:" + sleepIn.sleepIn(true,true));
        System.out.println("Expected false -> returned:" + sleepIn.sleepIn(true,false));
        System.out.println("Expected true -> returned:" + sleepIn.sleepIn(false, false));
    }
}
