package com.example.leetcode_practice.Easy.e69_Sqrt;

/**
 * FileName : Frank_220109
 * CreatTime : 2022/1/9
 * Author : Frank.Chang
 * Description :
 */
public class Frank_220109 {
    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(mySqrt2(x));
    }

    /**
     *  n = (n + x/n) / 2
     *  2n = n + x/n
     *  n = x/n
     *  n^2 = x
     *  可能會爆，要用 long
     * @param x
     * @return
     */
    private static int mySqrt2(int x) {
        long n = x;
        while (n * n > x){
            n = (n + x/n) /2;
        }
        return (int) n;

    }

    private static int mySqrt(int x) {
        int n = 1;
        while (n*n < x){
            n++;
        }
        return n*n == x? n : n-1;
    }

}
