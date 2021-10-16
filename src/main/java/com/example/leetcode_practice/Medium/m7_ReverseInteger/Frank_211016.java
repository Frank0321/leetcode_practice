package com.example.leetcode_practice.Medium.m7_ReverseInteger;

public class Frank_211016 {

    public static void main (String[] args){
        int num = 123;
        System.out.println(reverse(num));
    }

    /**
     * 1. 先取出負號，並轉成正數
     * 2. 將數字用 StringBuilder 包起來，並反轉，最後以文字呈顯
     * 3. 轉換成數字，如果有負號，就還回去
     * 4. 轉換時，可能會超過 int 的極限，要用 try catch 包起來
     */
    public static int reverse(int x){
        boolean sign = true;
        if (x< 0){
            sign = false;
            x *= -1;
        }

        String s = new StringBuilder()
                .append(x)
                .reverse()
                .toString();
        try {
            int result = Integer.parseInt(s);
            if (!sign){
                result *= -1;
            }
            return result;
        } catch (NumberFormatException e) {
            return 0;
        }

    }
}
