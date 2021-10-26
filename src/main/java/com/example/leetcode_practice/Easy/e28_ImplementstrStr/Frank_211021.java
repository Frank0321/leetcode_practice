package com.example.leetcode_practice.Easy.e28_ImplementstrStr;

public class Frank_211021 {

  public static void main(String[] args) {
    System.out.println(strStr("aaaaa", "bba"));
  }

  /**
   * 如果目標文字不是空白，就回傳目標文字在字串中的位置
   */
  public static int strStr(String haystack, String needle){
    if (needle.length() == 0){
      return 0;
    }else {
      return haystack.indexOf(needle);
    }

  }

  public static void test(){

  }
}
