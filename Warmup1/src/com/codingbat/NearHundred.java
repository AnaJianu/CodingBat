package com.codingbat;

/**
 * Created by ana on 27/10/16.
 */
public class NearHundred {

    public boolean nearHundred(int n) {
        return Math.abs(100-n)<=10 || Math.abs(200-n)<=10;
    }

    public static void main(String[] args) {
        NearHundred nh=new NearHundred();
        System.out.println(nh.nearHundred(93));
        System.out.println(nh.nearHundred(90));
        System.out.println(nh.nearHundred(89));
    }
}
