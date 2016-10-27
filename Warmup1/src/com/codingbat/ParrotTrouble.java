package com.codingbat;

/**
 * Created by ana on 27/10/16.
 */
public class ParrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking&(hour<7|hour>20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ParrotTrouble p=new ParrotTrouble();
        System.out.println(p.parrotTrouble(true,7));
        System.out.println(p.parrotTrouble(true,20));
        System.out.println(p.parrotTrouble(false,6));
    }
}
