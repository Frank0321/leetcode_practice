package com.example.leetcode_practice.Easy.e35_SearchInsertPosition;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * FileName : Frank_1109
 * CreatTime : 2021/11/9
 * Author : Frank.Chang
 * Description :
 */
public class Frank_1109 {
    public static void main(String[] args) {
        int [] nums = {1};
        int target = 0;
//        System.out.println(searchInsert(nums, target));
        System.out.println(searchInsert1(nums, target));
    }

    private static int searchInsert1(int[] nums, int target) {
        if (nums.length == 1){
            return target <= nums[0] ? 0 : 1;
        }
        //二分搜尋法
        int start = 0, end = nums.length, middle = 0;
        boolean isCountine = true;
        while (isCountine){
            middle = (start + end) / 2;
            if (target == nums[middle]){
                isCountine = false;
            }else if (target > nums[middle]){
                start = middle;
                if (end - start == 1){
                    middle = target == nums[end-1]? end-1: end;
                    isCountine = false;
                }
            }else if (target < nums[middle]){
                end = middle;
                if (end - start == 1){
                    middle = target < nums[start]? start : start+1;
                    isCountine = false;
                }
            }
        }
        return middle;
    }

    /**
     * 1. 如果要取 index => Instream.renge(0, length)......
     * 2. filter中 nums[n] == target 為所在的位置
     *    filter中 nusm[n] > target 為第一個大於 target 的位置，表示要插入的位置
     */

    private static int searchInsert(int[] nums, int target) {
        return IntStream
                .range(0, nums.length)
                .filter(n -> nums[n]>=target)
                .findFirst().orElse(nums.length);
    }

}
