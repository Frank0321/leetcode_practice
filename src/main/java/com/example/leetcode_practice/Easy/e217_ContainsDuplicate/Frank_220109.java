package com.example.leetcode_practice.Easy.e217_ContainsDuplicate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * FileName : Frank_220109
 * CreatTime : 2022/1/9
 * Author : Frank.Chang
 * Description :
 */
public class Frank_220109 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }

    /**
     * 如果有任意一個數字重複，救回傳 true
     * @param nums
     * @return
     */
    private static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)){
                map.put(num, 1);
            }else {
                map.put(num, map.get(num)+1);
            }
        }
        for (Integer value : map.values()) {
            if (value >= 2){
                return true;
            }
        }
        return false;
    }
}
