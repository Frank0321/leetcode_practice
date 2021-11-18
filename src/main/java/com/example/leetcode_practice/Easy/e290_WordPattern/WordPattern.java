package com.example.leetcode_practice.Easy.e290_WordPattern;

import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.HashMap;

public class WordPattern {

  public static void main(String[] args) {
    String pattern = "abba";
    String s = "dog cat cat dog";
    System.out.println(wordPattern(pattern, s));
  }

  /**
   * 先將兩串文字分開
   * 1. 長度不一樣就先回傳 false
   * 2. 組成 key value
   * 3. 如果有這個 key，則比較 value 是否一樣，不一樣 => false
   * 4. 如果沒有 key ，就確定這一個 value 有沒有在 map.values 裡面，有 => false
   */
  private static boolean wordPattern(String pattern, String s) {
    String[] patternArr = pattern.split("");
    String[] stringsArr = s.split(" ");
    if (patternArr.length != stringsArr.length){
      return false;
    }
    HashMap<String, String> map = new HashMap<>();
    for (int i = 0; i < patternArr.length; i++) {
      if (map.containsKey(patternArr[i])){
        if (!map.get(patternArr[i]).equals(stringsArr[i])){
          return false;
        }
      }else {
        for (String value : map.values()) {
          if (value.equals(stringsArr[i])){
            return false;
          }
        }
        map.put(patternArr[i], stringsArr[i]);
      }
    }

    return true;
  }

}
