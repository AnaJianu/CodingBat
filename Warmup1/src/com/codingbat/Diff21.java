package com.codingbat;

/**
 * Created by ana on 27/10/16.
 */
public class Diff21 {

    public int diff21(int n) {
        int dif=n-21;
        if (n<=21) {
            return Math.abs(dif);
        }
        else {
            return 2*Math.abs(dif);
        }
    }

    public static void main(String[] args) {
        Diff21 d=new Diff21();
        System.out.println(d.diff21(19));
        System.out.println(d.diff21(30));
        System.out.println(d.diff21(0));
    }
}
