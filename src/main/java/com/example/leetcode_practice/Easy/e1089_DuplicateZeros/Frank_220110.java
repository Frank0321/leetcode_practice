package com.example.leetcode_practice.Easy.e1089_DuplicateZeros;

import java.util.Arrays;

/**
 * FileName : Frank_220110
 * CreatTime : 2022/1/10
 * Author : Frank.Chang
 * Description :
 */
public class Frank_220110 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        duplicateZeros(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                moveZero(arr, i);
                i++;
            }
        }
    }

    /**
     * 獎每次遇到 0 要改變陣列的方法抽出來
     * @param arr
     * @param i
     */
    private static void moveZero(int[] arr, int i) {
        try {
            int temp = arr[i+1];
            arr[i+1] = 0;
            for (int j = i+2; j < arr.length; j++) {
                int next = arr[j];
                arr[j] = temp;
                temp = next;
            }
        }catch (Exception e){

        }
    }


}
