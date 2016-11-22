package com.codingbat;

/**
 * Given an array of ints length 3, figure out which is larger, the first or
 * last element in the array, and set all the other elements to be that value. Return the changed array.
 */
public class MaxEnd3 {

    public int[] maxEnd3(int[] nums) {
        int max=0;
        if (nums[0]>nums[2]) {
            max=nums[0];
        } else {
            max=nums[2];
        }
        nums[0]=max;
        nums[1]=max;
        nums[2]=max;
        return nums;
    }
}


