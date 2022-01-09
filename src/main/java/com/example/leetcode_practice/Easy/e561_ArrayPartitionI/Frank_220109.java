package com.example.leetcode_practice.Easy.e561_ArrayPartitionI;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * FileName : Frank_220109
 * CreatTime : 2022/1/9
 * Author : Frank.Chang
 * Description :
 */
public class Frank_220109 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }

    /**
     * 先排序後，然後 1, 3, 5 這樣依序取出
     * @param nums
     * @return
     */
    private static int arrayPairSum(int[] nums) {
        var arr = Arrays.stream(nums).sorted().toArray();
        int result = 0;
        for (int i = 0; i < arr.length; i= i+2) {
            result += arr[i];
        }
        return result;
    }
}
