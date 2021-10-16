package com.example.leetcode_practice.Easy.e283_MoveZeroes;

import java.util.Arrays;

public class Frank_210214 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeros(nums);
        Arrays.stream(nums).forEach(n -> System.out.println(n));
    }

    public static void moveZeros(int[] nums){
        for (int i = 0; i < nums.length-1; i ++){
            for (int j = 0; j < nums.length-1-i; j++){
                if (nums[j] == 0){
                    nums[j] = nums[j+1];
                    nums[j+1] = 0;
                }
            }
        }
    }


}
