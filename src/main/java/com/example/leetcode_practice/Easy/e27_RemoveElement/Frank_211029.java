package com.example.leetcode_practice.Easy.e27_RemoveElement;

import java.util.Arrays;

/**
 * FileName : Frank_211029
 * CreatTime : 2021/10/29
 * Author : Frank
 * Description :
 */
public class Frank_211029 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,3,2};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }

    private static int removeElement(int[] nums, int val) {
        return nums.length - (int) Arrays.stream(nums).filter(n -> n== val).count();
    }


}
