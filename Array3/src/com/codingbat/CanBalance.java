package com.codingbat;

/**
 * Created by ana on 21/11/2016.
 */
public class CanBalance {
    public boolean canBalance(int[] nums) {
        for (int i=0; i< nums.length-1; i++) {
            int sum1=0;
            int sum2=0;

            for (int j=0; j<=i; j++) {
                sum1=sum1+nums[j];
            }

            for (int k=i+1; k< nums.length; k++) {
                sum2=sum2+nums[k];
            }

            if (sum1==sum2) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        CanBalance balance=new CanBalance();
        int[] newArray={1, 1, 1, 2, 1};
        balance.canBalance(newArray);
    }

}
