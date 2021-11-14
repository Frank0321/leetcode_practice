package com.example.leetcode_practice.Easy.e1323_Maximum69Number;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * FileName : LeetcodePractice
 * CreatTime : 2021/11/15
 * Author : Frank.Chang
 * Description :
 */
public class LeetcodePractice {
    public static void main(String[] args) {
        int num = 999;
        System.out.println(maximum69Number(num));
    }

    private static int maximum69Number(int num) {
        String s = Integer.toString(num);
        String[] strings = s.split("");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("6")){
                strings[i] = "9";
                break;
            }
        }
        return Integer.parseInt(String.join("", strings));
    }
}
