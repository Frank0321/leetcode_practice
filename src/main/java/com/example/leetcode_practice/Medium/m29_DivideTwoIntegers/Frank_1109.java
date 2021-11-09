package com.example.leetcode_practice.Medium.m29_DivideTwoIntegers;

/**
 * FileName : Frank_1109
 * CreatTime : 2021/11/9
 * Author : Frank.Chang
 * Description :
 */
public class Frank_1109 {
    public static void main(String[] args) {
        int dividend = 1;
        int divisor = -1;
        System.out.println(divide(dividend, divisor));
    }

    /**
     * 1. int range = -2147483648 - 2147483647
     * 2. if 裡面的 and 為 &&
     * 3. 先把負號轉乘正數，並保留先前的數字
     * 4. 利用減號的原理，相減到 <=0  --->  相減 >=0 就繼續
     * 5. 將負號還至答案中
     */
    private static int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        int newDividend = dividend >= 0 ? dividend : -dividend;
        int newDivisor = divisor > 0 ? divisor : -divisor;
        int count = 0;
        while (newDividend - newDivisor >= 0){
            count++;
            newDividend -= newDivisor;
        }

        count = dividend > 0 ? count : -count;
        return divisor > 0 ? count : -count;
    }
}
