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
        String D = new String("test");
        String E = A;


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
        System.out.println("==========");
        System.out.println(A == E);
        System.out.println(A.equals(E));
        System.out.println(C == D);
        System.out.println(C.equals(D));


        String F = null;
        String G = "null";

        System.out.println("======other=====");
        try {
            System.out.println(F.equals(G));
        }catch (NullPointerException e){
            System.out.println("Exception");
        }finally {
            System.out.println("finally");
        }
    }
}
