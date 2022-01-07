package com.example.leetcode_practice.other.StringTest;

/**
 * FileName : StringTest
 * CreatTime : 2022/1/7
 * Author : Frank.Chang
 * Description :
 */
public class StringTest {
    public static void main(String[] args) {
        String A = "test";
        String B = "test";
        String C = new String("test");

        System.out.println(A == B);
        System.out.println(A == C);       //f
        System.out.println(B == C);       //f
        System.out.println("-----");
        System.out.println(A.equals(B));  //t
        System.out.println(A.equals(C));  //t
        System.out.println(B.equals(C));  //t
        System.out.println("-----");
        System.out.println(A == "test");  //t
        System.out.println(B == "test");  //t
        System.out.println(C == "test");  //f
        System.out.println("-----");
        System.out.println(A.equals("test"));
        System.out.println(B.equals("test"));
        System.out.println(C.equals("test"));

        String D = null;
        String E = "null";

        try {
            System.out.println(D.equals(E));
        }catch (NullPointerException e){
            System.out.println("Exception");
        }finally {
            System.out.println("finally");
        }
    }
}
