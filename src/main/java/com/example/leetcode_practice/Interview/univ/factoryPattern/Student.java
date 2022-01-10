package com.example.leetcode_practice.Interview.univ.factoryPattern;

/**
 * FileName : Student
 * CreatTime : 2022/1/11
 * Author : Frank.Chang
 * Description :
 */
public class Student implements Person{
    static final String word = "S";
    @Override
    public String sayHi() {
        return "Hi I am Student";
    }
}
