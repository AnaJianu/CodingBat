package com.codingbat;

/**
 * Created by ana on 27/10/16.
 */
public class Or35 {

    public boolean or35(int n) {
        if (n>0 && n%3==0 || n%5==0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Or35 o=new Or35();
        System.out.println(o.or35(3));
        System.out.println(o.or35(10));
        System.out.println(o.or35(8));
    }
}
