package com.codingbat;

/**
 * Created by ana on 27/10/16.
 */
public class ExtraEnd {

    public String extraEnd(String str) {
        String str2=str.substring(str.length()-2,str.length());

        return str2+str2+str2;
    }

    public static void main(String[] args) {
        ExtraEnd e=new ExtraEnd();
        System.out.println(e.extraEnd("Hello"));
        System.out.println(e.extraEnd("ab"));
        System.out.println(e.extraEnd("Hi"));
    }
}
