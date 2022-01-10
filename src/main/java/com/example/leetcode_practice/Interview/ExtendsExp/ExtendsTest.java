package com.example.leetcode_practice.Interview.ExtendsExp;

/**
 * FileName : ExtendsTest
 * CreatTime : 2022/1/11
 * Author : Frank.Chang
 * Description : 測試繼承時，靜態方法會如何執行
 */
public class ExtendsTest {
    public static void main(String[] args) {
        /**
         * static 無法被繼承
         */
        Parent child = new Son();
        System.out.println(child.staticWord);
        System.out.println(child.staticFinalWord);
        System.out.println(child.finalWord);
        child.staticMethod();
        child.method();

        System.out.println("===========================");

        Son son = new Son();
        System.out.println(son.staticWord);
        System.out.println(son.staticFinalWord);
        System.out.println(son.finalWord);
        son.staticMethod();
        son.method();
    }
}
