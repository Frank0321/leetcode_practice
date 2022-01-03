package com.example.leetcode_practice.Easy.e70_ClimbingStairs;

/**
 * FileName : Frank_220103
 * CreatTime : 2022/1/3
 * Author : Frank.Chang
 * Description :
 */
public class Frank_220103 {
    public static void main(String[] args) {
        int n = 45;
//        System.out.println(climbStairs(n));
        System.out.println(climbStairs2(n));
    }

    // 加速運算

    /**
     * 0 1 1 2 3 5
     * a b c
     *   a b c
     *     a b c
     * =================
     * temp = c
     * c = a + b
     * a = b
     * b = temp
     */
    private static int climbStairs2(int n) {
        if (n <= 2) {
            return n;
        }else {
            int a = 0;
            int b = 1;
            int c = 1;
            for (int i = 2; i <= n; i++) {
                int temp = c;
                c =  c + b;
                a = b;
                b = temp;
            }
            return c;
        }
    }

    //走到 n 階的方法 = (n-1) + (n-2) 的方法和 => 前面兩個數字的和，費事數列的變形
    //n = 45，Time Limit Exceeded
    private static int climbStairs(int n) {
        if (n <= 2){
            return n;
        }else {
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }


}
