package com.example.leetcode_practice.Interview.ExtendsExp;

/**
 * FileName : Parent
 * CreatTime : 2022/1/11
 * Author : Frank.Chang
 * Description :
 */
public class Parent {
    static String staticWord = "Parent_static";
    static final String finalWord = "Parent_final";
    public static void staticMethod(){
        System.out.println("Parent staticMethod run");
    }
    public void method(){
        System.out.println("Parent method run");
    }
}
