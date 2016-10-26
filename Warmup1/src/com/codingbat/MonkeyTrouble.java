package com.codingbat;

/**
 * Created by ana on 26/10/16.
 */
public class MonkeyTrouble {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile&bSmile)|(!aSmile&!bSmile)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        MonkeyTrouble monkeyTrouble=new MonkeyTrouble();
        System.out.println("Expected false->"+monkeyTrouble.monkeyTrouble(false,true));
        System.out.println("Expected true->"+monkeyTrouble.monkeyTrouble(true,true));
        System.out.println("Expected true->"+monkeyTrouble.monkeyTrouble(false,false));
        System.out.println("Expected false->"+monkeyTrouble.monkeyTrouble(true,false));
    }
}
