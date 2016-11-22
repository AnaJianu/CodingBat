package com.codingbat;

/**
 * Given an array of ints, return true if every element is a 1 or a 4.
 */
public class Only14 {

    public boolean only14(int[] nums) {
        int count1=0;
        int count4=0;

        for (int currentNumber:nums) {
            if (currentNumber==1) {
                count1++;
            }
            if (currentNumber==4) {
                count4++;
            }
        }

        if (count1+count4==nums.length) {
            return true;
        }
        return false;
    }
}
