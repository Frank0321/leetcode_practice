package com.example.leetcode_practice.Medium.m151_ReverseWordsinaString;

import java.util.Arrays;

/**
 * FileName : Frank_1111
 * CreatTime : 2021/11/11
 * Author : Frank.Chang
 * Description :
 */
public class Frank_1111 {
    public static void main(String[] args) {
        String s = "  Bob    Loves  Alice   ";
        System.out.println(reverseWords(s)+"---end");
    }

    private static String reverseWords(String s) {

        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length-1; i >=0 ; i--) {
            if (!strings[i].equals("")){
                sb.append(strings[i]);
                sb.append(" ");
            }
        }
        return sb.toString().substring(0, sb.toString().length()-1);
    }
}
