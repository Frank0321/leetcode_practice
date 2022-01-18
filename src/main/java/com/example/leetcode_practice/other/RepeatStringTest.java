package com.example.leetcode_practice.other;

/**
 * FileName : Test
 * CreatTime : 2022/1/18
 * Author : Frank.Chang
 * Description :
 */
public class RepeatStringTest {
    public static void main(String[] args) {
        String word = "蓋世英雄蓋世英雄蓋世英雄";
        System.out.println(repeatNumber(word));
    }

    /**
     * target 為重複的字元
     * 如果 word 皆由 target 組成 => target 可以整除 word 的長度 (餘數 n)
     * 將 target 累加 n 次，比較是否一致，是回傳 n
     * @return
     */
    private static int repeatNumber(String word) {
        int result = 1;
        for (int i = 1 ; i < word.length(); i++) {
            String target = word.substring(0, i);
            if (word.length()%target.length() == 0){
                int num = word.length()/target.length();
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < num; j++){
                    sb.append(target);
                }
                if (sb.toString().equals(word)){
                    return num;
                }
            }
        }
        return result;
    }
}
