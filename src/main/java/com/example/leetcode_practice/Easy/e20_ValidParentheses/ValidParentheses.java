package com.example.leetcode_practice.Easy.e20_ValidParentheses;

/**
 * FileName : ValidParentheses
 * CreatTime : 2021/11/21
 * Author : Frank.Chang
 * Description :
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        boolean result = true;
        while (result){
            result = false;
            for (int i = 0; i < s.length()-1; i++) {
                String subStr = s.substring(i, i+2);
                switch (subStr){
                    case "{}":
                    case "[]":
                    case "()":
                        s = s.replace("{}", "");
                        s = s.replace("[]", "");
                        s = s.replace("()", "");
                        result = true;
                        break;
                }
            }
        }

        return s.length()==0;
    }
}
