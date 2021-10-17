package com.example.leetcode_practice.Medium.m3_LongestSubstringWithoutRepeatingCharacters;

public class LongestSubstringWithoutRepeatingCharacters_211017 {

    public static void main(String[] args) {
        String s = "";
//        System.out.println(isRepeat(s));
        System.out.println(lengthOfLongestSubstring(s));
    }

    //Time Limit Exceeded
    public static int lengthOfLongestSubstring(String s){
        if (s == "" ||s.length() == 0){
            return 0;
        }else {
            int stringLength = s.length();
            for (int i = 1; i < stringLength; i++) {
                for (int j = 0; j < i; j++) {
                    String substr = s.substring(j, stringLength - i + 1 + j);
                    //                System.out.println(substr);
                    if (!isRepeat(substr)) {
                        return substr.length();
                    }
                }
            }

            return 1;
        }
    }

    public static boolean isRepeat(String s){
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){

                    return true;
                }
            }
        }
        return false;
    }

}
