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
        int [] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
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
