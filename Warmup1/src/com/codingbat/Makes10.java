package com.codingbat;

/**
 * Created by ana on 27/10/16.
 */
public class Makes10 {

    public boolean makes10(int a, int b) {
        if ((a==10|b==10)|(a+b==10)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Makes10 m=new Makes10();
        System.out.println(m.makes10(9,10));
        System.out.println(m.makes10(8,3));
        System.out.println(m.makes10(12,-2));
    }
}
