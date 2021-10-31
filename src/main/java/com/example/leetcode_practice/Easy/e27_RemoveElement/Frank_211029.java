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
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    /**
     * 回傳不為目標的總數
     * 且原本的陣列，前面幾個數字耀為非目標的數字
     */
    private static int removeElement(int[] nums, int val) {

        int result = (int) Arrays.stream(nums).filter(n-> n!= val).count();
        int n = 0;
        for (int i = 0; i < nums.length+1; i++) {
            if (n < result){
                if(nums[i]!= val){
                    nums[n] = nums[i];
                    n++;
                }
            }else {
                nums[n]= val;
                n++;
            }

        }
        Arrays.stream(nums).forEach(System.out::println);
        System.out.println("--------------");
        return result;
    }

}
