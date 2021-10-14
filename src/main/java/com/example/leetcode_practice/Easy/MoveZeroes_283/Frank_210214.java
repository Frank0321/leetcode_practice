package com.example.leetcode_practice.Easy.MoveZeroes_283;

import java.util.Arrays;

/**
 * FileName : Frank_210214
 * CreatTime : 2021/10/15
 * Author : Frank
 * Description :
 */
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
