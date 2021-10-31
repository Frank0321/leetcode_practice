package com.example.leetcode_practice.Easy.e9_PalindromeNumber;

import java.util.ArrayList;
import java.util.List;

public class Frank_211016 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1231));

    }

    /**
     * method :
     * 1. 先判斷數字是否為正數，負數一定為 false
     * 2. 將數字從後面一個個拆解，並裝到 List 中，但需要注意最後一個數字是否有裝進去 list 中 (順序顛屌)
     * 3. 將前後成對的 list 比對，如果不一樣就是 false，可以比對到最後。就拋出 true
     */
    public static boolean isPalindrome(int x) {
//        if (x < 0){
//            return false;
//        }else {
//            List<Integer> list = new ArrayList<Integer>();
//            while (x/10 >= 1){
//                list.add(x%10);
//                x /= 10;
//            }
//            list.add(x);
//            for(int i = 0; i< list.size()/2 ; i++){
//                if (list.get(i) != list.get(list.size()-1-i)){
//                    return false;
//                }
//            }
//            return true;
//        }

//        if(x < 0){
//            return false;
//        }else {
//            return (new StringBuilder().append(x).reverse().toString())
//                    .equals(new StringBuilder().append(x).toString());
//        }
        //interillj 縮減的
        return x >= 0 && (new StringBuilder().append(x).toString())
                .equals(new StringBuilder().append(x).reverse().toString());

    }
}
