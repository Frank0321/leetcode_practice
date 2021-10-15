package com.example.leetcode_practice.Easy.PalindromeNumber_9;

import java.util.ArrayList;
import java.util.List;

public class Frank_211016 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1));

    }

    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }else {
            List<Integer> list = new ArrayList<Integer>();
            while (x/10 >= 1){
                list.add(x%10);
                x /= 10;
            }
            list.add(x);
            for(int i = 0; i< list.size()/2 ; i++){
                if (list.get(i) != list.get(list.size()-1-i)){
                    return false;
                }
            }
            return true;
        }

    }
}
