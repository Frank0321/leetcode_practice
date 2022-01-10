package com.example.leetcode_practice.Interview.univ;

/**
 * FileName : ExceptionTest
 * CreatTime : 2022/1/10
 * Author : Frank.Chang
 * Description :
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 10, 9, -1};
        String message = "";
        for (int i : arr) {
            try {
                message = testMessage(i);
            }catch (Exception e){
                message = "error";
            }
            System.out.println(message);
        }
    }

    private static String testMessage(int i) throws Exception {
        try {
            if(i > 10){
                return "message"+i;
            }else if (i < 10){
                throw new Exception();
            }
        }catch (Exception e){
            throw e;
        }finally {
            if (i < 0){
                return "i<0";
            }
        }
        return "finish";
    }
}
