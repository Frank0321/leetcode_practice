package com.example.leetcode_practice.Easy.e53_MaximumSubarray;

import java.util.Arrays;

public class Frank_211022 {
    public static void main(String[] args) {

        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums){
        int result = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            //如果"累加的數字"小於 0，就從下一個數字開始"重新進行累加"
            sum = sum < 0 ? num : sum+num;

            //如果累加的數字大於結果的數字，就取代它
            result = result < sum ? sum : result;
        }

        return result;
    }
}
