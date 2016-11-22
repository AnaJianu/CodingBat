package com.codingbat;

/**
 * Given an array of ints length 3, return a new array with the elements in reverse order,
 * so {1, 2, 3} becomes {3, 2, 1}.
 */
public class Reverse3 {

    public int[] reverse3(int[] nums) {

        int[] reverseNums=new int[nums.length];

        for (int i=nums.length-1; i>=0; i--) {
            reverseNums[nums.length-1-i]=nums[i];
        }

        return reverseNums;

    }


}
