package com.example.leetcode_practice.Easy.e14_LongestCommonPrefix;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strings = new String[]{"flower","flow","flight"};
        System.out.println(LongestCommon(strings));
    }

    public static String LongestCommon (String[] strs){
        //取出最短的文字
        var firstStr = Arrays.stream(strs).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }).findFirst().orElse("");

        //取出最短的文字
        var first = Arrays.stream(strs).sorted(Comparator.comparing(s -> s.length()))
            .findFirst().orElse("");

        for (int i = 0; i <= firstStr.length(); i++) {
            String check = firstStr.substring(0,i);
            for (String str : strs) {
                if(!check.equals(str.substring(0, i))){
                    return firstStr.substring(0,i-1);
                }
            }
        }
        return firstStr;
    }
}
