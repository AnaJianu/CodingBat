package com.codingbat;

/**
 * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
 */
public class Sum28 {

    public boolean sum28(int[] nums) {

        int sum=0;
        for (int currentNumber:nums) {
            if (currentNumber==2) {
                sum=sum+currentNumber;
            }
        }

        if(sum==8) {
            return true;
        } else {
            return false;
        }
    }
}
