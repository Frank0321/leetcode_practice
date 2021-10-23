package com.example.leetcode_practice.Medium.m16_3SumClosest;

import java.util.Arrays;

public class Frank_211023 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,-1,-1,3};
        int target = -1;
        System.out.println(threeSumClosest(nums, target));
    }

    /**
     * 1. target 有可能是 int 的 max 或是 min ，在計算時，有可能會產生問題，因此先假設為 double
     * 2. for loop 依序往下取 : 如第一個 for loop 取 1，第二個 for loop 則是從 2 開始取
     */

    private static int threeSumClosest(int[] nums, int target) {
        double result = Double.MAX_EXPONENT;
        if (nums.length== 3){
            return Arrays.stream(nums).sum();
        }
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int sum = nums[i]+nums[j]+nums[k];
                    if (Math.abs(sum - target) < Math.abs(result - target) ){
                        result = sum;
                    }
                }
            }
        }

        return (int) result;
    }


}
