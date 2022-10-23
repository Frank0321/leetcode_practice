package com.example.leetcode_practice.Easy.e771_JewelsandStones;

public class Frank_221023 {
	
	public static void main(String[] args) {
		
		String jewels = "z";
		
		String stones = "ZZ";
		
		System.out.println(numJewelsInStones(jewels, stones));
	}

	private static int numJewelsInStones(String jewels, String stones) {
		
		int result = 0;
		
		for (int i = 0; i < jewels.length(); i++) {
			
			String jewelsString = jewels.substring(i, i+1);
			
			if (stones.contains(jewelsString)) {
				
				for (int j = 0; j < stones.length(); j++) {
					
					if (jewelsString.equals(stones.substring(j, j+1 ))) {
						result ++;
					}
				}
			}
			
		}
		
		return result;
	}

}
