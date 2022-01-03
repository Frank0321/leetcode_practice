package com.example.leetcode_practice.Easy.e66_PlusOne;

/**
 * FileName : Frank_220103
 * CreatTime : 2022/1/3
 * Author : Frank.Chang
 * Description :
 */
public class Frank_220103 {
    public static void main(String[] args) {
        int [] digits = new int [] {9,9,9};
        System.out.println(plusOne(digits));
        System.out.println(plusOne2(digits));
    }

    /**
     * 1. 如果位數沒有大於10，就直接回傳出去
     * 2. 不然就是歸零，在執行一次(進位)
     * 3. 都執行完，還沒有回傳，表示需要進位
     */
    private static int[] plusOne2(int[] digits) {
        int add = 1;
        for (int i = digits.length-1; i>= 0; i--) {
            digits[i] += add;
            if (digits[i] < 10)
                return digits;
            digits[i] = 0;
        }
        //如果最後一個數字大於 10，才會執行到這邊
        int[] ret = new int[digits.length+1];
        ret[0] = 1;
        return ret;
    }

    /**
     * 1. 先在最後一個數字 + 1
     * 2. 如果數字 > 9，則進位
     * 3. 如果陣列第一個數字也需要進位，則產生一個新的陣列去存放
     */
    private static int[] plusOne(int[] digits) {
        digits[digits.length-1] += 1;
        int next = 0;
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i] > 9){
                digits[i] = 0;
                if (i != 0){
                    digits[i-1] += 1;
                }else {
                    next++;
                }
            }
        }
        if (next == 0){
            return digits;
        }else {
            int[] result = new int [digits.length+1];
            result[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                result[i+1] = digits[i];
            }
            return result;
        }

    }

}
