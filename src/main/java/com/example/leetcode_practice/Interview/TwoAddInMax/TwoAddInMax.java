/**
 * @Description : 陣列中，任兩筆相加，要最靠近目標的最大值
 * @ClassName : TwoAddInMax.java
 * @Copyright : Copyright (c) 2023 
 * @ModifyHistory : 
 *  v1.00, 2023/02/06, frankchang
 *   1) First Release.
 */

package com.example.leetcode_practice.Interview.TwoAddInMax;

public class TwoAddInMax {
	
	public static void main(String[] args) {
		
		int[] A = new int [] {34, 23, 1, 24, 75, 33, 54, 8};
		int K = 60;
		System.out.println(twoAddInMax(A, K));
	}

	/**
	 * 
	 * @param a
	 * @param k
	 * @return
	 */
	private static Integer twoAddInMax(int[] a, int k) {

		Integer result = null;
		
		for (int x = 0; x< a.length - 1; x ++ ) {
			for (int y = x + 1; y < a.length; y++) {
				
				if (a[x] + a[y] <= k){
					result = result == null ? 
										a[x] + a[y] : a[x] + a[y] > result ?
																a[x] + a[y] : result ;
				}
			}
		}
		return result;
	}
	
}
