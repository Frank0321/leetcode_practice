package com.example.leetcode_practice.Medium.m186_RotateArray;

import java.util.Arrays;

/**
 * FileName : LeetcodeTest
 * CreatTime : 2021/11/14
 * Author : Frank.Chang
 * Description :
 */
public class LeetcodeTest {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        Arrays.stream(nums).forEach(System.out::println);
    }

    private static void rotate(int[] nums, int k) {
        k %= nums.length;
        for (int i = 0; i < k; i++) {
            onceRotate(nums);
        }
    }

    private static void onceRotate(int[] nums) {
        for (int i = nums.length-1; i > 0 ; i--) {
            int temp = nums[i-1];
            nums[i-1] = nums[i];
            nums[i] = temp;
        }
    }

}
