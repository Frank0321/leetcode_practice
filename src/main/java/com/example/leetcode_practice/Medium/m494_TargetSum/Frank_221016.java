package com.example.leetcode_practice.Medium.m494_TargetSum;

import java.util.ArrayList;

public class Frank_221016 {
	
	static int count = 0;

	public static void main(String[] args) {
		int [] nums = new int[] {34,16,5,38,20,20,8,43,3,46,24,12,28,19,22,28,9,46,25,36};
		int target = 0;
		
		System.out.println(findTargetSumWays(nums, target));
		System.out.println(findTargetSumWays2(nums, target));
		System.out.println(findTargetSumWays3(nums, target));
	}

	/**
	 * 把它組合成 list，並從 list 去判斷符合的個數
	 * Time Limit Exceeded
	 * @param nums
	 * @param target
	 * @return
	 */
	private static int findTargetSumWays(int[] nums, int target) {
		
		long startTime = System.nanoTime();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		
		
		for (int item : nums) {
			
			ArrayList<Integer> newList = new ArrayList<Integer>();
			
			for (int listItem : list) {
				
				newList.add(listItem + item);
				
				newList.add(listItem - item);
			}
			
			list = newList;
		}
		
		int count = (int) list.stream().filter( n -> n == target).count();
		
		long endTime = System.nanoTime();
		
		System.out.println("花費時間 : " + (endTime - startTime));
		
		return count;
	}
	
	/***
	 * 把它組合成 list，並從 list 去判斷符合的個數 (改用 stream 去寫)
	 * Time Limit Exceeded
	 * @param nums
	 * @param target
	 * @return
	 */
	private static int findTargetSumWays2(int[] nums, int target) {
		
		long startTime = System.nanoTime();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		
		
		for (int item : nums) {
			
			ArrayList<Integer> newList = new ArrayList<Integer>();
			
			list.stream().forEach( n -> {
				newList.add(n + item);
				newList.add(n - item);
			});
			
			list = newList;
			
		}
		
		int count = (int) list.stream().filter( n -> n == target).count();
		
		long endTime = System.nanoTime();
		
		System.out.println("花費時間 : " + (endTime - startTime));
		
		return count;
		
	}
	
	/**
	 * 不組成 list 直接判斷
	 * @param nums
	 * @param target
	 * @return
	 */
	private static int findTargetSumWays3(int[] nums, int target) {
		
		long startTime = System.nanoTime();
		
		int result = helper( nums, target, 0, 0);

		long endTime = System.nanoTime();
		
		System.out.println("花費時間 : " + (endTime - startTime));
		
		return result;
	}

	/**
	 *  遞迴方法
	 * @param nums
	 * @param target
	 * @param index
	 * @param sum
	 * @return
	 */
	private static int helper(int[] nums, int target, int index, int sum) {
		
		// 如果為目標，則次數計為 1
		if (index == nums.length) {
			return sum == target ? 1 : 0;
		}
		
		// 遞迴跑 add , sub
		int add = helper(nums, target, index+1, sum + nums[index]);
		int sub = helper(nums, target, index+1, sum - nums[index]);
		
		// 次數全部類計
		return add + sub;

	}

		

}
