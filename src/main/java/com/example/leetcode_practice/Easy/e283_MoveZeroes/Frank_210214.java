package com.example.leetcode_practice.Easy.e283_MoveZeroes;

import java.util.Arrays;

public class Frank_210214 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeros(nums);
        Arrays.stream(nums).forEach(n -> System.out.println(n));
    }

    /**
     * 總共跑 整個 nums 的迴圈，每一層每次少跑一個次數 (因為最後一個已經變成 0 了)
     * 如果是 0，就把後面的數字往前移
     */
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
