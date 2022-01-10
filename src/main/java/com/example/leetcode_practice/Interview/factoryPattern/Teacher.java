package com.example.leetcode_practice.Interview.factoryPattern;

/**
 * FileName : Teacher
 * CreatTime : 2022/1/11
 * Author : Frank.Chang
 * Description :
 */
public class Teacher implements Person{
    static final String word = "T";
    @Override
    public String sayHi() {
        return "Hi I am teacher";
    }
}
