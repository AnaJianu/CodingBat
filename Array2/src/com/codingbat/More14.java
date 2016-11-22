package com.codingbat;

/**
 * Given an array of ints, return true if the number of 1's is greater than the number of 4's
 */
public class More14 {

    public boolean more14(int[] nums) {

        int count1=0;
        int count4=0;

        for(int currentNumber:nums) {
            if (currentNumber==1) {
                count1++;
            }
            if (currentNumber==4) {
                count4++;
            }
        }

        if (count1>count4) {
            return true;
        }
        return false;
    }
}
