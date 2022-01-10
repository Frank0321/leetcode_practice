package com.example.leetcode_practice.Interview.ExtendsExp;

/**
 * FileName : Son
 * CreatTime : 2022/1/11
 * Author : Frank.Chang
 * Description :
 */
public class Son extends Parent{
    static String staticWord = "Son_static";
    static final String staticFinalWord = "Son_Static_final";
    final String finalWord = "Son_final";
    public static void staticMethod(){
        System.out.println("Son staticMethod run");
    }
    public void method(){
        System.out.println("Son method run");
    }
}
