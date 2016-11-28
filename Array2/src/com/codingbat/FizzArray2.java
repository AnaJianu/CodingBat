package com.codingbat;

/**
 * Given a number n, create and return a new string array of length n,
 * containing the strings "0", "1" "2" .. through n-1.
 * N may be 0, in which case just return a length 0 array.
 */
public class FizzArray2 {

    public String[] fizzArray2(int n) {
        String[] newStringArray= new String[n];

        for (int i=0; i<n; i++) {
            newStringArray[i]=String.valueOf(i);
        }

        return newStringArray;

    }
}
