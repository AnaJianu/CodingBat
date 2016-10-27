package com.codingbat;

/**
 * Created by ana on 27/10/16.
 */
public class NotString {

    public String notString(String str) {
        if (str.length() >=3 && str.substring(0,3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

    public static void main(String[] args) {
        NotString ns=new NotString();
        System.out.println(ns.notString("candy"));
        System.out.println(ns.notString("x"));
        System.out.println(ns.notString("not bad"));
    }
}
