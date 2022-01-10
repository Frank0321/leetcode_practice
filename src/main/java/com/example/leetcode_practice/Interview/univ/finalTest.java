package com.example.leetcode_practice.Interview.univ;

/**
 * FileName : finalTest
 * CreatTime : 2022/1/10
 * Author : Frank.Chang
 * Description :
 */
public class finalTest {
    public static void main(String[] args) {
        X x = new Y();
        System.out.println(x.word);
    }
}

class X {
    final static String word = "X_word";
}

class Y extends X{
    final static String word = "Y_word";
}