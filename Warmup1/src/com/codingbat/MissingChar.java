package com.codingbat;

/**
 * Created by ana on 27/10/16.
 */
public class MissingChar {

    public String missingChar(String str, int n) {
        String s1= str.substring(0,n);
        String s2=str.substring(n+1, str.length());
        return s1+s2;
    }

    public static void main(String[] args) {
        MissingChar mc= new MissingChar();
        System.out.println(mc.missingChar("kitten",1));
        System.out.println(mc.missingChar("kitten",0));
        System.out.println(mc.missingChar("kitten",4));

    }
}
