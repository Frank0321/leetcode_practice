package com.example.leetcode_practice.Easy.e415_AddStrings;

import java.math.BigDecimal;

/**
 * FileName : Frank_220109
 * CreatTime : 2022/1/9
 * Author : Frank.Chang
 * Description :
 */
public class Frank_220109 {
    public static void main(String[] args) {
        String num1 = "1";
        String num2 = "9";
        System.out.println(addStrings(num1, num2));
    }

    /**
     * 數字會超過極限，需要用文字一個個位數進行相加
     * @param num1
     * @param num2
     * @return
     */
    private static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder result = new StringBuilder();
        sb.append(num1).reverse();
        sb2.append(num2).reverse();
        int length = sb.length() >= sb2.length() ? sb.length() : sb2.length();
        int teen = 0;
        for (int i = 0; i < length; i++) {
            int x = sb.length() > i ? Integer.parseInt(String.valueOf(sb.charAt(i))) : 0;
            int y = sb2.length() > i ? Integer.parseInt(String.valueOf(sb2.charAt(i))) : 0;
            int temp = x + y + teen;
            result.append(temp%10);
            teen = temp/10;
        }
        if (teen != 0){
            result.append("1");
        }
        return result.reverse().toString();
    }
}
