package com.example.leetcode_practice.Easy.e28_ImplementstrStr;

public class Frank_211021 {

  public static void main(String[] args) {
    System.out.println(strStr("aaaaa", "bba"));
  }

  public static int strStr(String haystack, String needle){
    if (needle.length() == 0){
      return 0;
    }else {
      return haystack.indexOf(needle);
    }

  }
}
