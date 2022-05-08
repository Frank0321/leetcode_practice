/**
 * @file Frank_0508.java
 * @Create 2022年5月8日
 * @Author Frank
 * @@Description :  
 */

package com.example.leetcode_practice.Medium.m16_3SumClosest;

import java.util.Arrays;

public class Frank_0508 {
	
	public static void main(String[] args) {
		
		int[] nums = new int[]{0,2,1,-3};
		int target = 1;
		System.out.println(threeSumClosest(nums, target));
	}
	
	//數字的組合性很多，不能限定為連續
	public static int threeSumClosest(int[] nums, int target) {
		
		Arrays.sort(nums);
		
		int result = nums[0] + nums[1] + nums[2];
		
		for(int i = 0; i< nums.length-2; i++) {
			int temp = nums[i] + nums[i+1] + nums[i+2];
			if (Math.abs(temp - target) < Math.abs(result - target)) {
				result = temp;
			}
		}
		return result;
	}

}
