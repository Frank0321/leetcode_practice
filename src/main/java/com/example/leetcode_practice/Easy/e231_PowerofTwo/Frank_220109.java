package com.example.leetcode_practice.Easy.e231_PowerofTwo;

/**
 * FileName : Frank_220109
 * CreatTime : 2022/1/9
 * Author : Frank.Chang
 * Description :
 */
public class Frank_220109 {
    public static void main(String[] args) {
        int n = -16;
        System.out.println(isPowerOfTwo(n));
    }

    /**
     * 須注意 : 0、負數
     * @param n
     * @return
     */
    private static boolean isPowerOfTwo(int n) {
        while (n >1){
            if (n%2 == 1){
                return false;
            }else {
                n /= 2;
            }
        }
        return n>0? true : false;
    }
}
